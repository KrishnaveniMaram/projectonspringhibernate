package com.demo4;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ApplicationContext ctx=new ClassPathXmlApplicationContext("ex4.xml");
		Country country=ctx.getBean("country",Country.class);
		
		country.printCountryDetails();	
		
		
	}

}
