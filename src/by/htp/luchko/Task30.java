package by.htp.luchko;

import java.util.Scanner;

public class Task30 {

	/*
	 * Три сопротивления R1 R2, и R3 соединены параллельно. Найдите сопротивление
	 * соединения
	 */

	public static void main(String[] args) {

		double r1, r2, r3;

		double full;

		r1 =  enterFromConsole("Enter r1: ");
		r2 =  enterFromConsole("Enter r2: ");
		r3 =  enterFromConsole("Enter r3: ");

		full = 1 / ((1 / r1) + (1 / r2) + (1 / r3));

		System.out.println("Сопротивление соединений: " + full);

	}

	public static int enterFromConsole(String message) {

		int value;

		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		System.out.print(message);
		while (!sc.hasNextInt()) {
			System.out.print(message);
		}
		value = sc.nextInt();

		return value;
	}
}
