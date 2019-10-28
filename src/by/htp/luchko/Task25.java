package by.htp.luchko;

import java.util.Scanner;

public class Task25 {

	/*
	 * Вычислить корни квадратного уравнения ах2+ bх + с = 0 с заданными
	 * коэффициентами a, b и с (предполагается, что а≠0 и что дискриминант уравнения
	 * неотрицателен).
	 */

	public static void main(String[] args) {

		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		System.out.print("Введите a ≠ 0 : ");
		double a = sc.nextDouble();
		System.out.print("Введите b: ");
		double b = sc.nextDouble();
		System.out.print("Введите c: ");
		double c = sc.nextDouble();

		double d = Math.pow(b, 2) - 4 * a * c;

		double x1 = (b * (-1) + Math.sqrt(d)) / 2 * a;
		double x2 = (b * (-1) - Math.sqrt(d)) / 2 * a;

		if (d < 0) {
			System.out.println("Уравнение имеет 2 мнимых корня (т.е. вещественных корней нет).");
		} else if (a == 0) {

			System.out.println("Введите a ≠ 0 ");
			 
		} else {

			System.out.println("Корни уравнения: x1 = " + x1 + " x2 = " + x2);
		}

	}

}
