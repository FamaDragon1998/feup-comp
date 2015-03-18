package test;

import java.util.ArrayList;

public class Test {

	private static ArrayList<Book> library;

	public static void main(String[] args) {
		System.out.println("Hello world!");
		System.out.println();
		
		library = new ArrayList<Book>();
		library.add(new Book("978-3-16-148410-0", "compiler"));
		library.add(new Book("978-3-16-148411-0", "interpreter"));
		library.add(new Book("978-3-16-148412-0", "languages"));
		library.add(new Book("978-3-16-148413-0", "test"));

		System.out.println("Books in library: ");
		for (Book book : library)
			System.out.println(book.getTitle() + "\t" + book.getISBN());
		System.out.println();

		// library is ArrayList of books
		
		/*@jQ
		
		in library; // library is a collection of objects of the class book
		out selected; // selected is an output collection of selected book ISBNs
		
		selected = $("library[title*='compiler'] isbn");
		
		*/

		System.out.println("Good bye world!");
	}

}
