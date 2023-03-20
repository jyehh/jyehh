package com.boot.option.dto.in;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class OptionConditionDto {

	private Long prdCd;
	
	private String optSize;
	private String optColor;
	
}
