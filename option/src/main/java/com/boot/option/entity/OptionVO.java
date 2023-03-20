package com.boot.option.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity(name = "option")
@Table(name ="T_OPT")
@SequenceGenerator(name = "TODO_SEQ_OPTION", initialValue = 1, allocationSize = 1)
public class OptionVO {

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "TODO_SEQ_OPTION" )
	private Long opId;
	
	private Long prdCd;
	
	private String optSize;
	private String optColor;
	
}
