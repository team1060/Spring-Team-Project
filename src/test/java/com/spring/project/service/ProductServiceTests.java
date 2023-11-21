package com.spring.project.service;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.spring.project.domain.Criteria;
import com.spring.project.domain.Product;

import lombok.extern.log4j.Log4j2;

@Log4j2
@SpringBootTest
public class ProductServiceTests {
	
	@Autowired
	private ProductService productService = ProductService.getProductService();
	
	@Test
	public void insertTest() {
		Product product = Product.builder()
				.pname("test3")
				.price("18000")
				.pcontent("testest")
				.prCategory("0")
				.nego(12.5f)
				.issell(0)
				.id("boss")
				.size(0)
				.build();
		
		log.info(product);
		productService.register(product);
		
	}
	
	@Test
	public void getListTest(Criteria cri) {
		log.info(productService.getList(cri));
	}
	
	@Test
	public void findByPnoTest() {
		log.info(productService.findByPno(3L));
	}

	@Test
	public void modifyTest() {
		Product product = new Product();
		product.setPno(4L);
		product.setPname("test1");
		product.setPrice("15000");
		product.setPcontent("15.5f");
		product.setId("boss");
		product.setSize(1);
		
		productService.modify(product);
		log.info(productService.findByPno(1L));
	}
	
	@Test
	public void deleteTest() {
		productService.remove(3L);
		log.info(productService.findByPno(3L));
	}
	
	@Test
	public void getTotalCountTest(Criteria cri) {
		log.info(productService.getTotalCount(cri));
	}
	

}
