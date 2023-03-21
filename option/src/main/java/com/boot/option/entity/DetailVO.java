package com.boot.option.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity(name = "detail")
@Table(name ="T_DTA")
@SequenceGenerator(name = "TODO_SEQ_DETAIL", initialValue = 1, allocationSize = 1)
public class DetailVO {

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "TODO_SEQ_DETAIL" )
	private Long dtId;
	
	@JoinColumn(name = "PRD_CD")
	private Long prdCd;
	
	private String optSize;
	private String sizeCode;
	
	private String optColor;
	private String colorCode;
	
}
