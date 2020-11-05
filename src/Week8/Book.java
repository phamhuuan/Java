package Week8;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class Book extends Media implements Comparable {
	private ArrayList<String> authors = new ArrayList<>();
	private String content;
	private List<String> contentTokens;
	private Map<String, Integer> wordFrequency;

	public Book() {

	}

	public void processContent() {
		content.split(" ");
	}

	public void getDetail() {
		super.getDetail();
		System.out.print("Authors:");
		for (String author: getAuthors()) {
			System.out.print("\t" + author);
		}
		System.out.println();
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

	@Override
	public int compareTo(Object object) {
		return this.getTitle().compareTo(((Book)object).getTitle());
	}
}
