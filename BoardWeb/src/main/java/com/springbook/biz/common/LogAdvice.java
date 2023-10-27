package com.springbook.biz.common;

import org.springframework.stereotype.Service;

import org.aspectj.lang.annotation.Pointcut;

@Service
public class LogAdvice {
	@Pointcut("execution(* com.springbook.biz..*Impl.*(..))")
	public void allPointcut() {}
	
	@Pointcut("execution(* com.spirngbook.biz..*Impl.get*(..))")
	public void getPointcut() {}
}
