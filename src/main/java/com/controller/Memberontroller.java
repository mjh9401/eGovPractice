package com.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.service.MemberServie;
import com.vo.MemberVo;

@Controller
public class Memberontroller {
	
	@Autowired
	private MemberServie memberService;
	
	@RequestMapping("searchMember.do")
	public String searchMember() {
		
		return "member/searchMember";
	} 
	
	
	@RequestMapping("actionSearchMember.do")
	public String actionSearchMember(String searchKeyWord,Model model) {
		
		List<MemberVo> members = memberService.searchMember(searchKeyWord);		
		model.addAttribute("members", members);
			
		return "member/memberList";
	}
}
