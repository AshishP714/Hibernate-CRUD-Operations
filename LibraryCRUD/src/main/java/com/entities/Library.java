package com.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import jakarta.persistence.Id;

@Entity
@Table(name = "Books")
public class Library {

	@Id
	private int book_Id;
	private String book_Name;
	private String author_name;
	private int book_price;

	public Library() {

	}

	public Library(int book_Id, String book_Name, String author_name, int book_price) {
		super();
		this.book_Id = book_Id;
		this.book_Name = book_Name;
		this.author_name = author_name;
		this.book_price = book_price;
	}

	public int getBook_Id() {
		return book_Id;
	}

	public void setBook_Id(int book_Id) {
		this.book_Id = book_Id;
	}

	public String getBook_Name() {
		return book_Name;
	}

	public void setBook_Name(String book_Name) {
		this.book_Name = book_Name;
	}

	public String getAuthor_name() {
		return author_name;
	}

	public void setAuthor_name(String author_name) {
		this.author_name = author_name;
	}

	public int getBook_price() {
		return book_price;
	}

	public void setBook_price(int book_price) {
		this.book_price = book_price;
	}

	@Override
	public String toString() {
		return "Library [book_Id=" + book_Id + ", book_Name=" + book_Name + ", author_name=" + author_name
				+ ", book_price=" + book_price + "]";
	}
}