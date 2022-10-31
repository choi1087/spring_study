package com.ssafy.home.member.controller;

import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.ssafy.home.member.model.dto.MemberDto;
import com.ssafy.home.member.model.service.MemberService;

@Controller
@RequestMapping("/member")
public class MemberController {

	private final Logger logger = LoggerFactory.getLogger(MemberController.class);
	private final MemberService memberService;

	@Autowired
	public MemberController(MemberService memberService) {
		this.memberService = memberService;
	}
	
	// 중복 아이디 확인
	@GetMapping("/{id}")
	@ResponseBody
	public String idCheck(@PathVariable("id") String id) throws Exception {
		logger.debug("idCheck member id = {}", id);
		return memberService.idCheck(id) + "";
	}

	// 회원가입 페이지 이동
	@GetMapping("/join")
	public String join() {
		return "member/join";
	}
	
	// 회원가입
	@PostMapping("/join")
	public String join(MemberDto memberDto, Model model) {
		logger.debug("memberDto info : {}", memberDto);
		
		try {
			memberService.joinMember(memberDto);
			return "redirect:/member/login"; //회원가입 성공하면 로그인 페이지로 이동
		}catch(Exception e) {
			e.printStackTrace();
			model.addAttribute("msg", "회원 가입 중 에러 발생");
			return "error/error";
		}
	}
	
	// 로그인 페이지로 이동
	@GetMapping("/login")
	public String login() {
		return "member/login";
	}
	
	//로그인
	@PostMapping("/login")
	public String login(@RequestParam String id, @RequestParam String pw, Model model, HttpSession session, HttpServletResponse response) {
		logger.debug("id : {}, pw : {}", id, pw);
		
		try {
			MemberDto memberDto = memberService.loginMember(id, pw);
			
			// 회원 존재하는 경우, 로그인 처리
			if(memberDto != null) {
				session.setAttribute("loginInfo", memberDto);
				return "redirect:/";
			}
			// 로그인 실패
			else {
				model.addAttribute("msg", "아이디 또는 비밀번호를 확인하세요!");
				return "member/login";
			}
		} catch (Exception e) {
			e.printStackTrace();
			model.addAttribute("msg", "로그인 중 에러 발생");
			return "error/error";
		}
	}
	
	// 회원정보
	
	// 회원정보 수정
	
	// 회원탈퇴
}
