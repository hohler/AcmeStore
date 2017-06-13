package model;

public class DVD extends Article {
	
	public DVD() {
		super();
	}
	
	public DVD(String description, int year, double price) {
		super(description, year, price);
	}
	
	@Override
	public String toString() {
		return "[DVD Price: "+price+", Description: "+description+", Year: "+year+", Quantity: "+quantity+"]";
	}
}
