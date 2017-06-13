package model;

public class DVD implements IArticle {
	
	private String description;
	private double price;
	private int year;
	private int quantity;
	
	public DVD() {}
	
	public DVD(String description, int year, double price) {
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
	
	@Override
	public String toString() {
		return "[CD] Price: "+price+", Description: "+description;
	}
}
