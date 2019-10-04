package com.demo;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.annotation.WebListener;

@WebListener
public class SCListener implements ServletContextListener {
	public void contextInitialized(ServletContextEvent arg0) {
		System.out.println("context is initailized");

	}

	public void contextDestroyed(ServletContextEvent arg0) {
		// TODO Auto-generated method stub
		System.out.println("context is destroyed");

	}

}
