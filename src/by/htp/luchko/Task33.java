package by.htp.luchko;

import java.util.Scanner;

public class Task33 {

	/*
	 * ������ ����� ������ � ���������� ��� ���������� �����, � ����� �������
	 * ���������� � ����������� �������.
	 */

	public static void main(String[] args) {

		@SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);
		System.out.print("������� ������: ");
		char c = scan.next().trim().charAt(0);
		int code = c;
		System.out.println("code " + code + ", next " + (code + 1) + ", previous " + (code - 1));

	}

}
