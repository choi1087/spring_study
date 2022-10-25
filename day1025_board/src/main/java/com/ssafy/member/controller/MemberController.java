package com.ssafy.member.controller;

import javax.servlet.http.HttpSession;
import javax.validation.Valid;
import javax.xml.ws.BindingType;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.ssafy.member.model.dto.MemberDto;
import com.ssafy.member.model.service.MemberService;

@Controller
@ResponseBody
@RequestMapping("/member")
public class MemberController {

	@Autowired
	private MemberService memberService;

	@PostMapping("/join")
	public String register(@RequestBody @Valid MemberDto memberDto) {
		if (memberService.checkDuplicatedId(memberDto.getId())) {
			System.out.println("중복 아이디 발생");
			return "Fail";
		}

		/**
		 * 입력값에 따른 예외처리 구현 필요
		 */

		memberService.join(memberDto);
		return "Success";
	}

	@GetMapping("/check")
	@ResponseBody
	public String checkDuplicatedId(String id) {
		System.out.println("id = " + id);
		if (memberService.checkDuplicatedId(id)) {
			System.out.println("중복 아이디 발생");
			return "Fail";
		}
		return "Success";
	}

	@GetMapping("/login")
	@ResponseBody
	public String login(String id, String pw, HttpSession session) {
		MemberDto memberDto = memberService.login(id, pw);
		if (memberDto == null) {
			return "login Fail";
		}
		session.setAttribute("loginInfo", memberDto);
		return "login success";
	}
}
