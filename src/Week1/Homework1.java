package Week1;

import javax.swing.JOptionPane;
import java.lang.Math;

public class Homework1 {
	static void firstDegreeEquation(float numA, float numB) {
		if (numA == 0.0) {
			JOptionPane.showMessageDialog(null,"Infinite Solution","Solution",  JOptionPane.INFORMATION_MESSAGE);
		}
		else {
			JOptionPane.showMessageDialog(null, "x = " + - numB / numA, "Solution", JOptionPane.INFORMATION_MESSAGE );
		}
	}
	static void secondDegreeEquation(float numA, float numB, float numC) {
		if (numA == 0.0) {
			firstDegreeEquation(numB, numC);
		}
		else {
			float delta = numB * numB - 4 * numA * numC;
			if (delta < 0.0) {
				JOptionPane.showMessageDialog(null,"No Solution","Solution",  JOptionPane.INFORMATION_MESSAGE);
			}
			else {
				double x1 = (- numB - Math.sqrt(delta)) / (2 * numA);
				double x2 = (- numB + Math.sqrt(delta)) / (2 * numA);
				if (delta == 0.0) {
					JOptionPane.showMessageDialog(null,"x = " + x1,"Solution",  JOptionPane.INFORMATION_MESSAGE);
				}
				else {
					JOptionPane.showMessageDialog(null,"x1 = " + x1 + '\n' + "x2 = " + x2,"Solution",  JOptionPane.INFORMATION_MESSAGE);
				}
			}
		}
	}
	public static void main(String[] args) {
		Object[] options = { "First degree equation", "Second degree equation", "Exit" };
		Object selectedValue;
		String a, b, c;
		float numA, numB, numC;
		do {
			selectedValue = JOptionPane.showOptionDialog(null, "Choose mode", "Solve equation", JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE, null, options, options[0]);
			switch ((Integer)selectedValue) {
				case 0:
					a = JOptionPane.showInputDialog(null, "Enter a", "Solve ax + b = 0" ,JOptionPane.INFORMATION_MESSAGE);
					b = JOptionPane.showInputDialog(null, "Enter b", "Solve ax + b = 0" ,JOptionPane.INFORMATION_MESSAGE);
					numA = Float.parseFloat(a);
					numB = Float.parseFloat(b);
					firstDegreeEquation(numA, numB);
					break;
				case 1:
					a = JOptionPane.showInputDialog(null, "Enter a", "Solve ax^2 + bx + c = 0" ,JOptionPane.INFORMATION_MESSAGE);
					b = JOptionPane.showInputDialog(null, "Enter b", "Solve ax^2 + bx + c = 0" ,JOptionPane.INFORMATION_MESSAGE);
					c = JOptionPane.showInputDialog(null, "Enter c", "Solve ax^2 + bx + c = 0" ,JOptionPane.INFORMATION_MESSAGE);
					numA = Float.parseFloat(a);
					numB = Float.parseFloat(b);
					numC = Float.parseFloat(c);
					secondDegreeEquation(numA, numB, numC);
					break;
				case 2:
					System.exit(0);
					break;
			}
		} while ((Integer)selectedValue != 2);
	}
}
