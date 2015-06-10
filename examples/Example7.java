import java.util.ArrayList;

public class Main {

	private static ArrayList<Book> library;

	public static void main(String[] args) {
		library = new ArrayList<Book>();
		library.add(new Book("978-3-16-148410-0", "compiler"));
		library.add(new Book("978-3-16-148411-0", "interpreter"));
		library.add(new Book("978-3-16-148412-0", "languages"));
		library.add(new Book("978-3-16-148413-0", "test"));

		ArrayList<Book> selected = new ArrayList<Book>();

		/*@jQ
		selected = $("library[getTitle()*='comp']");
		*/

		System.out.println("Books in library: ");
		for (Book book : library)
			System.out.println(book.getTitle() + "\t" + book.getISBN());
		System.out.println("- end -");

		System.out.println();

		System.out.println("Selected:");
		for (Book book : selected)
			System.out.println(book.getTitle() + "\t" + book.getISBN());
		System.out.println("- end -");
	}

}

class Book {

	private String isbn, title;

	public Book(String isbn, String title) {
		this.isbn = isbn;
		this.title = title;
	}

	public String getISBN() {
		return isbn;
	}

	public String getTitle() {
		return title;
	}

}
