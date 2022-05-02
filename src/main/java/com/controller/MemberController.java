package com.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.service.MemberServie;

@Controller
public class MemberController {
	
	@Autowired
	private MemberServie memberService;
	
	@RequestMapping("searchMember.do")
	public String searchMember(Model model,String name) {
		String userName = memberService.searchMember(name);
		
		model.addAttribute("username", userName);
		
		return "members/searchMember";
	}
}
