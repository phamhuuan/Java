package Week2;

public class Example1 {
	public static void main(String[] args) {
		int data[] = {78, 65, 78, 21, 93, 45, 33, 55, 22, 81};
		int sum = 0;
		for (int datum : data) {
			sum += datum;
		}
		System.out.println("sum: " + sum);
		System.out.println("avg: " + (float)sum / data.length);
	}
}
