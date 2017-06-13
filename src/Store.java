import java.util.ArrayList;
import java.util.List;

import fixtures.*;
import model.IArticle;

public class Store {

	private List<IArticle> articles;
	
	public Store() {
		articles = new ArrayList<>();
		
		articles.addAll(new Books().getFixtures());
		articles.addAll(new CDs().getFixtures());
		articles.addAll(new DVDs().getFixtures());
	}
	
	public void addArticle(IArticle article) {
		articles.add(article);
	}
	
	public void removeArticle(IArticle article) {
		articles.remove(article);
	}
}
