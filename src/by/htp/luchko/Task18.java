package by.htp.luchko;

import java.util.Scanner;

public class Task18 {

	/*
	 * ���� ����� ����� ����. ����� ������� �����, ������� ������ ����������� �
	 * ����� ����� ����.
	 */

	public static void main(String[] args) {

		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		System.out.print("������� ����� ����� ����: ");
		double a = sc.nextDouble();

		double sg = a * a;
		System.out.println("������� ����� ����: " + sg);

		double sp = sg * 6;
		System.out.println("������� ����������� ����: " + sp);

		double v = Math.pow(a, 3);
		System.out.println("����� ���� �����: " + v);

	}

}
