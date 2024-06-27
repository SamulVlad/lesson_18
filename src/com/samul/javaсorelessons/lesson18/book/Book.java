package com.samul.javaсorelessons.lesson18.book;

public class Book {
	
	protected String title;
	protected String author;
	
	public Book(String title, String author) {
		super();
		this.title = title;
		this.author = author;
	}
	
	protected void dysplayInfo() {
		System.out.println("Title:" + title + " Author:" + author);
	}
	

}
