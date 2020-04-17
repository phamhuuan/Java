package Week6;

import java.util.ArrayList;

public class Order {

	private final ArrayList<Media> itemsOrdered = new ArrayList<>();

	public Order() {
	}

	public void addMedia(Media media) {
		if (!itemsOrdered.contains(media)) {
			itemsOrdered.add(media);
		}
	}

	public void removeMedia(Media media) {
		itemsOrdered.remove(media);
	}

	public Media getItemById(String id) {
		for(Media media : itemsOrdered) {
			if (id.equals(media.getId())) {
				return media;
			}
		}
		return null;
	}

	public void showAllItems() {
		for(Media media : itemsOrdered) {
			switch (media.getType()) {
				case "DigitalVideoDisc":
					DigitalVideoDisc digitalVideoDisc = (DigitalVideoDisc)media;
					System.out.println("Id: " + digitalVideoDisc.getId());
					System.out.println("Title: " + digitalVideoDisc.getTitle());
					System.out.println("Category: " + digitalVideoDisc.getCategory());
					System.out.println("Directory: " + digitalVideoDisc.getDirector());
					System.out.println("Cost: " + digitalVideoDisc.getCost());
					System.out.println("Length: " + digitalVideoDisc.getLength());
					break;
				case "Book":
					Book book = (Book)media;
					System.out.println("Id: " + book.getId());
					System.out.println("Title: " + book.getTitle());
					System.out.println("Category: " + book.getCategory());
					System.out.println("Cost: " + book.getCost());
					System.out.print("Authors:");
					for (String author: book.getAuthors()) {
						System.out.print("\t" + author);
					}
					System.out.println();
			}
		}
	}

	public float totalCost() {
		float total = 0;
		Media media;
		for (Media value : itemsOrdered) {
			media = value;
			total += media.getCost();
		}
		return total;
	}
}