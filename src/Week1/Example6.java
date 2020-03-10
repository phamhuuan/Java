package Week1;

import javax.swing.JOptionPane;

public class Example6 {
	public static void main(String[] args) {
		String num1, num2;
		String showText = "Sum of ";
		num1 = JOptionPane.showInputDialog(null, "Enter first number", "Enter number", JOptionPane.INFORMATION_MESSAGE);
		num2 = JOptionPane.showInputDialog(null, "Enter second number", "Enter number", JOptionPane.INFORMATION_MESSAGE);
		showText += num1 + " and " + num2 + " is: " + (Integer.parseInt(num1) + Integer.parseInt(num2));
		JOptionPane.showMessageDialog(null, showText, "Show number", JOptionPane.INFORMATION_MESSAGE);
		System.exit(0);
	}
}
