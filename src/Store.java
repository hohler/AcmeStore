import java.util.ArrayList;
import java.util.List;
import model.IArticle;

public class Store {

	private List<IArticle> articles;
	
	public Store() {
		articles = new ArrayList<>();
	}
	
	public void addArticle(IArticle article) {
		articles.add(article);
	}
	
	public void removeArticle(IArticle article) {
		articles.remove(article);
	}
}
