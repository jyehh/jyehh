package com.boot.product.repository.impl;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.boot.product.dto.out.CategoryDto;

@SpringBootTest
class CategoryCustomRepositoryTest {

	@Autowired
	CategoryCustomRepository categoryCustomRepository;
	
	@Test
	void testSelectCategoryInfo() {
	CategoryDto result = categoryCustomRepository.selectCategoryInfo(1L);
	assertThat(result.getCaId()).isEqualTo(1);
//	assertThat(result.getPrdCd()).isEqualTo(324);
	assertThat(result.getPrdNm()).isEqualTo("테스트3");
	assertThat(result.getLrCl()).isEqualTo("a");
	assertThat(result.getMdCl()).isEqualTo("b");
	assertThat(result.getSmCl()).isEqualTo("c");
		
		
	}

}
