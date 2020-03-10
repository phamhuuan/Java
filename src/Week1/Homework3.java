package Week1;

import javax.swing.*;

public class Homework3 {
	static int dates(int month, int year) {
		switch (month) {
			case 1:
			case 3:
			case 5:
			case 7:
			case 8:
			case 10:
			case 12:
				return 31;
			case 2:
				return (year % 400 == 0 || (year % 4 == 0 && year % 100 != 0)) ? 29 : 28;
			default:
				return 30;
		}
	}
	static String days(int day, int month, int year) {
		int JMD = (day + ((153 * (month + 12 * ((14 - month) / 12) - 3) + 2) / 5) +
						(365 * (year + 4800 - ((14 - month) / 12))) +
						((year + 4800 - ((14 - month) / 12)) / 4) -
						((year + 4800 - ((14 - month) / 12)) / 100) +
						((year + 4800 - ((14 - month) / 12)) / 400)  - 32045) % 7;
		String[] weekDay = {"Monday" , "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"};
		return weekDay[JMD];
	}
	public static void main(String[] args) {
		Object[] options = { "1", "2", "Exit" };
		String text = "1. Dates\n2. Day";
		Object selectedValue;
		String day, month, year;
		int numDay, numMonth, numYear;
		do {
			selectedValue = JOptionPane.showOptionDialog(null, text, "Menu", JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE, null, options, options[0]);
			switch ((Integer)selectedValue) {
				case 0:
					do{
						month = JOptionPane.showInputDialog(null, "Enter month", "Enter date" ,JOptionPane.INFORMATION_MESSAGE);
						year = JOptionPane.showInputDialog(null, "Enter year", "Enter date" ,JOptionPane.INFORMATION_MESSAGE);
						numYear = Integer.parseInt(year);
						System.out.println(numYear);
						numMonth = Integer.parseInt(month);
					} while (numYear <= 0 || numMonth > 12 || numMonth < 1);
					int date = dates(numMonth, numYear);
					JOptionPane.showMessageDialog(null, month + '/' + year + " has " + date + " days");
					break;
				case 1:
					do{
						day = JOptionPane.showInputDialog(null, "Enter day", "Enter date" ,JOptionPane.INFORMATION_MESSAGE);
						month = JOptionPane.showInputDialog(null, "Enter month", "Enter date" ,JOptionPane.INFORMATION_MESSAGE);
						year = JOptionPane.showInputDialog(null, "Enter year", "Enter date" ,JOptionPane.INFORMATION_MESSAGE);
						numDay = Integer.parseInt(day);
						numYear = Integer.parseInt(year);
						numMonth = Integer.parseInt(month);
					} while (numYear <= 0 || numMonth > 12 || numMonth < 1 || numDay < 1 || numDay > dates(numMonth, numYear));
					String weekDay = days(numDay, numMonth, numYear);
					JOptionPane.showMessageDialog(null, day + '/' + month + '/' + year + " is " + weekDay);
					break;
				case 2:
					System.exit(0);
					break;
			}
		} while ((Integer)selectedValue != 2);
	}
}
