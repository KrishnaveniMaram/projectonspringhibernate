package com.cust_app.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.custapp.dao.Customer;
import com.custapp.dao.CustomerDao;
import com.custapp.dao.CustomerdaoImpl;
import com.custapp.dao.CustomerdaoImpl;
import com.custapp.dao.MySessionFactory;


@WebServlet("/addcustomer")
public class AddCustomerController extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private SessionFactory factory = MySessionFactory.getSessionFactory();
       
   
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String name=request.getParameter("name");
		String address=request.getParameter("address");
		String email=request.getParameter("email");
		String phone=request.getParameter("phone");
		
		Customer customer = new Customer(name,address,email,phone);
		
		CustomerDao dao=new CustomerdaoImpl();
		dao.addCustomer(customer);
		response.sendRedirect("success.jsp");
		
		
	}

}
