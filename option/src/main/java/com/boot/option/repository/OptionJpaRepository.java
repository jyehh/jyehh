package com.boot.option.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.boot.option.entity.OptionVO;

@Repository
public interface OptionJpaRepository extends JpaRepository<OptionVO, Long>{

}
