package com.ssafy.member.model.mapper;

import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import com.ssafy.member.model.dto.MemberDto;

@Repository
public interface MemberMapper {
	public int insert(MemberDto memberDto); // 회원가입

	public int checkDuplicatedId(String id); // 중복 아이디 확인

	public MemberDto selectOne(@Param("id") String id, @Param("pw") String pw); // 로그인
}
