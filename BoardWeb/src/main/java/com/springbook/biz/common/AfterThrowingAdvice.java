package com.springbook.biz.common;

import org.aspectj.lang.JoinPoint;

public class AfterThrowingAdvice {
	public void exceptionLog(JoinPoint jp, Exception exceptObj) {
		//예외객체를 마인드 변수를 통해 받음, 모든 예외 객체를 바인드할 수 있도록 예외 클래스의 최상의 타입인 Exception으로 선
		String method = jp.getSignature().getName();
		
		System.out.println("[예외처리] "+method +"() 메소드 수행 중 발생된 예외 메세지 :" + exceptObj.getMessage());
		
		//예외 객체의 종류에 따라 다양하게 예외처리 가능
		System.out.println(method +"() 메소드 수행 중 예외 발생!");
		if(exceptObj instanceof IllegalArgumentException) {
			System.out.println("부적절한 값이 입력되었습니다.");
		} else if(exceptObj instanceof NumberFormatException) {
			System.out.println("숫자 형식의 값이 아닙니다.");
		} else if(exceptObj instanceof Exception) {
			System.out.println("문제가 발생했습니다.");
		}
	}
}
