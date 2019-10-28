package by.htp.luchko;

import java.util.Scanner;

public class Task17 {

	/*
	 * Даны два числа. Найти среднее арифметическое кубов этих чисел и среднее
	 * геометрическое модулей этих чисел
	 */

	public static void main(String[] args) {

		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		System.out.print("Введите первое число: ");
		double a = sc.nextDouble();
		System.out.print("Введите второе число: ");
		double b = sc.nextDouble();

		double s = (Math.pow(a, 3) + Math.pow(b, 3)) / 2;
		System.out.println("Среднее арифметическое кубов чисел: " + s);

		double x = Math.sqrt(Math.abs(a) * Math.abs(b));
		System.out.println(x);

	}

}
