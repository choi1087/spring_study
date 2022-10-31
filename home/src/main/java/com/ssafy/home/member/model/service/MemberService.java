package com.ssafy.home.member.model.service;

import com.ssafy.home.member.model.dto.MemberDto;

public interface MemberService {
	public int idCheck(String id) throws Exception;
	public void joinMember(MemberDto memberDto) throws Exception;
	public MemberDto loginMember(String id, String pw) throws Exception;
	
	public MemberDto memberInfo(String id) throws Exception;
	public void udpateMember(MemberDto memberDto) throws Exception;
	public void deleteMember(String id) throws Exception;
}
