package fixtures;

import java.util.ArrayList;
import java.util.List;

import model.CD;
import model.IArticle;

public class CDs implements IFixture {

	@Override
	public List<IArticle> getFixtures() {
		List<IArticle> f = new ArrayList<>();
		
		CD cd1 = new CD("Nirvana", "Nevermind", 1991, 19.00);
		f.add(cd1);
		
		CD cd2 = new CD("Michael Jakson", "Thriller", 1982, 18.50);
		f.add(cd2);
		
		CD cd3 = new CD("Britney Spears", "Baby One More Time", 1999, 11.90);
		f.add(cd3);		
		
		return f;
	}

	
}
