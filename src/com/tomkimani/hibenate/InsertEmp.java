package com.tomkimani.hibenate;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;


public class InsertEmp {

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
		
		Employee emp = new Employee();
		emp.setId(3);
		emp.setName("Bob Njoroge");
		emp.setEmail("bob@gmail.com");
		emp.setMobile(7283695);
		
		s.save(emp);
		s.flush();
		tx.commit();
		s.close();
		
	}

}
