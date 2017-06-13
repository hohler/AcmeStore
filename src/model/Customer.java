package model;

public class Customer {

	private String firstName;
	private String lastName;
	private int postCode;
	private String town;
	private String street;
	
	public Customer() {}
	
	public Customer(String firstName, String lastName, String street, int postCode, String town) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.street = street;
		this.postCode = postCode;
		this.town = town;
	}
	
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
		
	public int getPostCode() {
		return postCode;
	}

	public void setPostCode(int postCode) {
		this.postCode = postCode;
	}

	public String getTown() {
		return town;
	}

	public void setTown(String town) {
		this.town = town;
	}

	public String getStreet() {
		return street;
	}

	public void setStreet(String street) {
		this.street = street;
	}

	@Override
	public String toString() {
		return "[Customer First name: "+firstName+", last name: "
				+lastName+", street: "+street+", post code: "+postCode+", town: "+town+"]";
	}
}
