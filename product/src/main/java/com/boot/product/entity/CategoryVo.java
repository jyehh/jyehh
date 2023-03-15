package com.boot.product.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;

import lombok.Data;

@Data
@Entity(name ="T_CAT")
@SequenceGenerator(name = "TODO_SEQ_CATEGORY", initialValue = 1, allocationSize = 1)
public class CategoryVo {

	@Id @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "TODO_SEQ_CATEGORY" )
	private Long caId;
	private Long prdCd;
	private String prdNm;
	private String lrCl;; //대분류
	private String mdCl; //중분류
	private String smCl; //소분류
	
}
