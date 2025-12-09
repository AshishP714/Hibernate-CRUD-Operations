package com.MainFunctionality;

import java.util.Scanner;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.entities.Library;

public class ReadBookDetails {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		Configuration cfg = new Configuration();
		cfg.configure();
		cfg.addAnnotatedClass(Library.class);

		SessionFactory sf = cfg.buildSessionFactory();
		Session ss = sf.openSession();
		Transaction tr = ss.beginTransaction();

		Library li = new Library();

		System.out.println("Enter id to red all data :- ");
		int book = sc.nextInt();

		li = ss.get(Library.class, book);
		if (li.getBook_Id() == book) {
			System.out.println(li.toString());
		} else {
			System.out.println("Input not match...!");
		}

		ss.close();

	}
}