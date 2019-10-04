package com.custapp.dao;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.AnnotationConfiguration;

public class MySessionFactory {
	private static SessionFactory factory = null;
	
	public static SessionFactory getSessionFactory(){
		 factory= new AnnotationConfiguration().configure()
				.buildSessionFactory();
		return factory;
	}

}
