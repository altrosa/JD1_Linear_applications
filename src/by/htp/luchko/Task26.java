package by.htp.luchko;

import java.util.Scanner;

public class Task26 {

	/*
	 * Найти площадь треугольника, две стороны которого равны а и b, а угол между
	 * этими сторонами у.
	 * 
	 */

	public static void main(String[] args) {

		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		System.out.print("Введите сторону a: ");
		double a = sc.nextDouble();
		System.out.print("Введите сторону b: ");
		double b = sc.nextDouble();
		System.out.print("Введите угол u < 90: ");
		double u = sc.nextDouble();

		double s = (a * b * Math.sin(u) / 2);

		System.out.println("S = " + s);

	}

}
