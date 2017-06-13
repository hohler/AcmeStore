package fixtures;

import java.util.ArrayList;
import java.util.List;

import model.IArticle;
import model.Book;

public class Books implements IFixture {

	@Override
	public List<IArticle> getFixtures() {
		List<IArticle> f = new ArrayList<>();
		
		Book book1 = new Book("J. K. Rowling", "Harry Potter and the Chamber of Secrets", "Cool book!", 1998, 9.95);
		f.add(book1);
		
		Book book2 = new Book("Nick Hornby", "A Long Way Down", "Suicidal", 2005, 12.00);
		f.add(book2);
		
		Book book3 = new Book("Suzanne Collins", "The Hunger Games", "Makes me hungry", 2008, 20.95);
		f.add(book3);
		
		return f;
	}

}
