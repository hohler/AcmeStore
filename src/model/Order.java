package model;

import java.util.ArrayList;
import java.util.List;

public class Order {

	private List<IArticle> articles;
	private Customer customer;
	
	{
		articles = new ArrayList<>();
	}
	
	public Order() {}
	
	public Order(Customer customer) {
		this.customer = customer;
	}
	
	public void addArticle(IArticle article) {
		articles.add(article);
	}
	
	public void removeArticle(IArticle article) {
		articles.remove(article);
	}
	
	public List<IArticle> getArticles() {
		return new ArrayList<>(articles);
	}
	
	public void setCustomer(Customer customer) {
		this.customer = customer;
	}
	
	public Customer getCustomer() {
		return customer;
	}
}
