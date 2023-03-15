package com.boot.product.ProductService;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.boot.product.entity.CategoryVo;
import com.boot.product.entity.ProductDto;
import com.boot.product.entity.ProductVo;
import com.boot.product.repository.CategoryRepository;
import com.boot.product.repository.ProductRepository;

@Service
public class CategoryService {

	@Autowired
	CategoryRepository categoryRepository;
	
	//다건조회
	public List<CategoryVo> selectCategoryVo(){
		/*
		 * ProductVo prdVo = new ProductVo(); ProductDto prdDto = new ProductDto();
		 * prdVo.setPrdNm("testest"); prdVo.setStock(20); prdVo.setCategory1("테스트1");
		 * prdVo.setCategory2("테스트2");
		 * 
		 * productRepository.save(prdVo);
		 */
		/*
		 * ProductVo prdinfo = new ProductVo();
		 * 
		 * prdinfo.setPrdNm("상품테스트"); prdinfo.setStock(10);
		 * 
		 * productRepository.save(prdinfo);
		 */
		List<CategoryVo> info = categoryRepository.findAll();
		return info;
	}
	
	//단건조회
	public Optional<CategoryVo> selectCategoryById(Long id){
		
		Optional<CategoryVo> info = categoryRepository.findById(id);
		return info;
	}
	
	//prdcd 가 있으면 update 없으면 insert
	public List<CategoryVo> upsertCategoryVo(CategoryVo categoryVo){
		
		CategoryVo catvo = new CategoryVo();
		catvo.setCaId(categoryVo.getCaId());
		catvo.setPrdCd(categoryVo.getPrdCd());
		catvo.setPrdNm(categoryVo.getPrdNm());
		catvo.setLrCl(categoryVo.getLrCl());
		catvo.setMdCl(categoryVo.getMdCl());
		catvo.setSmCl(categoryVo.getSmCl());
		categoryRepository.save(catvo);
		
		return null;
	}
	
}

