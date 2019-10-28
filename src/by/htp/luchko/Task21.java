package by.htp.luchko;

import java.util.Scanner;

public class Task21 {

	/*
	 * ���� �������������� ����� R ���� nnn.ddd (��� �������� ������� � ������� �
	 * ����� ������). �������� ������� ������� � ����� ����� ����� � �������
	 * ���������� �������� �����.
	 */

	public static void main(String[] args) {

		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		System.out.print("������� ����� R ���� nnn.ddd: ");
		float a = sc.nextFloat();

		int b = (int) a;

		a = (a - b) * 1000;

		System.out.println((int) a + "," + b);

	}

}
