package com.tomkimani.hibenate.oneTomany;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.AnnotationConfiguration;

public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		AnnotationConfiguration config = new AnnotationConfiguration(); 
		config.addAnnotatedClass(College.class);
		config.addAnnotatedClass(Student.class);
		
		config.configure("oneTomany.cfg.xml");
		
		SessionFactory factory = config.buildSessionFactory();
		Session s = factory.openSession();
		s.beginTransaction();
		
		Student student1 = new Student();
		Student student2 = new Student();
		
		College college1= new College();
		college1.setCollegeName("University Of Nairobi");

		student1.setStudentName("Paul Wa Gikandi");
		student1.setCollege(college1);
		
		student2.setStudentName("Tom Wa Muriranja");
		student2.setCollege(college1);
		
		s.save(student1);
		s.save(student2);
		s.save(college1);
		
		s.getTransaction().commit();
		s.close();
		factory.close();
		
	}

}
