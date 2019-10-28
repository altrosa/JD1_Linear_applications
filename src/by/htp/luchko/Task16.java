package by.htp.luchko;

import java.util.Scanner;

public class Task16 {

	// ����� ������������ ���� ��������� ��������������� �����.

	public static void main(String[] args) {

		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);

		System.out.print("������� �������������� �����");

		int a = sc.nextInt();

		int b1 = a % 10;
		a = a / 10;
		int b2 = a % 10;
		a = a / 10;
		int b3 = a % 10;
		a = a / 10;
		int b4 = a % 10;

		int x = b1 * b2 * b3 * b4;
		System.out.println("x = " + x);

	}

}
