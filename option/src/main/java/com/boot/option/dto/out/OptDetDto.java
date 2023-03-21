package com.boot.option.dto.out;

import javax.persistence.JoinColumn;

import lombok.Data;

@Data
public class OptDetDto {
	private Long prdCd;
	
	private String optSize;
	private String sizeCode;
	
	private String optColor;
	private String colorCode;
}
