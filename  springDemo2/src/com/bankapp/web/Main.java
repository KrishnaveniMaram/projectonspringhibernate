package com.bankapp.web;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.bankapp.model.persistance.Account;
import com.bankapp.model.service.AccountService;
import com.bankapp.model.service.AccountServiceImpl;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
ApplicationContext cntx=new ClassPathXmlApplicationContext("banks.xml");
AccountService service=(AccountService) cntx.getBean("accountService"); 
List<Account> accounts=service.getAllAccounts();
System.out.println("-------printing all account before transfer----------");
for(Account account:accounts){
	System.out.println(account);
}
System.out.println("-----transfer 10rs from 1-->2");
service.transfer(1, 2, 10);

System.out.println("-------printing all account after transfer----------");
for(Account account:accounts){
	System.out.println(account);



	
	
}
	}

}
