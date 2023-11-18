package com.spring.project.service;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.spring.project.domain.MemberVO;

import lombok.extern.log4j.Log4j2;

@Log4j2
@SpringBootTest
public class MemberServiceTests {
	
	@Autowired
	private MemberService service = MemberService.getInstance();
	
	@Test
	public void register() {
		MemberVO vo = new MemberVO();
		vo.setId("test");
		vo.setPw("1234");
		vo.setGrade(1);
		vo.setEmail("email");
		vo.setName("야호");
		vo.setTel("010");
		
		service.register(vo);
	}
	
	@Test
	public void List() {
		log.info(service.getList());
	}
	
	@Test
	public void get() {
		log.info(service.findBy("jung"));
	}
	
	
	@Test
	public void modify() {
		MemberVO vo = service.findBy("jung");
		vo.setEmail("email");
		vo.setTel("0101");
		vo.setAddr("바뀌는건가?");
		vo.setName("룰루랄라");
		service.modify(vo);
	}
	
	@Test
	public void modifyPw() {
		service.modifyPw("jung", "1234567890");
	}
}
