package com.hiber;

import org.hibernate.SessionFactory;

import com.hiber.util.HibernateUtil;

public class App {

	public static void main(String[] args) {
		System.out.println("Hii i am lerning hibernate");
		SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
		System.out.println(sessionFactory);
	}
}
