package com.spring.project.service;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.spring.project.domain.SupportVO;
import com.spring.project.mapper.SupportMapperTests;
import com.spring.project.service.SupportService;

import lombok.extern.log4j.Log4j2;

@Log4j2
@SpringBootTest
public class SupportServiceTests {
	
	@Autowired
	private SupportService customerSupportService = SupportService.getCustomerSupportService();
	
	// 무조건 실패하는 코드
	@Test
	public void assertFailuresTest() {
		assertEquals(1, -1);
	}
	
	// 무조건 성공하는 코드(logging, test 확인용)
	@Test
	public void assertSuccessTest() {
		int result = 3;
		log.info(result);
		assertEquals(3, result);
	}
	
	// 서비스 연결 테스트
	@Test
	public void serviceest() {
		log.info(customerSupportService);
	}
	
	@Test
	public void addQuestionTest() {
		SupportVO customerSupportVO = SupportVO.builder()
			    .title("test2")
			    .writer("test2")
			    .abode("test2")
			    .phone1("010")
			    .phone2("234")
			    .phone3("4444")
			    .email("test1")
			    .content("test1")
			    .questionSelect("3")
			    .build();
		log.info(customerSupportVO.getAbode());
		log.info(customerSupportVO.getAddr()); // null
		customerSupportService.addQuestion(customerSupportVO);
	}
}
