package com.spring.project.mapper;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.spring.project.domain.ProAttachVO;

import lombok.extern.log4j.Log4j2;

@Log4j2
@SpringBootTest
public class ProductAttachTests {
	
	@Autowired
	ProAttachMapper attachMapper;
	
	@Test
	public void attachInsertTest() {
		ProAttachVO attachVO = ProAttachVO.builder()
				.uuid("1234")
				.origin("testorigin")
				.path("testpath")
				.pno(5L)
				.build();
		attachMapper.insert(attachVO);
		log.info(attachVO);
	}
	
	@Test
	public void getAttatchListTest() {
		log.info(attachMapper.getAttatchList());
	}
	
	@Test
	public void findByPnoTest() {
		log.info(attachMapper.findByPno(4L));
	}
	
	@Test
	public void deleteByPnoTest() {
		attachMapper.deleteAll(4L);
		log.info(attachMapper.getAttatchList());
	}
	
	@Test
	public void attachDeleteTest() {
		attachMapper.delete("1234");
		log.info(attachMapper.getAttatchList());
	}

}
