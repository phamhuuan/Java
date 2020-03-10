package Week1;

import javax.swing.JOptionPane;

public class Example5 {
	public static void main(String[] args) {
		String num1, num2;
		String showText = "You have entered ";
		num1 = JOptionPane.showInputDialog(null, "Enter first number", "Enter number", JOptionPane.INFORMATION_MESSAGE);
		num2 = JOptionPane.showInputDialog(null, "Enter second number", "Enter number", JOptionPane.INFORMATION_MESSAGE);
		showText += num1 + " and " + num2;
		JOptionPane.showMessageDialog(null, showText, "Show number", JOptionPane.INFORMATION_MESSAGE);
		System.exit(0);
	}
}
