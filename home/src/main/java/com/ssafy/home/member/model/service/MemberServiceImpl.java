package com.ssafy.home.member.model.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ssafy.home.member.model.dto.MemberDto;
import com.ssafy.home.member.model.mapper.MemberMapper;

@Service
public class MemberServiceImpl implements MemberService {

	private MemberMapper memberMapper;

	@Autowired
	private MemberServiceImpl(MemberMapper memberMapper) {
		this.memberMapper = memberMapper;
	}

	@Override
	public int idCheck(String id) throws Exception {
		return memberMapper.idCheck(id);
	}

	@Override
	public void joinMember(MemberDto memberDto) throws Exception {
		memberMapper.joinMember(memberDto);
	}

	@Override
	public MemberDto loginMember(String id, String pw) throws Exception {
		return memberMapper.loginMember(id, pw);
	}

	@Override
	public MemberDto memberInfo(String id) throws Exception {
		return memberMapper.memberInfo(id);
	}

	@Override
	public void udpateMember(MemberDto memberDto) throws Exception {
		memberMapper.updateMember(memberDto);
	}

	@Override
	public void deleteMember(String id) throws Exception {
		memberMapper.deleteMember(id);
	}

}
