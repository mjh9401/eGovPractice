package com.vo;

import java.util.ArrayList;


public class EmployeeVo {
	
	private int idx;
	private String name;
	private String address;
	private String email;
	private String tel;
	ArrayList<EmployeeVo> members = new ArrayList<EmployeeVo>() ;
	
	public EmployeeVo() {
		
	}
	
	public EmployeeVo(int idx,String name, String address,String email,String tel) {
		this.idx = idx;
		this.name = name;
		this.address = address;
		this.email = email;
		this.tel = tel;
	}
	
	public ArrayList<EmployeeVo> memberLists() {
		members.add(new EmployeeVo(1,"짱구","서울특별시","jjangu@gmail.com","010-8959-8888"));
		members.add(new EmployeeVo(2,"철수","서울특별시","iron@naver.com","010-1414-5741"));
		members.add(new EmployeeVo(3,"맹구","서울특별시","mangu@gmail.com","010-1122-8421"));
		members.add(new EmployeeVo(4,"훈이","서울특별시","hun@gmail.com","010-4753-1288"));
		members.add(new EmployeeVo(5,"유리","서울특별시","yuri@gmail.com","010-1698-4465"));
		
		return members;
	}
	
	public int getIdx() {
		return idx;
	}
	public void setIdx(int idx) {
		this.idx = idx;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getTel() {
		return tel;
	}
	public void setTel(String tel) {
		this.tel = tel;
	}
	
	
}
