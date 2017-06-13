package model;

import java.util.List;

public class Store {

	private List<IArticle> articles;
	
	public void addArticle(IArticle article) {
		articles.add(article);
	}
	
	public void removeArticle(IArticle article) {
		articles.remove(article);
	}
}
