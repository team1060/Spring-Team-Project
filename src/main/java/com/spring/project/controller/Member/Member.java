package com.spring.project.controller.Member;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.spring.project.domain.MemberVO;
import com.spring.project.service.MemberService;

import lombok.extern.log4j.Log4j2;

@Controller
@Log4j2
//@RequestMapping("/member/*")
public class Member {
	
	@Autowired
	private MemberService service = MemberService.getInstance();
	
	@GetMapping("/member/join")
	public void join() {
		log.info("join");
	}
	
	@GetMapping("/member/signup")
	public void register() {
		log.info("signup");

	}
	
	@PostMapping("/member/signup")
	public String signup(MemberVO vo) {
		//log.info("회원가입시도");
		service.register(vo);
		log.info("회원가입완료");
		return "redirect:/";
	}
	
	
}
