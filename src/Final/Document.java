package Final;

import java.util.ArrayList;

public class Document {
	private final ArrayList<Element> elements = new ArrayList<>();

	public Document() {
	}

	public void addElement(Element element) {
		elements.add(element);
	}

	public void addElement(int position, Element element) {
		elements.add(position, element);
	}

	public void removeElement(Element element) {
		elements.remove(element);
	}

	public void changePosition(int currentPosition, int newPosition) {
		Element element = elements.get(currentPosition);
		removeElement(element);
		addElement(newPosition, element);
	}

	public void changePosition(Element element, int newPosition) {
		removeElement(element);
		addElement(newPosition, element);
	}
}
