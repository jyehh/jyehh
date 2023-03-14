package com.boot.product.ProductService;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.boot.product.entity.ProductVo;
import com.boot.product.repository.ProductRepository;

@Service
public class ProductService {

	@Autowired
	ProductRepository productRepository;
	
	//다건조회
	public List<ProductVo> selectProductVo(){
	
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
	
	
	public Optional<ProductVo> insertProductVo(Long id){
		
		Optional<ProductVo> info = productRepository.findById(id);
		ProductVo prdVo = new ProductVo();

		if(info == null) {
			ProductVo prdinfo = new ProductVo();
			prdinfo.setPrdCd(id);
			prdinfo.setPrdNm(prdVo.getPrdNm());
			prdinfo.setStock(prdVo.getStock());
			productRepository.save(prdinfo);
		}
		
		return null;
	}
	
	public Optional<ProductVo> updateProductVo(Long id){
		
		ProductVo prdinfo = new ProductVo();
		
		productRepository.save(prdinfo);
		
		Optional<ProductVo> info = productRepository.findById(id);
		return info;
	}


}
