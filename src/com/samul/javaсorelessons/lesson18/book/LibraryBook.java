package com.samul.javaсorelessons.lesson18.book;

public class LibraryBook extends Book{
	protected int shelfNumber;

	public LibraryBook(String title, String author, int shelfNumber) {
		super(title, author);
		this.shelfNumber = shelfNumber;
	}

	public LibraryBook(String title, String author) {
		this(title, author, -1);
	}
	
	@Override
	public void dysplayInfo() {
		System.out.println("Title:" + title + " Author:" + author + " Shelf number:" + shelfNumber);
	}

}
