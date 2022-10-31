package com.ssafy.home.member.model.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class MemberDto {
	private String id;
	private String pw;
	private String name;
	private String email;
	private int age;
	private String phone;
	private String job;
	private int income;
	private char gender;
}
