package com.boot.product.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.boot.product.entity.ProductVo;


@Repository
public interface ProductRepository extends JpaRepository<ProductVo, Long>{

}
