package com.spring.project.service;

import java.util.List;

import org.apache.logging.log4j.message.Message;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.spring.project.domain.Criteria;
import com.spring.project.domain.Product;
import com.spring.project.mapper.ProductMapper;

import lombok.AccessLevel;
import lombok.NoArgsConstructor;

@Service
@NoArgsConstructor(access = AccessLevel.PRIVATE)
public class ProductService {
	private static ProductService productService = new ProductService();
	
	public static ProductService getProductService() {
		return productService;
	}
	
	@Autowired
	private ProductMapper productMapper;
	
	public int register(Product product) {
		return productMapper.insert(product);
	}
	
	public List<Product> getList(Criteria cri) {

		return productMapper.getList(cri);
	}
	
	public Product findByPno(Long pno) {
		return productMapper.findByPno(pno);
	}
	
	public int modify(Product product) {
		return productMapper.modify(product);
	}
	
	public int remove(Long pno) {
		return productMapper.delete(pno);
	}
	
	public int getTotalCount(Criteria cri) {
		return productMapper.getTotalCount(cri);
	}

}
