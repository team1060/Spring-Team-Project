package com.spring.project.domain;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;

@Getter
@Builder
@AllArgsConstructor
public class CustomerSupportVO {
	private Long qno;
	private String title;
	private String writer;
	private String addr;
	private String phonenumber;
	private String email;
	private String content;
}
