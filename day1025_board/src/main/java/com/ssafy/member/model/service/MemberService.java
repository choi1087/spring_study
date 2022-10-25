package com.ssafy.member.model.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ssafy.member.model.dto.MemberDto;
import com.ssafy.member.model.mapper.MemberMapper;

@Service
public class MemberService {

	@Autowired
	private MemberMapper memberMapper;

	// 회원가입
	public boolean join(MemberDto memberDto) {
		if (memberMapper.insert(memberDto) == 1) {
			return true;
		}
		return false;
	}

	// 아이디 중복 확인
	public boolean checkDuplicatedId(String id) {
		if (memberMapper.checkDuplicatedId(id) == 1) {
			return true;
		}
		return false;
	}

	// 로그인
	public MemberDto login(String id, String pw) {
		return memberMapper.selectOne(id, pw);
	}
}
