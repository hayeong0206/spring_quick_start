package com.springbook.biz.common;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Service;

@Service
@Aspect
public class BeforeAdvice {
	@Pointcut("execution(* com.springbook.biz..*Impl.*(..))")
	public void allPointcut() {}
	
	@Before("allPointcut()")
	public void beforeLog(JoinPoint jp) {
		String method = jp.getSignature().getName();
		//getSignature - 클라이언트가 호출한 메소드 이름
		Object[] args = jp.getArgs();
		//getArgs() - 인자목록을 Object 배열로 얻어낼 수 있어서, 메소드 호출에 어떤 값들을 사용했는지 알 수 있
		
		System.out.println("[사전처리] " + method + "() 메소드 ARGS 정보 : "+ args[0].toString());
	}
}
