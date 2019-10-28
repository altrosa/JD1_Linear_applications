package by.htp.luchko;

public class Task13 {

	/*
	 * Заданы координаты трех вершин треугольника (х1 у2),(х2, у2) ),(х3, у3). Найти
	 * его периметр и площадь.
	 */

	public static void main(String[] args) {

		double x1 = 2;
		double x2 = 3;
		double x3 = 7;

		double y1 = 1;
		double y2 = 3;
		double y3 = 5;

		double d1 = Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
		double d2 = Math.sqrt(Math.pow(x3 - x1, 2) + Math.pow(y3 - y1, 2));
		double d3 = Math.sqrt(Math.pow(x3 - x2, 2) + Math.pow(y3 - y2, 2));

		double p = d1 + d2 + d3;
		double p1 = p / 2;

		double s = Math.sqrt(p1 * (p1 - d1) * (p1 - d2) * (p1 - d3));

		System.out.println("P = " + p);
		System.out.println("S = " + s);

	}

}
