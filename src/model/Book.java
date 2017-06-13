package model;

public class Book extends Article {

	private String author;
	private String title;
	
	public Book() {
		super();
	}
	
	public Book(String author, String title, String description, int year, double price) {
		super(description, year, price);
		this.author = author;
		this.title = title;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	@Override
	public String toString() {
		System.out.println("toString() executing...");
		return "[Book Title: "+title+", Author: "+author+", Price: "+price+", Description: "+description+", Year: "+year+", Quantity: "+quantity+"]";
	}

	
}
