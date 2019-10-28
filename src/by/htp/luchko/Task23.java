package by.htp.luchko;

import java.util.Scanner;

public class Task23 {

	// Найти площадь кольца, внутренний радиус которого равен r, а внешний — R (R>
	// r).

	public static void main(String[] args) {

		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		System.out.print("Введите внутренний радуис r: ");
		double r = sc.nextDouble();
		System.out.print("Введите внешний радуис R: ");
		double r2 = sc.nextDouble();
		double s = Math.PI * (Math.pow(r2, 2) - Math.pow(r, 2));

		if (r2 > r) {
			System.out.println("Площадь кольца S = " + s);
		} else {
			System.out.println("Введите корректные значения (R > r)");
		}

	}

}
