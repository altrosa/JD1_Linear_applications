package by.htp.luchko;

public class Task10 {

	/*
	 * Вычислить значение выражения по формуле (все переменные принимают
	 * действительные значения): (sin x + cos y / cos x - sin y) * tg xy.
	 */

	public static void main(String[] args) {

		double x = 2;
		double x1 = Math.sin(x);
		double x2 = Math.cos(x);

		double y = 4;
		double y1 = Math.cos(y);
		double y2 = Math.sin(y);

		double z = Math.tan(x * y);

		double r = ((x1 + y1) / (x2 - y2)) * z;

		System.out.println("r = " + r);

	}

}
