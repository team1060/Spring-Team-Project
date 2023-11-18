package com.spring.project.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.spring.project.domain.MemberVO;
import com.spring.project.mapper.MemberMapper;

@Service
public class MemberService {
	
	@Autowired
	private MemberMapper mapper;
	
	private static MemberService instance = new MemberService();
	public static MemberService getInstance() {
		return instance;
	}
	
	
	public int register(MemberVO vo) {
		//vo.setPw();
		return mapper.insert(vo);
	}
	
	public int modify(MemberVO vo) {
		return mapper.update(vo);
	}
	
	public boolean remove(String id) {
		return mapper.delete(id);
	}
	
	public List<MemberVO> getList() {
		return mapper.list();
	}
	
	public MemberVO findBy(String id) {
		return mapper.get(id);
	}
	
	public int modifyPw(String id, String pw) {
		return mapper.updatePw(id, pw);
	}
	
}
