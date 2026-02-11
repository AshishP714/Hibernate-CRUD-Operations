package com.example;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.example.entity.Student;

public class HibernateSetupTest {

	public static void main(String[] args) {

		Configuration cfg = new Configuration();
		cfg.configure("hibernate.cfg.xml");
		cfg.addAnnotatedClass(Student.class);

		SessionFactory sf = cfg.buildSessionFactory();
		Session s = sf.openSession();
		Transaction tr = s.beginTransaction();

		Student st = new Student();
		st.setName("Ashish");
		st.setEmail("ashish@gmail.com");
		st.setPhone(9999999922l);
		st.setAge(22);

		s.persist(st);
		System.out.println("Data has been inserted..!");
		tr.commit();
		s.close();
	}
}