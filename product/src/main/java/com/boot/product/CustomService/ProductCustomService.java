package com.boot.product.CustomService;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;

import com.boot.product.dto.out.PrdCatDto;
import com.boot.product.dto.out.ProductDto;
import com.boot.product.entity.ProductVo;
import com.boot.product.repository.impl.ProductCustomRepository;

@Service
public class ProductCustomService {
	@Autowired
	ProductCustomRepository productCustomRepository;
	
	public ProductDto selectProductInfo(Long prductId){
		ProductDto result = productCustomRepository.selectProductInfo(prductId);
		
		return result;
	}
	
	public List<PrdCatDto> selectAllInfo(Long PrdCd) {
		List<PrdCatDto> result = productCustomRepository.selectAllInfo(PrdCd);
		
		return result;
	}
	
	
}