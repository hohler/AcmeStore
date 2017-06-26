

import fixtures.Customers;
import model.CD;
import model.DVD;
import model.Order;

public class Test {

	public static void main(String[] args) {
		Store store = new Store();
		
		CD cd = new CD();
		cd.setArtist("Beetles");
		cd.setDescription("Nice music");
		cd.setYear(1970);
		cd.setPrice(20.95);
		
		DVD dvd = new DVD();
		dvd.setDescription("Nice movie");
		dvd.setPrice(45.00);
		dvd.setYear(2011);
		
		store.addArticle(cd);
		store.addArticle(dvd);
		
		
		
		Order order = new Order(new Customers().getFixtures().get(0));
		
		order.addArticle(cd);
		order.addArticle(dvd);
	}
}
