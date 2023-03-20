package com.boot.option.controller;

import java.util.List;
import java.util.Optional;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.boot.option.dto.in.OptionConditionDto;
import com.boot.option.dto.out.OptionDto;
import com.boot.option.entity.OptionVO;
import com.boot.option.service.OptionService;

import lombok.extern.slf4j.Slf4j;

@RestController
@Slf4j
public class OptionController {

	@Autowired
	OptionService optionService;
	
	@GetMapping("/option")
	public List<OptionVO> selectOptionVO(){
		List<OptionVO> result = optionService.selectOptionVO();
		return result;
	}

	@GetMapping("/option/{id}")
	public Optional<OptionVO> selectOptionVO(@PathVariable("id") Long id){
		Optional<OptionVO> result = optionService.selectOptionById(id);
		return result;
	}
	
	@GetMapping("/option/dto/{id}")
	public List<OptionVO> selectOptionByDTO(@RequestBody OptionConditionDto cond){
		List<OptionVO> result = optionService.selectOptionByDTO(cond);
		return result;
	}
	
	@PostMapping("/option/{id}")
	public List<OptionVO> upsertOptionVO(@RequestBody OptionDto optDto){
		List<OptionVO> result = optionService.upsertOptionVO(optDto);
		return result;
	}
}
