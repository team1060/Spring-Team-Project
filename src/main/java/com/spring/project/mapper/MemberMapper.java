package com.spring.project.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.spring.project.domain.MemberVO;

public interface MemberMapper {
	
	int insert(MemberVO vo);
	boolean delete(String id);
	int update(MemberVO vo);
	int updatePw(String pw);
	// 1개조회
	MemberVO get(String id);
	
	List<MemberVO> list();
	MemberVO login(@Param("id") String id, @Param("pw") String pw);
	
	// 권한 
	int insertAuth();
}
