package test;

public class Book {

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
