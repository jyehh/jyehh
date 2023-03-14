package com.boot.product.controller;

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

import com.boot.product.ProductService.ProductService;
import com.boot.product.entity.ProductDto;
import com.boot.product.entity.ProductVo;

import lombok.extern.slf4j.Slf4j;

@RestController
@Slf4j
public class ProductController {

	@Autowired
	ProductService productService;

	
	@GetMapping("/product")
	public List<ProductVo>  selectProductList() {
		List<ProductVo> result = productService.selectProductVo();
		return result;
	}
	
	@GetMapping("/product/{id}")
	public Optional<ProductVo> selectProductById(@PathVariable("id") Long id) {
		Optional<ProductVo> result = productService.selectProductById(id);
		return result;
	}
	
	/*
	 * @GetMapping("/product/{id}") public ProductVo
	 * selectProductById(@PathVariable("id") Long id, @RequestParam(value ="key",
	 * required = false) String key) {
	 * 
	 * List<ProductVo> result = productService.selectProductById(id); ProductVo
	 * productVo = new ProductVo(); productVo.setPrdCd(id);
	 * productVo.setPrdNm("테스트상품1"); productVo.setStock(20); log.debug("key = " +
	 * key); return productVo;
	 * }
	 */
	
	
	@PostMapping("/product")
	public Optional<ProductVo> insertProduct(@PathVariable("id") Long id) {
		Optional<ProductVo> result = productService.insertProductVo(id);

		log.debug("insert");
		return result;
	}

	
	@PostMapping("/product/{id}")
	public ProductVo updateProduct(@RequestBody ProductDto productDto) {
		ProductVo productVo = new ProductVo();
		productVo.setPrdCd(12345L);
		productVo.setPrdNm(productDto.getPrdNm());
		productVo.setStock(productDto.getStock());
		return productVo;
	}
	

}
