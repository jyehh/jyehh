package com.boot.product.ProductService;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.boot.product.dto.out.ProductDto;
import com.boot.product.entity.ProductVo;
import com.boot.product.repository.ProductRepository;

@Service
public class ProductService {

	@Autowired
	ProductRepository productRepository;
	
	//다건조회
	public List<ProductVo> selectProductVo(){
		/*
		 * ProductVo prdVo = new ProductVo(); ProductDto prdDto = new ProductDto();
		 * prdVo.setPrdNm("testest"); prdVo.setStock(20); prdVo.setCategory1("테스트1");
		 * prdVo.setCategory2("테스트2");
		 * 
		 * productRepository.save(prdVo);
		 */
		/*
		 * ProductVo prdinfo = new ProductVo();
		 * 
		 * prdinfo.setPrdNm("상품테스트"); prdinfo.setStock(10);
		 * 
		 * productRepository.save(prdinfo);
		 */
		List<ProductVo> info = productRepository.findAll();
		return info;
	}
	
	//단건조회
	public Optional<ProductVo> selectProductById(Long id){
		
		Optional<ProductVo> info = productRepository.findById(id);
		return info;
	}
	
	//prdcd 가 있으면 update 없으면 insert
	public List<ProductVo> upsertProductVo(ProductVo productVo){
		
			ProductVo prdvo = new ProductVo();
			prdvo.setPrdCd(productVo.getPrdCd());
			prdvo.setPrdNm(productVo.getPrdNm());
			prdvo.setStock(productVo.getStock());
			prdvo.setCategory1(productVo.getCategory1());
			prdvo.setCategory2(productVo.getCategory2());
			productRepository.save(prdvo);
		
		return null;
	}
	
}

