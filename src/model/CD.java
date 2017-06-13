package model;

public class CD implements IArticle {

	private String artist;
	
	private String description;
	private double price;
	private int year;
	
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
	public void setYear(int year) {
		year = year;
	}
}
