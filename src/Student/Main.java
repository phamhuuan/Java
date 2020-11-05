package Student;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Student Id: ");
		String studentId = scanner.nextLine();
		System.out.println("Birthday: ");
		String birthday = scanner.nextLine();
		System.out.println("CPA: ");
		Float cpa = scanner.nextFloat();
	}
}
