package com.service;

import java.util.ArrayList;

import org.springframework.stereotype.Service;

import com.vo.EmployeeVo;

@Service
public class EmployeeServie {
	
	public EmployeeVo searchMember(String name) {
		
		ArrayList<EmployeeVo> members = new ArrayList<>();
		members = new EmployeeVo().memberLists();
		EmployeeVo searchMember = new EmployeeVo();
		
		for(EmployeeVo member : members) {
			String memberName = member.getName();
			
			if(memberName.equals(name)) {
				searchMember = member;
			}
		}
		
		return searchMember;
	}

}
