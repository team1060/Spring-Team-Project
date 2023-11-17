package com.spring.project.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.spring.project.domain.SupportVO;
import com.spring.project.mapper.SupportMapper;

import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Service
@NoArgsConstructor(access = AccessLevel.PRIVATE)
public class SupportService {
	private static SupportService customerSupportService = new SupportService();
	public static SupportService getCustomerSupportService() {
		return customerSupportService;
	}
	
	@Autowired
	private SupportMapper customerSupportMapper;
	
	public void addQuestion(SupportVO customerSupportVO) {
		 customerSupportVO.setAddr(customerSupportVO.getAbode());
		customerSupportVO.setPhonenumber(customerSupportVO.getFormattedPhoneNumber());
		customerSupportVO.setQcno(customerSupportVO.getQuestionSelect());
		customerSupportMapper.insertQuestion(customerSupportVO);
	}

	
}

