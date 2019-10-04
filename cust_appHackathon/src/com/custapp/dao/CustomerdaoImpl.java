package com.custapp.dao;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

public class CustomerdaoImpl implements CustomerDao {

	private static SessionFactory factory =null;
	public CustomerdaoImpl() {
		factory = MySessionFactory.getSessionFactory();
	}

	@Override
	public void addCustomer(Customer customer) {

		Session session = factory.openSession();
		Transaction tx = session.getTransaction();

		try {
			tx.begin();
			session.save(customer);
			tx.commit();
		} catch (HibernateException he) {
			he.printStackTrace();
		}
	}
}
