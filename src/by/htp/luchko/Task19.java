package by.htp.luchko;

import java.util.Scanner;

public class Task19 {

	/*
	 * Дана сторона равностороннего треугольника. Найти площадь этого треугольника,
	 * его высоту, радиусы вписанной и описанной окружностей.
	 */

	public static void main(String[] args) {

		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		System.out.print("Введите сторону треугольника: ");
		double a = sc.nextDouble();

		double s = (Math.pow(a, 2) * Math.sqrt(3)) / 4;
		System.out.println("Площадь: " + s);

		double h = (a * Math.sqrt(3)) / 2;
		System.out.println("Высота: " + h);

		double ro = a / Math.sqrt(3);
		System.out.println("Радиус описанной окружности:" + ro);
		
		double rv = a / (2 * Math.sqrt(3));
		System.out.println("Радиус вписанной окружности: " + rv);

	}

}
