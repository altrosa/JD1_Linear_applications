package by.htp.luchko;

import java.util.Scanner;

public class Task26 {

	/*
	 * ����� ������� ������������, ��� ������� �������� ����� � � b, � ���� �����
	 * ����� ��������� �.
	 * 
	 */

	public static void main(String[] args) {

		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		System.out.print("������� ������� a: ");
		double a = sc.nextDouble();
		System.out.print("������� ������� b: ");
		double b = sc.nextDouble();
		System.out.print("������� ���� u < 90: ");
		double u = sc.nextDouble();

		double s = (a * b * Math.sin(u) / 2);

		System.out.println("S = " + s);

	}

}
