package com.tomkimani.hibenate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class SelectEmp {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Configuration cfg = new Configuration();
		cfg.configure("hibernate.cfg.xml");
		SessionFactory sf =cfg.buildSessionFactory();
		Session s = sf.openSession();
		Transaction tx = s.beginTransaction();
		
		Employee emp = (Employee)s.get(Employee.class, new Integer(2));
		
		System.out.println(emp.getId() +"\n");
		System.out.println(emp.getName() +"\n");
		System.out.println(emp.getEmail() +"\n");
		System.out.println(emp.getMobile() +"\n");
		
		s.close();
	}

}
