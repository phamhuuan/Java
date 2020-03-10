package Week1;

import java.util.Scanner;

public class Example4 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter height of triangle: ");
		int height = scanner.nextInt();
		for (int i = 0; i < height; i++) {
			for (int j = 0; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		for (int i = 0; i < height; i++) {
			for (int j = 0; j <= height - i; j++) {
				System.out.print(' ');
			}
			for (int j = 0; j <= 2 * i - 1; j++) {
				System.out.print('*');
			}
			System.out.println();
		}
	}
}
