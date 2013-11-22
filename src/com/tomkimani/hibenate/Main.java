package com.tomkimani.hibenate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.AnnotationConfiguration;

public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		SessionFactory sessionFactory= new AnnotationConfiguration().configure().buildSessionFactory();
		Session session = sessionFactory.openSession();
		session.beginTransaction();
				
		session.getTransaction().commit();
		session.close();
		sessionFactory.close();
	}

}
