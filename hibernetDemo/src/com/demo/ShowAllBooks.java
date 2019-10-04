package com.demo;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.AnnotationConfiguration;

public class ShowAllBooks {
	
	public static void main(String args[]){
		
		SessionFactory factory=new AnnotationConfiguration().configure().buildSessionFactory();
		Session session=factory.openSession();
		/*List<Book>books=session.createQuery("from Book").list();
		for(Book book:books){
			System.out.println(book);
		}*/
		/*List<Object[]>books=session.createQuery(" select b.title,b.price from Book b").list();
		for(Object[] book:books){
			System.out.println(book[0]+":"+book[1]);
		}*/
		List<Object[]>books=session.createQuery(" select b.title,b.price from Book b where b.price>:price or b.author=:author")
				.setDouble("price", 400).setString("author", "dennis").list();
		for(Object[] book:books){
			System.out.println(book[0]+":"+book[1]);
		}
		
		session.close();
		factory.close();
		
	}

}


// for selecting particular tuple we use allias
//createQuery("select b.title from Book b").list()