package model;

public class Book implements IArticle {

	private String author;
	private String title;
	private String description;
	private double price;
	private int year;
	private int quantity;
	
	public Book() {}
	
	public Book(String author, String title, String description, int year, double price) {
		this.author = author;
		this.title = title;
		this.description = description;
		this.price = price;
		this.year = year;
	}
	
	@Override
	public String getDescription() {
		return description;
	}

	@Override
	public void setDescription(String description) {
		this.description = description;
	}

	@Override
	public double getPrice() {
		return price;
	}

	@Override
	public void setPrice(double price) {
		this.price = price;
	}

	@Override
	public int getYear() {
		return year;
	}

	@Override
	public void setYear(int year) {
		this.year = year;
	}
	
	@Override
	public int getQuantity() {
		return quantity;
	}

	@Override
	public void setQuantity(int quantity) {
		this.quantity = quantity;
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
