
public class Student {
	private int id;
	private String nameString;

	public Student(int id, String nameString) {
		super();
		this.id = id;
		this.nameString = nameString;
	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", nameString=" + nameString + "]";
	}
	

}
