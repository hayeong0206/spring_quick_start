package com.springbook.biz.common;

import org.aspectj.lang.JoinPoint;

import com.springbook.biz.user.UserVO;

public class AfterReturningAdvice {
	public void afterLog(JoinPoint jp, Object returnObj) {
		//클라이언트가 호출한 비즈니스 메소드 정보를 알아내기 위해서 JoinnPoint 객체를 첫 번째 매개변수로 선언
		//바인드변수(Object type) - 비즈니스 메소드가 리턴한 결괏값을 바인딩할 목적으로 사용, 어떤 값이 리턴될지 모르니 object타입으로 선
		String method = jp.getSignature().getName();
		
		if(returnObj instanceof UserVO) {
			UserVO user = (UserVO) returnObj;
			if(user.getRole().equals("Admin")) {
				System.out.println(user.getName()+" 로그인(Admin)");
			}
		}
		System.out.println("[사후 처리] " + method + "() 메소드 리턴값 : " + returnObj.toString());
	}
}
