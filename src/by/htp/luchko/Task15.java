package by.htp.luchko;

public class Task15 {

	// Написать программу, которая выводит на экран первые четыре степени числа π.

	public static void main(String[] args) {

		double p = Math.PI;

		System.out.println("Первая степень числа ПИ: " + p);
		System.out.println("Вторая степень числа ПИ: " + Math.pow(p, 2));
		System.out.println("Третья степень числа ПИ: " + Math.pow(p, 3));
		System.out.println("Четвертая степень числа ПИ: " + Math.pow(p, 4));

	}

}
