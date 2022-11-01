package com.ssafy.homepjt;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/view")
public class ViewController {

	// 회원가입 페이지 이동
	@GetMapping("/member/join")
	public String join() {
		return "member/join";
	}

	// 로그인 페이지 이동
	@GetMapping("/member/login")
	public String login() {
		return "member/login";
	}

	// 회원정보 페이지 이동
	@GetMapping("/member/detail")
	public String detail() {
		return "member/detail";
	}

	// 아이디 찾기 페이지 이동
	@GetMapping("/member/findid")
	public String findId() {
		return "member/findid";
	}

	// 비밀번호 찾기 페이지 이동
	@GetMapping("/member/findpw")
	public String findPw() {
		return "member/findpw";
	}

}
