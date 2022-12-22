package model;

import java.util.Date;
import java.util.Objects;

public class Student implements Comparable<Student> {
    private String code; // mã sinh viên
    private String fullName; //họ và tên
    private Date birthYear; // sinh năm
    private String className; // tên lớp
    private double averageGrade; // điểm trung bình.

    public Student(String code, String fullName, Date birthYear, String className, double averageGrade) {
        this.code = code;
        this.fullName = fullName;
        this.birthYear = birthYear;
        this.className = className;
        this.averageGrade = averageGrade;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public Date getBirthYear() {
        return birthYear;
    }

    public void setBirthYear(Date birthYear) {
        this.birthYear = birthYear;
    }

    public String getClassName() {
        return className;
    }

    public void setClassName(String className) {
        this.className = className;
    }

    public double getAverageGrade() {
        return averageGrade;
    }

    public void setAverageGrade(double averageGrade) {
        this.averageGrade = averageGrade;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return Double.compare(student.averageGrade, averageGrade) == 0 && code.equals(student.code) && fullName.equals(student.fullName) && birthYear.equals(student.birthYear) && className.equals(student.className);
    }

    @Override
    public int hashCode() {
        return Objects.hash(code, fullName, birthYear, className, averageGrade);
    }

    @Override
    public int compareTo(Student o) {
        return (int) (this.getAverageGrade() - o.getAverageGrade());
    }

	@Override
	public String toString() {
		return "Student [code=" + code + ", fullName=" + fullName + ", birthYear=" + birthYear + ", className="
				+ className + ", averageGrade=" + averageGrade + "]";
	}
    
}
