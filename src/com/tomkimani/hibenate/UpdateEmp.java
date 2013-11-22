package com.tomkimani.hibenate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class UpdateEmp {

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
		
		//Employee emp = (Employee)s.get(Employee.class, new Integer(2));
		
		Employee emp = new Employee();
		emp.setId(2);
		emp.setName("Brand Kamau");
		emp.setEmail("aaa@aa.aa");
		emp.setMobile(2253636);
		
		s.saveOrUpdate(emp);
		s.flush();
		tx.commit();
		s.close();
	}

}
