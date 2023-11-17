package com.spring.project.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import com.spring.project.domain.SupportVO;

@Mapper
public interface SupportMapper {
	
	@Select("insert into tbl_qna (title, writer, addr, phonenumber, email, content, qcno) values (#{title}, #{writer}, #{addr}, #{phonenumber}, #{email}, #{content}, #{qcno})")
	public void insertQuestion(SupportVO customerSupportVO);
}