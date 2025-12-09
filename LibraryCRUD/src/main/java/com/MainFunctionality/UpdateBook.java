package com.MainFunctionality;

import java.util.Scanner;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.entities.Library;

public class UpdateBook {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		Configuration cfg = new Configuration();
		cfg.configure();
		cfg.addAnnotatedClass(Library.class);

		SessionFactory sf = cfg.buildSessionFactory();
		Session ss = sf.openSession();
		Transaction tr = ss.beginTransaction();

		Library li = new Library();
		System.out.println("Enter the book id to updated price :- ");
		int book = sc.nextInt();

		li = ss.get(Library.class, book);
		if (li.getBook_Id() == book) {
			System.out.println("Enter new book price :- ");
			int price = sc.nextInt();
			li.setBook_price(price);
			ss.merge(li);
			System.out.println("Price updated successfuly....!");
		} else {
			System.out.println("Book id not found...!");
		}

		tr.commit();
		ss.close();
	}
}