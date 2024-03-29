package com.boot.product.entity;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.SequenceGenerator;

import org.hibernate.annotations.Cascade;
import org.hibernate.annotations.CascadeType;

import com.fasterxml.jackson.annotation.JsonIgnore;

import lombok.Data;

@Data
@Entity(name ="T_PRD")
@SequenceGenerator(name = "TODO_SEQ_GENERATOR", initialValue = 1, allocationSize = 1)
public class ProductVo {

	@Id 
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "TODO_SEQ_GENERATOR" )
	private Long prdCd;
	
	private String prdNm;
	
	private int stock;
	
	private String category1;
	
	private String category2;
	
	@OneToMany(mappedBy = "product" )
	@JsonIgnore
	private List<CategoryVo> categories;

	
}
