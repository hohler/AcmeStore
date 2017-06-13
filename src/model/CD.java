package model;

public class CD implements IArticle {

	private String artist;
	
	private String description;
	private double price;
	private int year;
	private int quantity;
	
	public CD() {}
	
	public CD(String artist, String description, int year, double price) {
		this.artist = artist;
		this.description = description;
		this.price = price;
		this.year = year;
	}
	
	public String getArtist()  {
		return artist;
	}
	
	public void setArtist(String artist) {
		this.artist = artist;
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
	public int getQuantity() {
		return quantity;
	}

	@Override
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	@Override
	public void setYear(int year) {
		this.year = year;
	}
}
