package model;

public class DVD implements IArticle {
	
	private String description;
	private int price;
	
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
	public String toString() {
		return "[CD] Price: "+price+", Description: "+description;
	}

}
