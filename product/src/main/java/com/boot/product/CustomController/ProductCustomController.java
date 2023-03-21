package com.boot.product.CustomController;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.boot.product.CustomService.ProductCustomService;
import com.boot.product.ProductService.CategoryService;
import com.boot.product.ProductService.ProductService;
import com.boot.product.dto.in.ProductConditonDto;
import com.boot.product.dto.out.PrdCatDto;
import com.boot.product.dto.out.ProductDto;
import com.boot.product.entity.CategoryVo;
import com.boot.product.entity.ProductVo;

import lombok.extern.slf4j.Slf4j;

@RestController
@Slf4j
public class ProductCustomController {

	@Autowired
	ProductCustomService productCustomService;

	
	@GetMapping("/custom/{id}")
	public ProductDto selectProductInfo(@PathVariable("id") Long id){
		ProductDto result = productCustomService.selectProductInfo(id);
		
		return result;
	}
	
	
	@GetMapping("/test/{id}")
	public List<PrdCatDto> selectAllInfo(@PathVariable("id") Long id){
		List<PrdCatDto> result = productCustomService.selectAllInfo(id);
		
		return result;
	}
	
	@GetMapping("/prddto/{id}")
	public List<ProductVo> selectOptionByDTO(@RequestBody ProductConditonDto pcd){
		List<ProductVo> result = productCustomService.selectProductsVOs(pcd);
		return result;
	}
	

}
