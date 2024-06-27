package com.samul.javaсorelessons.lesson18.book;

public class LibraryTest {

	public static void main(String[] args) {
		Book book = new Book("Java", "Ekkel");
		Book lBook1 = new LibraryBook("Java", "Horstmann");
		Book lBook2 = new LibraryBook("Java", "Horstmann", 3);
		LibraryBook lBook3 = new LibraryBook("Java", "Horstmann", 3);

		book.dysplayInfo();
		lBook1.dysplayInfo();
		lBook2.dysplayInfo();

		lBook3.dysplayInfo();

	}

}
