import java.util.ArrayList;
import java.util.List;

import fixtures.*;
import model.IArticle;

public class Store {

	public List<IArticle> articles;
	public static String STORE_NAME = "AcmeStore";
	
	public Store() {
		articles = new ArrayList<>();
		
		articles.addAll(new Books().getFixtures());
		articles.addAll(new CDs().getFixtures());
		articles.addAll(new DVDs().getFixtures());
		
		System.out.println("Store \""+ getStoreName() + "\" has been launched!");
	}
	
	public void addArticle(IArticle article) {
		articles.add(article);
	}
	
	public void removeArticle(IArticle article) {
		articles.remove(article);
	}
	
	public static String getStoreName() {
		return STORE_NAME;
	}
	
	private void methodWithSomeMetrics() {
		
		try {
			String x = getStoreName();
			if(x != null) {
				System.out.println(x);
			} else {
				x = null;
			}
		} catch (Exception e) {
			System.out.println("Catched some exception");
		}
	}
}
