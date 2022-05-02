package com.service;

import java.util.ArrayList;

import org.springframework.stereotype.Service;

import com.vo.MemberVo;

@Service
public class MemberServie {
	
	public MemberVo searchMember(String name) {
		
		ArrayList<MemberVo> members = new ArrayList<>();
		members = new MemberVo().memberLists();
		MemberVo searchMember = new MemberVo();
		
		for(MemberVo member : members) {
			String memberName = member.getName();
			
			if(memberName.equals(name)) {
				searchMember = member;
			}
		}
		
		return searchMember;
	}

}
