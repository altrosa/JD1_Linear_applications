package by.htp.luchko;

import java.util.Scanner;

public class Task06 {

	/*
	 * �������� ��� ��� ������� ������. � n ����� ������� 80 � ������. �������
	 * ������ ������ � m ������� �������, ���� � ������ ������� ������ �� 12 �.
	 * ������, ��� � �����?
	 * 
	 */

	public static void main(String[] args) {

		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);

		System.out.print("������� ����� ������� �����? ");

		int n;
		n = sc.nextInt();

		System.out.print("������� ������� ������� �����? ");

		int m;
		m = sc.nextInt();

		int s;
		s = 80 / n;

		int b;
		b = s + 12;

		int x;
		x = b * m;

		System.out.println("x = " + x);

	}

}
