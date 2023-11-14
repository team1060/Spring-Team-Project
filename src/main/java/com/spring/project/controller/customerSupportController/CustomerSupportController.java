package com.spring.project.controller.customerSupportController;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class CustomerSupportController {
	
	@GetMapping("/")
	public @ResponseBody String index() {
		return "hello, world";
	}
}
