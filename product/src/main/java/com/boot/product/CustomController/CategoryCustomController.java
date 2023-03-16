package com.boot.product.CustomController;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.boot.product.CustomService.CategoryCustomService;
import com.boot.product.dto.out.CategoryDto;

import lombok.extern.slf4j.Slf4j;

@RestController
@Slf4j
public class CategoryCustomController {

	@Autowired
	CategoryCustomService categoryCustomService;
	
	@GetMapping("/catcustom/{id}")
	public CategoryDto selectCategoryInfo(@PathVariable("id") Long id) {
		CategoryDto result = categoryCustomService.selectCategoryInfo(id);
		
		return result;
		
	}
}
