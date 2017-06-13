package model;

public class CD implements IArticle {

	private String artist;
	
	private String description;
	private int price;
	
	public String getArtist()  {
		return artist;
	}
	
	public void setArtist(String artist) {
		artist = artist;
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
	public int getPrice() {
		return price;
	}

	@Override
	public void setPrice(int price) {
		this.price = price;
	}

}
