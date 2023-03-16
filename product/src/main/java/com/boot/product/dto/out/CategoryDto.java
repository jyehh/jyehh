package com.boot.product.dto.out;

import lombok.Data;

@Data
public class CategoryDto {
	
	private Long caId;
	private Long prdCd;
	private String prdNm;
	private String lrCl;
	private String mdCl;
	private String smCl;
}
