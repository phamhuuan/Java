package Week4;

public class Order {
	public static final int MAX_NUMBERS_ORDERED = 10;
	private DigitalVideoDisc itemOrdered[] = new DigitalVideoDisc[MAX_NUMBERS_ORDERED];
	private int qtyOrdered = 0;

	public int getQtyOrdered() {
		return qtyOrdered;
	}

	public void setQtyOrdered(int qtyOrdered) {
		this.qtyOrdered = qtyOrdered;
	}

	public void addDigitalVideoDisc(DigitalVideoDisc disc) {
		if (qtyOrdered < MAX_NUMBERS_ORDERED) {
			itemOrdered[qtyOrdered++] = disc;
		}
	}

	public void addDigitalVideoDisc(DigitalVideoDisc[] discs) {
		if (qtyOrdered < MAX_NUMBERS_ORDERED - discs.length) {
			for (int i = 0; i < discs.length; i++) {
				itemOrdered[qtyOrdered++] = discs[i];
			}
		}
	}

	public void removeDigitalVideoDisc(DigitalVideoDisc disc) {
		DigitalVideoDisc tmp[] = new DigitalVideoDisc[MAX_NUMBERS_ORDERED];
		int i, j;
		for (i = 0,j = 0; i < qtyOrdered; i++) {
			if (!itemOrdered[i].getTitle().equals(disc.getTitle())) {
				System.out.println(disc.getTitle());
				tmp[j++] = itemOrdered[i];
			}
		}
		tmp[j++] = null;
		qtyOrdered--;
		itemOrdered = tmp;
	}

	public int totalCost() {
		int total = 0;
		for (int i = 0; i < qtyOrdered; i++) {
			total += itemOrdered[i].getCost();
		}
		return total;
	}
}
