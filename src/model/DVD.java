package model;

public class DVD implements IArticle {
	
	private String description;
	private int price;
	private int year;
	
	@Override
	public String getDescription() {
		return description;
	}

	@Override
	public void setDescription(String description) {
		this.description = description;
	}

	@Override
	public int getPrice() {
		return price;
	}

	@Override
	public void setPrice(int price) {
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
	public String toString() {
		return "[CD] Price: "+price+", Description: "+description;
	}
}
