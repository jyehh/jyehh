package com.boot.product.repository.impl;

import java.util.List;

import javax.persistence.EntityManager;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.boot.product.dto.out.PrdCatDto;
import com.boot.product.dto.out.ProductDto;
import com.boot.product.entity.CategoryVo;
import com.boot.product.entity.ProductVo;

import lombok.extern.slf4j.Slf4j;

@Repository
@Slf4j
public class ProductCustomRepository {

	@Autowired
	EntityManager em;
	
	public ProductDto selectProductInfo(Long prductId) {
		
		String sql = "select p from T_PRD p where p.prdCd = :prductId";
		
		List<ProductVo> result = em.createQuery(sql)
		.setParameter("prductId", prductId)
		.getResultList();
		
		ProductVo pvo =  result.get(0);
		ProductDto returnDto = new ProductDto();
		returnDto.setPrdCd(pvo.getPrdCd());
		returnDto.setPrdNm(pvo.getPrdNm());
		returnDto.setStock(pvo.getStock());
		returnDto.setCategory1(pvo.getCategory1());
		returnDto.setCategory2(pvo.getCategory2());
		
		return returnDto;
		
	}
	
	public List<PrdCatDto> selectAllInfo(Long prdCd) {
		String sql = "SELECT p.prdCd, p.prdNm, c.lrCl, c.mdCl FROM T_PRD p"
				+ " INNER JOIN T_CAT c "
				+ " ON p.prdCd = c.product"
				+ " where p.prdCd = :prdCd";
		ProductVo param = new ProductVo();
		param.setPrdCd(prdCd);
		List<PrdCatDto> result = em.createQuery(sql)
				.setParameter("prdCd", prdCd)
				.getResultList();
		
		log.info("result ={}", result);
		return result;
				
	}
	
}
