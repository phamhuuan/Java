package Week2;

public class Example5 {
	public static void main(String[] args) {
		for (int i = 1; i <= 9; i++) {
			for (int j = 0; j <= 9; j++) {
				for (int k = 0; k <= 9; k++) {
					System.out.print(Integer.toString(i) + j + k + k + j + i + " ,");
				}
			}
		}
	}
}
