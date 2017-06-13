package fixtures;

import java.util.ArrayList;
import java.util.List;

import model.Customer;

public class Customers {

	public List<Customer> getFixtures() {
		List<Customer> f = new ArrayList<>();
		
		Customer customer1 = new Customer("Max", "Muster", "Hauptstrasse 1", 3000, "Bern");
		f.add(customer1);
		
		Customer customer2 = new Customer("John", "Smith", "Main street 5", 20001, "Washington DC");
		f.add(customer2);
		
		Customer customer3 = new Customer("Marty", "McFly", "Time Travel Road 2015", 1111, "Universe");
		f.add(customer3);
		
		return f;
	}

}
