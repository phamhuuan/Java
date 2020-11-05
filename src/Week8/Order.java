package Week8;

import java.util.ArrayList;
import java.util.List;

public class Order {

	private final List<Media> itemsOrdered = new ArrayList<>();

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
			media.getDetail();
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