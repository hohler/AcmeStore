package model;

public class Book implements IArticle {

	private String description;
	private double price;
	private int year;
	private int quantity;
	
	public Book() {}
	
	public Book(String description, int year, double price) {
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
		quantity = quantity;
	}

	@Override
	public String toString() {
		return "[Book] Price: "+price+", Description: "+description;
	}

	
}
