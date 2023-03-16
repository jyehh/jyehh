package com.boot.product.repository.impl;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.boot.product.dto.out.ProductDto;

@SpringBootTest
class ProductCustomRepositoryTest {

	@Autowired
	ProductCustomRepository customRepository;
	
	@Test
	void test() {
		ProductDto result =  customRepository.selectProductInfo(131L);
		assertThat(result.getPrdNm()).isNotNull();
		assertThat(result.getPrdCd()).isEqualTo(131);
		assertThat(result.getPrdNm()).isEqualTo("상품테스트");
		assertThat(result.getStock()).isEqualTo(10);
	}

}
