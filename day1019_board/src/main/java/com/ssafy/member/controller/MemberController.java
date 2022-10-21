package com.ssafy.member.controller;

import java.util.Map;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.ssafy.member.model.MemberDto;
import com.ssafy.member.model.service.MemberService;

@Controller
@RequestMapping("/member") // http://localhost:8080/board/member
public class MemberController {

	@Autowired
	private MemberService memberService;

//	@RequestMapping(value = "/login", method=RequestMethod.GET)
	@GetMapping("/login")
	public String login() {
		return "user/login"; // WEB-INF/views/(user/login).jsp
	}

	@PostMapping("/login")
//	public String login(String userId, String userPw, HttpSession session) {
	public String login(@RequestParam Map<String, String> map, Model model, HttpSession session) throws Exception {
		MemberDto result = memberService.loginMember(map);

		if (result == null) { // login fail
			model.addAttribute("msg", "아이디 또는 비밀번호 확인하세요");
			return "user/login";
		} else { // login success
			session.setAttribute("userinfo", result);
			return "redirect:/"; // index 첫 화면으로 가세요 -> 또 로그인?
		}
	}

	@GetMapping("/logout/{logoutId}")
	public String logout(@PathVariable("logoutId") String id, HttpSession session) {
		session.invalidate();
		System.out.println(id + " 사용자 로그아웃 완료.");
		return "redirect:/";
	}

}
