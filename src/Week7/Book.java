package Week7;

import java.util.ArrayList;

public class Book extends Media {
	private ArrayList<String> authors = new ArrayList<String>();
	public Book() {

	}

	public void addAuthor(String name) {
		if (!authors.contains(name)) {
			authors.add(name);
		}
	}

	public void setAuthors(ArrayList<String> authors) {
		this.authors = authors;
	}

	public ArrayList<String> getAuthors() {
		return authors;
	}
}
