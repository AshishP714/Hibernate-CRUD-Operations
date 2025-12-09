package com.MainFunctionality;

import java.util.Scanner;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.entities.Library;

public class DeleteBook {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		Configuration cfg = new Configuration();
		cfg.configure();
		cfg.addAnnotatedClass(Library.class);

		SessionFactory sf = cfg.buildSessionFactory();
		Session ss = sf.openSession();
		Transaction tr = ss.beginTransaction();

		Library li = new Library();

		System.out.println("enter id for delete book :- ");
		int book = scanner.nextInt();

		li = ss.get(Library.class, book);
		if (li.getBook_Id() == book) {
			ss.remove(li);
			System.out.println("Data delated succssfuly....!");
		} else {
			System.out.println("Data is not deleted....!");
		}

		tr.commit();
		ss.close();
	}
}