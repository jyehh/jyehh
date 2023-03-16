package com.boot.product.CustomService;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;

import com.boot.product.dto.out.CategoryDto;
import com.boot.product.dto.out.ProductDto;
import com.boot.product.entity.ProductVo;
import com.boot.product.repository.impl.CategoryCustomRepository;
import com.boot.product.repository.impl.ProductCustomRepository;

@Service
public class CategoryCustomService {
	@Autowired
	CategoryCustomRepository categoryCustomRepository;
	
	public CategoryDto selectCategoryInfo(Long catId){
		CategoryDto result = categoryCustomRepository.selectCategoryInfo(catId);
		
		return result;
	}
	
	
}