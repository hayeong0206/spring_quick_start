package com.springbook.biz.common;

import org.springframework.stereotype.Service;

import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;

@Service
public class LogAdvice {
	@Pointcut("execution(* com.springbook.biz..*Impl.*(..))")
	public void allPointcut() {}
	
	@Before("allPointcut()")
	public void printlog() {
		System.out.println("[공통 로그] 비즈니스 로직 수행 전 동작");
	}
	
	//allPointcut() 참조 메소드로 지정한 비즈니스 메소드가 호출될 때,
	//어드바이스 메소드인 printLog() 메소드가 Before 형태로 동작하도록 설정
}
