package com.spring.project.service.customerSupportService;

import org.springframework.stereotype.Service;

import com.spring.project.domain.CustomerSupportVO;
import com.spring.project.mapper.customerSupportMapper.CustomerSupportMapper;

import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Service
@NoArgsConstructor(access = AccessLevel.PRIVATE)
public class CustomerSupportService {
	private static CustomerSupportService customerSupportService = new CustomerSupportService();
	public static CustomerSupportService getCustomerSupportService() {
		return customerSupportService;
	}
	private CustomerSupportMapper customerSupportMapper;
	
	public void addQuestion(CustomerSupportVO customerSupportVO) {
		customerSupportMapper.insertQuestion(customerSupportVO);
	}

	
}

