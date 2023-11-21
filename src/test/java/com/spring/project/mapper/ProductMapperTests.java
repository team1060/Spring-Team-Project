package com.spring.project.mapper;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.spring.project.domain.Criteria;
import com.spring.project.domain.Product;

import lombok.extern.log4j.Log4j2;

@Log4j2
@SpringBootTest
public class ProductMapperTests {
	
	@Autowired
	private ProductMapper productMapper;
	
	@Test
	public void insertTest() {
		Product product = Product.builder()
				.pname("test")
				.price("18000")
				.pcontent("testest")
				.prCategory("0")
				.nego(12.5f)
				.issell(0)
				.id("boss")
				.size(0)
				.build();
		
		log.info(product);
		productMapper.insert(product);
		
	}
	
	@Test
	public void getListTest(Criteria cri) {
		log.info(productMapper.getList(cri));
	}
	
	@Test
	public void findByPnoTest() {
		Product product = new Product();
		log.info(productMapper.findByPno(2L));
	}

	@Test
	public void modifyTest() {
		Product product = new Product();
		product.setPno(3L);
		product.setPname("test1");
		product.setPrice("15000");
		product.setPcontent("15.5f");
		product.setId("boss");
		product.setSize(0);
		
		productMapper.modify(product);
		log.info(productMapper.findByPno(1L));
	}
	
	@Test
	public void deleteTest() {
		productMapper.delete(2L);
		log.info(productMapper.findByPno(2L));
	}
	
	@Test
	public void getTotalCountTest(Criteria cri) {
		log.info(productMapper.getTotalCount(cri));
	}
	

}
