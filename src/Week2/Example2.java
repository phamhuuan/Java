package Week2;

public class Example2 {
	public static void main(String[] args) {
		int data[] = {78, 65, 78, 21, 93, 45, 33, 55, 22, 81};
		int max = data[0];
		int min = data[0];
		for (int datum : data) {
			if (max < datum) max = datum;
			if (min > datum) min = datum;
		}
		System.out.println("max: " + max);
		System.out.println("min: " + min);
	}
}
