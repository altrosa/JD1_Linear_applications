package by.htp.luchko;

import java.util.Scanner;

public class Task29 {

	// Найти (в радианах в градусах) все углы треугольника со сторонами а, b, с

	public static void main(String[] args) {

		double a, b, c;

		double alpha, beta, gamma;

		a = enterFromConsole("Enter a: ");
		b = enterFromConsole("Enter b: ");
		c = enterFromConsole("Enter c: ");

		alpha = Math.acos((Math.pow(a, 2) + Math.pow(b, 2) - Math.pow(c, 2)) / 2 * a * b);
		alpha = (alpha * 180) / Math.PI;
		beta = (180 - alpha) / 2;
		gamma = (180 - alpha - beta);

		if (Math.abs(a - b) < c & Math.abs(a + b) > c) {
			print(alpha, beta, gamma);
		} else {
			System.out.println("Это не треугольник");
		}

		alpha = (alpha * Math.PI ) / 180;
		beta = (beta * Math.PI) / 180;
		gamma = (gamma * Math.PI) / 180;

		print(alpha, beta, gamma);

	}

	public static double enterFromConsole(String message) {

		double value;

		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		System.out.print(message);
		while (!sc.hasNextDouble()) {
			System.out.print(message);
		}
		value = sc.nextDouble();

		return value;
	}

	public static void print(double alpha, double beta, double gamma) {

		System.out.println("Углы в градусах: " + alpha + " , " + beta + " , " + gamma);

	}

}
