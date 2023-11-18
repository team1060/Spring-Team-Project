package com.spring.project.domain;

import lombok.Data;

@Data
public class MemberVO {
	private String id;
	private String pw;
	private String name;
	private String tel;
	private String addr;
	private String email;
	private int grade; // 관리자, 사업자, 고객 여부 
}
