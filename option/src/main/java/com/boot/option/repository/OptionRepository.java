package com.boot.option.repository;

import java.util.List;

import javax.persistence.EntityManager;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.boot.option.dto.in.OptionConditionDto;
import com.boot.option.entity.OptionVO;
import com.boot.option.entity.QOptionVO;
import com.querydsl.core.BooleanBuilder;
import com.querydsl.core.types.dsl.BooleanExpression;
import com.querydsl.jpa.impl.JPAQueryFactory;

import static com.boot.option.entity.QOptionVO.optionVO;

@Repository
public class OptionRepository {
	
	@Autowired
	private EntityManager em;
	
	private JPAQueryFactory query;
	
	public OptionRepository(EntityManager em) {
		this.query = new JPAQueryFactory(em);
	}
	

	public List<OptionVO> selectOptionVOs(OptionConditionDto cond){
		
		//cond.getPrdCd(), cond.getOptColor(), cond.getOptSize()
		
		List<OptionVO> result = query
				.select(optionVO)
				.from(optionVO)
				.where(optionSizeChek(cond).and(optionColorCheck(cond)))
				.fetch();
		
		return result;
	}


	private BooleanExpression optionColorCheck(OptionConditionDto cond) {
		
		if(cond.getOptColor() != null) {
			return optionVO.optColor.eq(cond.getOptColor());
		}
		return null;
	}


	private BooleanExpression optionSizeChek(OptionConditionDto cond) {
		if(cond.getOptColor() != null) {
			return optionVO.optSize.eq(cond.getOptSize());
		}
		return null;
	}
	
}
