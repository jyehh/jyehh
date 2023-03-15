package com.boot.product.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.boot.product.entity.CategoryVo;
import com.boot.product.entity.ProductVo;


@Repository
public interface CategoryRepository extends JpaRepository<CategoryVo, Long>{

}
