package by.htp.luchko;

import java.util.Scanner;

public class Task05 {

	// ��������� �������� ���������� �������� ��������������� ���� �����.

	public static void main(String[] args) {

		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);

		System.out.print("������� ������ �����: ");

		double a = sc.nextDouble();

		System.out.print("������� ������ �����: ");

		double b = sc.nextDouble();

		double z = (a + b) / 2;

		System.out.println("������� �������������� ��������� ����� �����: " + z);

	}

}
