package by.htp.luchko;

import java.util.Scanner;

public class Task17 {

	/*
	 * ���� ��� �����. ����� ������� �������������� ����� ���� ����� � �������
	 * �������������� ������� ���� �����
	 */

	public static void main(String[] args) {

		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		System.out.print("������� ������ �����: ");
		double a = sc.nextDouble();
		System.out.print("������� ������ �����: ");
		double b = sc.nextDouble();

		double s = (Math.pow(a, 3) + Math.pow(b, 3)) / 2;
		System.out.println("������� �������������� ����� �����: " + s);

		double x = Math.sqrt(Math.abs(a) * Math.abs(b));
		System.out.println(x);

	}

}
