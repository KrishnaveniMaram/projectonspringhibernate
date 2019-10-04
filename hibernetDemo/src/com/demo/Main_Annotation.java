package com.demo;

import java.sql.Date;
import java.text.SimpleDateFormat;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.AnnotationConfiguration;

import com.demo.CompositeKey.CustomerPk;

public class Main_Annotation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SessionFactory sf=new AnnotationConfiguration().configure().buildSessionFactory();
		Session session =sf.openSession();
		Transaction tx=session.getTransaction();
		try{
			tx.begin();
			Date dateOfBirth=new SimpleDateFormat("dd/MM/yyyy");
			MoreAnnotations annotations=new MoreAnnotations("AS123","BAng","4523");
			session.save(annotations);
			tx.commit();
		}catch(HibernateException e){
			e.printStackTrace();
		}
session.close();
        sf.close();
	}

}
