package com.tomkimani.hibenate.pioneer;

import java.util.Date;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.AnnotationConfiguration;

public class Test {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		//USERS
		User user1 =new User();
		user1.setUserName("TomKim");
		user1.setFirstName("Tom");
		user1.setLastName("Kimani");
		user1.setEmail("tosh0948@gmail.com");
		user1.setPassword("gitaru09");
		
		
		User user2 = new User();
		user2.setUserName("james");
		user2.setFirstName("James");
		user2.setLastName("Mworia");
		user2.setEmail("mworia@empire.co.ke");
		user2.setPassword("mworia");
		
		
		User user3 = new User();
		user3.setUserName("david");
		user3.setFirstName("David");
		user3.setLastName("Mworia");
		user3.setEmail("mworia@empire.co.ke");
		user3.setPassword("mworia");
		
		//GROUPS
		Groups group1 = new Groups();
		group1.setGroupName("fieldofficer");
		group1.setDescription("Officers collecting Savings and Deposit data from the field");
		
		Groups group2 = new Groups();
		group2.setGroupName("Admin");
		group2.setDescription("User with the Right to manage the Admin section");
		
		
		//Add users to Groups
		user1.getGroups().add(group1);
		user1.getGroups().add(group2);
		user2.getGroups().add(group1);
		user3.getGroups().add(group1);
		
		//Terminal
		Terminal t1 = new Terminal();
		t1.setImeiCode("2536-89567-56");
		t1.setTerminalName("Huawei-IDEOS");
		
		//Terminal2
		Terminal t2 = new Terminal();
		t2.setImeiCode("2536-89567-7020");
		t2.setTerminalName("Huawei-IDEOS");
		
		//Allocation 
		Allocation a1 =new Allocation();
		a1.setAllocation_date(new Date());
		a1.setAllocation_time(new Date());
		a1.setAllocatedBy(user1);
		a1.setAllocatedTo(user2);
		a1.setTerminal(t1);
		
		
		Allocation a2 =new Allocation();
		a2.setAllocation_date(new Date());
		a2.setAllocation_time(new Date());
		a2.setAllocatedBy(user1);
		a2.setAllocatedTo(user3);
		a2.setTerminal(t2);
		
		//Allocate Allocation to User
		user2.getAllocation().add(a1);
		user3.getAllocation().add(a2);
		
		/*
		 * -------Transactions---------------
		 */
		Transaction tr1 = new Transaction();
		tr1.setTransaction_date(new Date());
		tr1.setTransaction_time(new Date());
		tr1.setTransaction_code("BM568521");
		tr1.setTransaction_amount(4000);
		tr1.setTerminal(t1);
		tr1.setUser(user2);
		tr1.setTransaction_type("Deposit");
		
		//Transaction 2
		Transaction tr2 = new Transaction();
		tr2.setTransaction_date(new Date());
		tr2.setTransaction_time(new Date());
		tr2.setTransaction_amount(6000);
		tr2.setTerminal(t1);
		tr2.setUser(user2);
		tr2.setTransaction_type("Deposit");
	
		//Transaction 2
		Transaction tr3 = new Transaction();
		tr3.setTransaction_date(new Date());
		tr3.setTransaction_time(new Date());
		tr3.setTransaction_amount(6000);
		tr3.setTerminal(t1);
		tr3.setUser(user2);
		tr3.setTransaction_type("Deposit");
		
		//Transaction 2
		Transaction tr4 = new Transaction();
		tr4.setTransaction_date(new Date());
		tr4.setTransaction_time(new Date());
		tr4.setTransaction_amount(6000);
		tr4.setTerminal(t1);
		tr4.setUser(user2);
		tr4.setTransaction_type("Deposit");
		
		//Transaction 2
		Transaction tr5 = new Transaction();
		tr5.setTransaction_date(new Date());
		tr5.setTransaction_time(new Date());
		tr5.setTransaction_amount(6000);
		tr5.setTerminal(t1);
		tr5.setUser(user2);
		tr5.setTransaction_type("Deposit");
		
		
		//Customer 
		Customer c1 = new Customer();
		c1.setFirstName("Tom");
		c1.setLastName("Kimani");
		c1.setIdNo("27842116");
		c1.setRefno("PF-001-00009");
		c1.setMobileNo("0729472421");
		
		Customer c2 = new Customer();
		c2.setFirstName("James");
		c2.setLastName("Mwangi");
		c2.setIdNo("27842116");
		c2.setRefno("PF-001-04409");
		c2.setMobileNo("0729472421");
	
		c1.getTransactions().add(tr1);
		c1.getTransactions().add(tr2);
		c1.getTransactions().add(tr3);
		c1.getTransactions().add(tr4);
		c1.getTransactions().add(tr5);
		
		tr1.setCustomer(c1);
		tr2.setCustomer(c1);
		tr3.setCustomer(c1);
		tr4.setCustomer(c1);
		tr5.setCustomer(c1);
		
		
		//Session
		SessionFactory sessionFactory= new AnnotationConfiguration().configure().buildSessionFactory();
		Session session = sessionFactory.openSession();
		session.beginTransaction();
		
		session.save(user1);
		session.save(user2);
		session.save(user3);
		
		session.save(group1);
		session.save(group2);
		
		session.save(t1);
		session.save(t2);
		
		session.save(c1);
		session.save(c2);
		 
		session.getTransaction().commit();
		session.close();
		sessionFactory.close();
	}

}
