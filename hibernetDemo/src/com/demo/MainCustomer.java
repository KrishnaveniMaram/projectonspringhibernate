package com.demo;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.AnnotationConfiguration;

import com.demo.CompositeKey.CustomerPk;

public class MainCustomer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		SessionFactory sf=new AnnotationConfiguration().configure().buildSessionFactory();
		Session session =sf.openSession();
		Transaction tx=session.getTransaction();
		try{
			tx.begin();
			CustomerPk customerPk=new CustomerPk(66,"CVBGFG");
			Customer customer =new Customer(customerPk,"AP","123355");
			session.save(customer);
			tx.commit();
		}catch(HibernateException e){
			e.printStackTrace();
		}
session.close();
        sf.close();
	}

}
