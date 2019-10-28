package by.htp.luchko;

import java.util.Scanner;

public class Task05 {

	// Составить алгоритм нахождения среднего арифметического двух чисел.

	public static void main(String[] args) {

		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);

		System.out.print("Введите первое число: ");

		double a = sc.nextDouble();

		System.out.print("Введите второе число: ");

		double b = sc.nextDouble();

		double z = (a + b) / 2;

		System.out.println("Среднее арифметическое введенных чисел равно: " + z);

	}

}
