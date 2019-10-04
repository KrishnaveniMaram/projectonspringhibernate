package com.demo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class demo {
public static void main(String[] args) {
	ApplicationContext ctx=new ClassPathXmlApplicationContext("beans.xml");
	
	
	Magician magician= (Magician) ctx.getBean("m");
	magician.doMagic();
}
	
	
	
	
	
	
	
}
