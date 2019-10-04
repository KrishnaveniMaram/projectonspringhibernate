package com.demo;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;
@Component
@Aspect
public class Audience {
	@Before("execution(public void doMagic())")
	public void clapping(){
	
		System.out.println("wow..........");
	}
	
}
