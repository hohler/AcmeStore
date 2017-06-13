package model;

public class CD extends Article {

	private String artist;
	
	public CD() {
		super();
	}
	
	public CD(String artist, String description, int year, double price) {
		super(description, year, price);
		this.artist = artist;
	}
	
	public String getArtist()  {
		return artist;
	}
	
	public void setArtist(String artist) {
		this.artist = artist;
	}
	
	@Override
	public String toString() {
		System.out.println("toString() executing...");
		return "[CD Artist: "+artist+" Price: "+price
				+", Description: "+description+", Year: "+year+", Quantity: "+quantity+"]";
	}
}
