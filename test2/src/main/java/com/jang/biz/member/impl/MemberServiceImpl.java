package com.jang.biz.member.impl;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jang.biz.member.MemberService;
import com.jang.biz.member.MemberVO;

@Service("memberService")
public class MemberServiceImpl implements MemberService{

	@Autowired
	private MemberDAO memberDAO;
	
	@Override
	public void insertMember(MemberVO vo) {
		// TODO Auto-generated method stub
		memberDAO.insertMember(vo);
		
	}

	@Override
	public void updateMember(MemberVO vo) {
		// TODO Auto-generated method stub
	}

	@Override
	public void deleteMember(MemberVO vo) {
		// TODO Auto-generated method stub
	}

	@Override
	public MemberVO selectOneMember(MemberVO vo) {
		// TODO Auto-generated method stub
		return memberDAO.selectOneMember(vo);
	}

	@Override
	public ArrayList<MemberVO> selectAllMember(MemberVO vo) {
		// TODO Auto-generated method stub
		return null;
	}

}
