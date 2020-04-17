package Week5;

import java.util.Random;
import java.util.StringTokenizer;

public class TestString {
	public static void addTwo(int i) {
		i += 2;
	}
	public static void main(String[] args) {
		String title = "Harry Potter and fire cup";
		System.out.println(title.contains("Harry"));
		System.out.println(title.contains("Hello"));
		StringTokenizer stringTokenizer = new StringTokenizer(title, " ");
		System.out.println(stringTokenizer.countTokens());
		while (stringTokenizer.hasMoreTokens()) {
			System.out.println(stringTokenizer.nextToken());
		}
		String[] strings;
		strings = title.split(" ");
		for (String string : strings) {
			System.out.println(string);
		}
		System.out.println(Math.random());
		Random random = new Random();
		// random number in [0;9]
		int x = random.nextInt(10);
		System.out.println(x);
		String a = "1", c = "1";
		String b = new String("1");
		System.out.println((a==c));
		int i = 0;
		addTwo(i++);
		System.out.println(i);
		System.out.println(2%3*4);
	}
}
