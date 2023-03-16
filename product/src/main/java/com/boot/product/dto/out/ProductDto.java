package com.boot.product.dto.out;

import lombok.Data;

@Data
public class ProductDto {
	
	private Long prdCd;
	private String prdNm;
	private int stock;
	private String category1;
	private String category2;
}
