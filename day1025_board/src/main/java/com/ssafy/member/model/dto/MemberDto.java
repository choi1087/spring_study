package com.ssafy.member.model.dto;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Positive;

public class MemberDto {

	@NotBlank(message = "id 필수 입력")
	private String id;
	@NotBlank 
	private String pw;
	@NotBlank
	private String name;
	@Email
	private String email;
	@Positive
	private int age;
	@NotBlank
	private String phone;
	@NotBlank
	private String job;
	@Positive
	private int income;
	
	private char gender;

	public MemberDto() {
		super();
	}

	public MemberDto(String id, String pw, String name, String email, int age, String phone, String job, int income,
			char gender) {
		super();
		this.id = id;
		this.pw = pw;
		this.name = name;
		this.email = email;
		this.age = age;
		this.phone = phone;
		this.job = job;
		this.income = income;
		this.gender = gender;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getPw() {
		return pw;
	}

	public void setPw(String pw) {
		this.pw = pw;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getJob() {
		return job;
	}

	public void setJob(String job) {
		this.job = job;
	}

	public int getIncome() {
		return income;
	}

	public void setIncome(int income) {
		this.income = income;
	}

	public char getGender() {
		return gender;
	}

	public void setGender(char gender) {
		this.gender = gender;
	}

	@Override
	public String toString() {
		return "MemberDto [id=" + id + ", pw=" + pw + ", name=" + name + ", email=" + email + ", age=" + age
				+ ", phone=" + phone + ", job=" + job + ", income=" + income + ", gender=" + gender + "]";
	}

}
