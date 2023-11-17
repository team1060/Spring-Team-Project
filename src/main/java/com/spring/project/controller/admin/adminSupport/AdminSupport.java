package com.spring.project.controller.admin.adminSupport;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.spring.project.controller.admin.Admin;

@Controller
@RequestMapping("/support")
public class AdminSupport extends Admin {

	@Override
	protected boolean isAdminUser() {
		// TODO Auto-generated method stub
		return super.isAdminUser();
	}
	
	


}
