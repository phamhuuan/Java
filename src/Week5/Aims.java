package Week5;

public class Aims {
	private static Order order = new Order();
	public static void main(String[] args) {
//		DigitalVideoDisc[] discs = new DigitalVideoDisc[10];
		DigitalVideoDisc disc1 = new DigitalVideoDisc("Dia 1", "Category 1", "Director 1", 5, 1000);
		DigitalVideoDisc disc2 = new DigitalVideoDisc("Dia 2", "Category 2", "Director 2", 10, 2000);
		DigitalVideoDisc disc3 = new DigitalVideoDisc("Dia 3", "Category 3", "Director 3", 15, 3000);
		DigitalVideoDisc disc4 = new DigitalVideoDisc("Dia 4", "Category 4", "Director 4", 20, 4000);
		DigitalVideoDisc disc5 = new DigitalVideoDisc("Dia 5", "Category 5", "Director 5", 25, 5000);
		DigitalVideoDisc disc6 = new DigitalVideoDisc("Dia 6", "Category 6", "Director 6", 30, 6000);
		order.addDigitalVideoDisc(disc1);
		order.addDigitalVideoDisc(disc2);
		order.addDigitalVideoDisc(disc3);
		DigitalVideoDisc discs[] = new DigitalVideoDisc[3];
		discs[0] = disc4;
		discs[1] = disc5;
		discs[2] = disc6;
		order.addDigitalVideoDisc(discs);
		System.out.println(order.getQtyOrdered());
		order.removeDigitalVideoDisc(disc1);
		System.out.println(order.getQtyOrdered());
		System.out.println(order.totalCost());
	}
}
