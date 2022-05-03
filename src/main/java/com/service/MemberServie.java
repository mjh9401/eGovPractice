package com.service;

import java.util.ArrayList;

import org.springframework.stereotype.Service;

import com.vo.MemberVo;


@Service
public class MemberServie {
	
	public ArrayList<MemberVo> searchMember(String searchKeyWord) {
		
		ArrayList<MemberVo> members = new ArrayList<>();
		members = new MemberVo().memberLists();
		ArrayList<MemberVo> searchMember = new ArrayList<>();
		

		
		for(MemberVo member : members) {			
			String memberName = member.getName();
			String memberAddress = member.getAddress();
			String memberEmadil = member.getEmail();
			String memberTel = member.getTel();
			
			if(memberName.equals(searchKeyWord)) {
				searchMember.add(member);
			} else if(memberAddress.equals(searchKeyWord)) {
				searchMember.add(member);
			} else if (memberEmadil.equals(searchKeyWord)) {
				searchMember.add(member);
			} else if (memberTel.equals(searchKeyWord)) {
				searchMember.add(member);
			}
			
		}
		
		return searchMember;
	}

}
