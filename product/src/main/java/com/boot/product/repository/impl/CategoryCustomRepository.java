package com.boot.product.repository.impl;

import java.util.List;

import javax.persistence.EntityManager;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.boot.product.dto.out.CategoryDto;
import com.boot.product.entity.CategoryVo;

@Repository
public class CategoryCustomRepository {

	@Autowired
	EntityManager em;
	
	public CategoryDto selectCategoryInfo(Long catId) {
		
		String sql = "select c from T_CAT c where c.caId = :catId";
		
		List<CategoryVo> result = em.createQuery(sql)
		.setParameter("catId", catId)
		.getResultList();
		
		CategoryVo cat =  result.get(0);
		CategoryDto returnDto = new CategoryDto();
		returnDto.setCaId(cat.getCaId());
		//returnDto.setPrdCd(cat.getPrdCd());
		returnDto.setPrdNm(cat.getPrdNm());
		returnDto.setLrCl(cat.getLrCl());
		returnDto.setMdCl(cat.getMdCl());
		returnDto.setSmCl(cat.getSmCl());
		return returnDto;
		
	}
	
}
