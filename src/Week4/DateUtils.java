package Week4;

public class DateUtils {
	public static int compareTo(MyDate date1, MyDate date2) {
		if (date1.getYear() > date2.getYear())
			return 1;
		if (date1.getYear() < date2.getYear())
			return -1;
		if (date1.getMonth() > date2.getMonth())
			return 1;
		if (date1.getMonth() < date2.getMonth())
			return -1;
		if (date1.getDate() > date2.getDate())
			return 1;
		if (date1.getDate() < date2.getDate())
			return -1;
		return 0;
	}

	public static void sort(MyDate[] dates) {
		for (int i = 0; i < dates.length - 1; i++) {
			for (int j = i + 1; j < dates.length; j++) {
				if (compareTo(dates[i], dates[j]) > 0) {
					MyDate temp = dates[i];
					dates[i] = dates[j];
					dates[j] = temp;
				}
			}
		}
		for (int i = 0; i < dates.length; i++) {
			dates[i].print("yyyy/MM/dd");
		}

	}
}
