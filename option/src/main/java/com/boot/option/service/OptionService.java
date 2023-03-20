package com.boot.option.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.boot.option.dto.in.OptionConditionDto;
import com.boot.option.dto.out.OptionDto;
import com.boot.option.entity.OptionVO;
import com.boot.option.repository.OptionJpaRepository;
import com.boot.option.repository.OptionRepository;

@Service
public class OptionService {

	@Autowired
	OptionJpaRepository optionJpaRepository;
	
	@Autowired
	OptionRepository optionRepository; 
	
	public List<OptionVO> selectOptionVO(){
		List<OptionVO> list = optionJpaRepository.findAll();
		return list;
	}
	
	public Optional<OptionVO> selectOptionById(Long id){
		Optional<OptionVO> list = optionJpaRepository.findById(id);
		return list;
	}
	
	//DD
	public List<OptionVO> selectOptionByDTO(OptionConditionDto cond){
		List<OptionVO> list = optionRepository.selectOptionVOs(cond);
		return list;
	}

	
	public List<OptionVO> upsertOptionVO(OptionDto optDto){
		
		OptionVO optVo = new OptionVO();
		optVo.setOpId(optDto.getOpId());
		optVo.setPrdCd(optDto.getPrdCd());
		optVo.setOptColor(optDto.getOptColor());
		optVo.setOptSize(optDto.getOptSize());
		optionJpaRepository.save(optVo);
		
		return null;
	}
}
