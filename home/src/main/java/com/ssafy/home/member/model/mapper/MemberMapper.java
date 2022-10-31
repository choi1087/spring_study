package com.ssafy.home.member.model.mapper;

import java.sql.SQLException;

import org.apache.ibatis.annotations.Mapper;

import com.ssafy.home.member.model.dto.MemberDto;

@Mapper
public interface MemberMapper {
	public int idCheck(String id) throws SQLException; //아이디 체크
	public void joinMember(MemberDto memberDto) throws SQLException; //회원가입	
	public MemberDto loginMember(String id, String pw) throws SQLException; //로그인
	
	public MemberDto memberInfo(String id) throws SQLException; //회원정보
	public void updateMember(MemberDto memberDto) throws SQLException; //회원정보 수정
	public void deleteMember(String id) throws SQLException; //회원탈퇴
	
	//관심상품 등록
	
	
	
}
