package com.demo5;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		ApplicationContext ctx=new ClassPathXmlApplicationContext("ex5.xml");
		Country country=ctx.getBean("c", Country.class);
		country.printCountryDetails();
		
		
	}

}
