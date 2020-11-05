package Final;

public class Main {
	public static void main(String[] args) {
		Document document = new Document();
		Text text1 = new Text("Hello World", Font.ARIAL, 14.5f, Colors.RED, Colors.YELLOW);
		document.addElement(text1);
	}
}
