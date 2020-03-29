package Week4;

public class DateMain {
	public static void main(String args[]) {
		MyDate date1 = new MyDate(12, 8, 2020);
		MyDate date2 = new MyDate(20, 4, 2020);
		MyDate date3 = new MyDate(12, 6, 2020);
		date1.print();
		date1.print("yyyy/MM/dd");
		date2.print("yyyy/MM/dd");
		MyDate[] dates = {date1, date2, date3};
		DateUtils.compareTo(date1,date2);
		DateUtils.sort(dates);
	}
}
