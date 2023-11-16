package com.spring.project.mapper.customerSupportMapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import com.spring.project.domain.CustomerSupportVO;

@Mapper
public interface CustomerSupportMapper {
	
	@Select("")
	public void insertQuestion(CustomerSupportVO customerSupportVO);
}
