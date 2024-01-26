package com.learn.spring.conscructorinjection;

public class Book {
	private String name;
	private String author;
	private int price;
	private Publisher publisher;
	
	public Book() {
		super();
	}

	public Book(String name, String author, int price, Publisher publisher) {
		super();
		this.name = name;
		this.author = author;
		this.price = price;
		this.publisher = publisher;
	}

	@Override
	public String toString() {
		return "Book [name=" + name + ", author=" + author + ", price=" + price + ", publisher=" + publisher + "]";
	}
	
}
