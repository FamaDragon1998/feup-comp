import java.util.ArrayList;

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

public class Main {

	private static ArrayList<Book> library;

	public static void main(String[] args) {
		library = new ArrayList<Book>();
		library.add(new Book("978-3-16-148410-0", "compiler"));

		ArrayList<String> selected = new ArrayList<String>();

		/*@jQ
		selected = $("library[getTitle()*='comp']");
		*/
	}

}
