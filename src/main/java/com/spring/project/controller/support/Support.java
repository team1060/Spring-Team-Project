package com.spring.project.controller.support;

import java.io.IOException;
import java.io.UnsupportedEncodingException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.info.ProjectInfoProperties.Build;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.spring.project.domain.SupportVO;
import com.spring.project.service.SupportService;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@Controller
@RequestMapping("/support/*")
public class Support {
	
	@Autowired
	private SupportService customerSupportService = SupportService.getCustomerSupportService();
	
	// 고객 문의
	@GetMapping("question")
	public void question() {
		
	}
	
	@PostMapping("question")
	public void question(@RequestParam("questionSelect") String questionSelect, @ModelAttribute SupportVO customerSupportVO) throws IOException {
		customerSupportService.addQuestion(customerSupportVO);
	}
	
	// FAQ, 자주 묻는 질문
	@GetMapping("faq")
	public void faq() {
		
	}
	
	// 실시간 chat
	@GetMapping("chat")
	public void chat() {
		
	}
	
}
