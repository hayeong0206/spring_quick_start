package com.springbook.view.controller;

import java.util.HashMap;
import java.util.Map;

import com.springbook.view.user.LoginController;

public class HandlerMapping {
	private Map<String, Controller> mappings;
	
	public HandlerMapping() {
		mappings = new HashMap<String, Controller>();
		mappings.put("/login.do", new LoginController());
	}
	
	public Controller getController(String path) {
		return mappings.get(path);
	}
}
//Map 타입의 컬렉션을 멤버변수로 가지고 있으면서 게시판 프로그램에 필요한 모든 Controller 객체들을 등록하고 관리함.
