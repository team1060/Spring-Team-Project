package com.spring.project.controller.customerSupportController;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/support/*")
public class CustomerSupportController {
	
	// 고객 문의
	@GetMapping("question")
	public void question() {
		
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
