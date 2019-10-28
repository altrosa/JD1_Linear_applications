package by.htp.luchko;

import java.util.Scanner;

public class Task18 {

	/*
	 * Дана длина ребра куба. Найти площадь грани, площадь полной поверхности и
	 * объем этого куба.
	 */

	public static void main(String[] args) {

		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		System.out.print("Введите длину ребра куба: ");
		double a = sc.nextDouble();

		double sg = a * a;
		System.out.println("Площадь грани куба: " + sg);

		double sp = sg * 6;
		System.out.println("Площадь поверхности куба: " + sp);

		double v = Math.pow(a, 3);
		System.out.println("Объём куба равен: " + v);

	}

}
