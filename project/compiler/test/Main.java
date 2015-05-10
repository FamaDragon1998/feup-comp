package test;

import java.util.ArrayList;

public class Main {

	private static ArrayList<Book> library;

	public static void main(String[] args) {
		System.out.println("Hello world!");
		System.out.println();

		// library is ArrayList of books
		library = new ArrayList<Book>();
		library.add(new Book("978-3-16-148410-0", "compiler"));
		library.add(new Book("978-3-16-148411-0", "interpreter"));
		library.add(new Book("978-3-16-148412-0", "languages"));
		library.add(new Book("978-3-16-148413-0", "test"));

		System.out.println("Books in library: ");
		for (Book book : library)
			System.out.println(book.getTitle() + "\t" + book.getISBN());
		System.out.println("- end -");
		System.out.println();

		// selected is ArrayList<String> of ISBNs
		ArrayList<String> selected = new ArrayList<String>();

		// jQuery block was here
		
		System.out.println("Selected:");
		for (String str : selected)
			System.out.println(str);
		System.out.println("- end -");
		System.out.println();

		System.out.println("Good bye world!");
	}

}
