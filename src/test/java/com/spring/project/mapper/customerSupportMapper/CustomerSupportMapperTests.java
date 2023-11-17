package com.spring.project.mapper.customerSupportMapper;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.spring.project.domain.CustomerSupportVO;

import lombok.extern.log4j.Log4j2;

@Log4j2
@SpringBootTest
public class CustomerSupportMapperTests {
	
	@Autowired
	private CustomerSupportMapper customerSupportMapper;
	
	// 테스트 성공
	@Test
	public void assertSuccessTest() {
		int result = 3;
		
		assertEquals(3, result);
		
	}
	
	@Test
	public void testMap1per() {
		log.info(customerSupportMapper);
	}
	
	@Test
	public void insertTest() {
		CustomerSupportVO customerSupportVO = CustomerSupportVO.builder()
				.title("test2").writer("test2").addr("test2")
				.phonenumber("test1").email("test1").content("test1").qcno(3l)
				.build();
		log.info(customerSupportVO);
		customerSupportMapper.insertQuestion(customerSupportVO);
	}
}
