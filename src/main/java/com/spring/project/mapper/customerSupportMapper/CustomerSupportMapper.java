package com.spring.project.mapper.customerSupportMapper;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import com.spring.project.domain.CustomerSupportVO;

@Mapper
public interface CustomerSupportMapper {
	
	@Select("insert into tbl_qna (title, writer, addr, phonenumber, email, content, qcno) values (#{title}, #{writer}, #{addr}, #{phonenumber}, #{email}, #{content}, #{qcno})")
	public void insertQuestion(CustomerSupportVO customerSupportVO);
}