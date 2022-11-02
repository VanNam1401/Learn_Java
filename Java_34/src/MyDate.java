import javax.print.attribute.standard.MediaSize.Other;

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

	public String toString() {
		return this.day + "/" + this.month + "/" + this.year;
	}

	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + day;
		result = prime * result + month;
		result = prime * result + year;
		return result;
	}

	// so sánh lớp đang đứng với một đối tượng truyền vào
	public boolean equals(Object oop) {
		// so sánh this(lớp đang đứng) với đối tượng oop
		// so sánh 2 đối tượng.
		if (this == oop) {
			return true;
		}
		// so sánh đối tượng truyền vào không tồn tại.
		if (oop == null) {
			return false;
		}
		// so sánh class đang đứng có giống với class được truyền vào không
		if (this.getClass() != oop.getClass()) {
			return false;
		}
		// so sánh từng dữ liệu bên trong của đối tượng truyền vào.
		MyDate other = (MyDate) oop;
		if (this.day != other.day) {
			return false;
		}
		if (this.month != other.month) {
			return false;
		}
		if (this.year != other.year) {
			return false;
		}
		return true;
	}
}
