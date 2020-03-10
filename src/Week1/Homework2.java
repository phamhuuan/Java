package Week1;

import javax.swing.*;

public class Homework2 {
	static float add(float solve, float num) {
		return solve + num;
	}
	static float sub(float solve, float num) {
		return solve - num;
	}
	public static void main(String[] args) {
		Object[] options = { "Plus", "Minus", "Solve", "Exit" };
		Object selectedValue;
		String a;
		String str = "";
		float numA, solve = 0;
		while (true) {
			selectedValue = JOptionPane.showOptionDialog(null, "Current: " + str, "Calculator", JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE, null, options, options[0]);
			switch ((Integer)selectedValue) {
				case 0:
					a = JOptionPane.showInputDialog(null, "Enter a", "Solve ax + b = 0" ,JOptionPane.INFORMATION_MESSAGE);
					numA = Float.parseFloat(a);
					str += str == "" ? numA : " + " + numA;
					solve = add(solve, numA);
					break;
				case 1:
					a = JOptionPane.showInputDialog(null, "Enter a", "Solve ax + b = 0" ,JOptionPane.INFORMATION_MESSAGE);
					numA = Float.parseFloat(a);
					str += str == "" ? numA : " - " + numA;
					solve = sub(solve, numA);
					break;
				case 2:
					JOptionPane.showMessageDialog(null, "Solution: " + solve, "Solve", JOptionPane.INFORMATION_MESSAGE);
					solve = 0;
					str = "";
					break;
				default:
					System.exit(0);
			}
		}
	}
}
