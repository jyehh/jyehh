package com.boot.product.dto.out;

import com.boot.product.entity.ProductVo;

import lombok.Data;

@Data
public class CategoryDto {
	
	private Long caId;
	private ProductVo product;
	private String prdNm;
	private String lrCl;
	private String mdCl;
	private String smCl;
}
