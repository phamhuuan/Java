package Week3;

import java.util.Scanner;

public class MyDate {
	private int date, month, year;

	public int getDate() {
		return date;
	}

	public int getMonth() {
		return month;
	}

	public int getYear() {
		return year;
	}

	public void setDate(int date) {
		this.date = date;
	}

	public void setMonth(int month) {
		this.month = month;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public void initDateWithoutParam () {
		setDate(20);
		setMonth(5);
		setYear(2020);
	}

	public void initDateWithParam (int date, int month, int year) {
		setDate(date);
		setMonth(month);
		setYear(year);
	}

	public void inputFromKeyboard () {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Date: ");
		int date = scanner.nextInt();
		System.out.print("Month: ");
		int month = scanner.nextInt();
		System.out.print("Year: ");
		int year = scanner.nextInt();
		System.out.println(date + "/" + month + "/" + year);
	}
}
