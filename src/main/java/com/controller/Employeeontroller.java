package com.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.service.EmployeeServie;
import com.vo.EmployeeVo;

@Controller
public class Employeeontroller {
	
	@Autowired
	private EmployeeServie memberService;
	
	@RequestMapping("searchMember.do")
	public String searchMember(Model model,String name) {
		EmployeeVo member = memberService.searchMember(name);
		
		model.addAttribute("member", member);
		
		return "members/searchMember";
	}
}
