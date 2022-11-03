
public class Main {
	public static void main(String[] args) {
		MyMath myMath = new MyMath();
		double arr[] = new double[] { 1, 2, 3, 4, 5 };
		System.out.println(myMath.timMin(5, 5));
		System.out.println(myMath.timMin(5.5, 6));

		System.out.println(myMath.tinhTong(5, 6));
		System.out.println((int) myMath.tinhTong(arr));

	}
}
