
public class MyDate {
	private int day;
	private int month;
	private int year;

	public MyDate(int d, int m, int y) {
		if (d >= 1 && d <= 31) {
			this.day = d;
		} else {
			this.day = 1;
		}
		if (m >= 1 && m <= 12) {
			this.month = m;
		} else {
			this.month = 1;
		}
		if (y >= 1) {
			this.year = y;
		} else {
			this.year = 1;
		}
	}

	public int getDay() {
		return this.day;
	}

	public void setDay(int day2) {
		if (day2 >= 1 && day2 <= 31) {
			this.day = day2;
		}
	}

	public int getMonth() {
		return this.month;
	}

	public void setMonth(int month2) {
		if (month2 >= 1 && month2 <= 12) {
			this.month = month2;
		}
	}

	public int getYear() {
		return this.year;
	}

	public void setYear(int year2) {
		if (year2 >= 1) {
			this.year = year2;
		}
	}

}
