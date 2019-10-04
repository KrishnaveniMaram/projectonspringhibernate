package com.demo;

import org.hibernate.HibernateError;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.AnnotationConfiguration;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
  
		SessionFactory factory=new AnnotationConfiguration().configure().buildSessionFactory();
	Session  session =factory.openSession();
		Transaction tx=session.getTransaction();
		try{
			tx.begin();
			Book book=new Book("S@@#F", "Hibernate", "Jhon", 499);
			session.save(book);
			System.out.println("object created");
			tx.commit();
			
		}catch(HibernateException e){
			e.printStackTrace();
			tx.rollback();
		}
		session.close();
		factory.close();
	}

}
