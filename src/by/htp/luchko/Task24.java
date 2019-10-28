package by.htp.luchko;

import java.util.Scanner;

public class Task24 {

	/*
	 * Найти площадь равнобедренной трапеции с основаниями а и b и углом α при
	 * большем основании а
	 */

	public static void main(String[] args) {

		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		System.out.print("Введите большее основание a: ");
		double a = sc.nextDouble();
		System.out.print("Введите меньшее основание b: ");
		double b = sc.nextDouble();
		System.out.print("Введите острый угол в градусах: ");
		double u = sc.nextDouble();
		double h = (a - b) / 2 * Math.atan(u);
		double s = ((a + b) * h) / 2;

		if (a > b & u < 90) {
			System.out.println("S = " + s);

		} else {

			System.out.println("Введите корректные данные ( a > b, u < 90");
		}

	}

}
