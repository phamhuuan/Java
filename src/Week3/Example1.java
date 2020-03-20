package Week3;

public class Example1 {
	private static MyDate myDate = new MyDate();
	private static Math math = new Math();
	public static void main(String[] args) {
//		myDate.inputFromKeyboard();
		math.print(math.add(new Complex(2, 3), new Complex(3, 4)));
		math.print(math.sub(new Complex(2, 3), new Complex(3, 4)));
		math.print(math.mul(new Complex(2, 3), new Complex(3, 4)));
		math.print(math.div(new Complex(2, 3), new Complex(3, 4)));
	}
}
