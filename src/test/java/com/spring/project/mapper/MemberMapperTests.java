package com.spring.project.mapper;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.spring.project.domain.MemberVO;

import lombok.extern.log4j.Log4j2;

@Log4j2
@SpringBootTest
public class MemberMapperTests {
	
	@Autowired
	private MemberMapper mapper;
	
	@Test
	public void getList() {
		log.info(mapper.list());
	}
	
	@Test
	public void insert() {
		MemberVO vo = new MemberVO();
		vo.setId("test");
		vo.setPw("1234");
		vo.setGrade(1);
		vo.setEmail("test@test");
		vo.setAddr("test");
		vo.setName("test");
		vo.setTel("1234");
		mapper.insert(vo);
		log.info(vo);
	}
	
	@Test
	public void delete() {
		mapper.delete("test");
	}
	
	@Test
	public void get() {
		MemberVO vo = mapper.get("jung");
		log.info(vo);
	}
	
	@Test
	public void update() {
		MemberVO vo = mapper.get("jung");
		vo.setName("배고파");
		mapper.update(vo);
	}
	
	@Test
	public void updatePw() {
		mapper.updatePw("giro", "12344555555");
	}
}
