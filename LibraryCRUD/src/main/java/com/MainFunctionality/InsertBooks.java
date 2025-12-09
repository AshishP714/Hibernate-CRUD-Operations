package com.MainFunctionality;

import java.util.Scanner;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.entities.Library;

public class InsertBooks {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		Configuration cfg = new Configuration();
		cfg.configure("hibernate.cfg.xml");
		cfg.addAnnotatedClass(Library.class);

		SessionFactory sf = cfg.buildSessionFactory();
		Session ss = sf.openSession();
		Transaction tr = ss.beginTransaction();

		Library li = new Library();

		System.out.println("-: Enter following details :- ");
		System.out.println("book id :- ");
		int id = scanner.nextInt();
		scanner.nextLine();
		
		System.out.println("book name :- ");
		String bname = scanner.nextLine();
		
		System.out.println("author name :- ");
		String aname = scanner.nextLine();
		
		System.out.println("book price :- ");
		int price = scanner.nextInt();

		li.setBook_Id(id);
		li.setBook_Name(bname);
		li.setAuthor_name(aname);
		li.setBook_price(price);

		ss.persist(li);
		System.out.println("Data has been inserted...!");

		tr.commit();
		ss.close();
	}
}