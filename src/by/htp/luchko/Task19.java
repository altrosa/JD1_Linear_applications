package by.htp.luchko;

import java.util.Scanner;

public class Task19 {

	/*
	 * ���� ������� ��������������� ������������. ����� ������� ����� ������������,
	 * ��� ������, ������� ��������� � ��������� �����������.
	 */

	public static void main(String[] args) {

		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		System.out.print("������� ������� ������������: ");
		double a = sc.nextDouble();

		double s = (Math.pow(a, 2) * Math.sqrt(3)) / 4;
		System.out.println("�������: " + s);

		double h = (a * Math.sqrt(3)) / 2;
		System.out.println("������: " + h);

		double ro = a / Math.sqrt(3);
		System.out.println("������ ��������� ����������:" + ro);
		
		double rv = a / (2 * Math.sqrt(3));
		System.out.println("������ ��������� ����������: " + rv);

	}

}
