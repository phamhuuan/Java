package Week2;

import java.util.Scanner;

public class Example3 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter number: ");
		int x = scanner.nextInt();
		float sum = 0.0f;
		for (int i = 1; i <= x; i++) {
			sum += 1 / (float)i;
		}
		System.out.println(sum);
	}
}
