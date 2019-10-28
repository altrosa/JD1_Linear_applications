package by.htp.luchko;

public class Task14 {

	// ¬ычислить длину окружности и площадь круга одного и того же заданного радиуса
	// R.

	public static void main(String[] args) {

		double r = 9;

		double l = 2 * Math.PI * r;
		double s = Math.PI * Math.pow(r, 2);

		System.out.println("l = " + l);
		System.out.println("s = " + s);

	}

}
