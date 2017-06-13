package fixtures;

import java.util.ArrayList;
import java.util.List;

import model.DVD;
import model.IArticle;

public class DVDs implements IFixture {

	@Override
	public List<IArticle> getFixtures() {
		List<IArticle> f = new ArrayList<>();

		DVD dvd1 = new DVD("Day After Tomorrow", 2004, 16.00);
		f.add(dvd1);
		
		DVD dvd2 = new DVD("Pixels", 2015, 20.90);
		f.add(dvd2);
		
		DVD dvd3 = new DVD("2 Fast 2 Furious", 2003, 11.50);
		f.add(dvd3);
		
		return f;
	}

}
