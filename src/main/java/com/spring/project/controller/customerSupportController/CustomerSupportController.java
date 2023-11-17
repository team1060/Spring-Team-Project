package com.spring.project.controller.customerSupportController;

import java.io.IOException;
import java.io.UnsupportedEncodingException;

import org.springframework.boot.autoconfigure.info.ProjectInfoProperties.Build;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.spring.project.domain.CustomerSupportVO;
import com.spring.project.service.customerSupportService.CustomerSupportService;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@Controller
@RequestMapping("/support/*")
public class CustomerSupportController {
	private CustomerSupportService customerSupportService = CustomerSupportService.getCustomerSupportService();
	// 고객 문의
	@GetMapping("question")
	public void question() {
		
	}
	
	@PostMapping("question")
	public void question(HttpServletRequest request) throws IOException {
		request.setCharacterEncoding("utf-8");
		String title = request.getParameter("title");
		String writer = request.getParameter("writer");
		String addr = request.getParameter("abode");
		String phone1 = request.getParameter("phone1");
        String phone2 = request.getParameter("phone2");
        String phone3 = request.getParameter("phone3");
		String phonenumber = phone1 + "-" + phone2 + "-" + phone3;
		String email = request.getParameter("email");
		String content = request.getParameter("content");
		String questionSelectParam = request.getParameter("questionSelect");
		Long qcno = Long.parseLong(questionSelectParam);
		System.out.println(title);
		System.out.println(writer);
		System.out.println(addr);
		System.out.println(phone1);
		System.out.println(phone2);
		System.out.println(phone3);
		System.out.println(phonenumber);
		System.out.println(email);
		System.out.println(content);
		System.out.println(questionSelectParam);
		System.out.println(qcno);
		CustomerSupportVO customerSupportVO = CustomerSupportVO.builder()
				.title(title).writer(writer).addr(addr)
				.phonenumber(phonenumber).email(email).content(content).qcno(qcno)
				.build();
		System.out.println(customerSupportVO);
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
