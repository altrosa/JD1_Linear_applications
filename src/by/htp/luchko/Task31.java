package by.htp.luchko;

import java.util.Scanner;

public class Task31 {

	/*
	 * ��������� ��������� ��� ���������� ����, ����������� ������, ���� �� ��������
	 * � ������� ���� v ��/�, �������� ������� ���� v1 ��/�, ����� �������� �� �����
	 * t1 �, � ������ ������� ���� � t2 �.
	 */

	public static void main(String[] args) {
		
		int v, v1, t1, t2, l;
		
		v = enterFromConsole("Enter v1: ");
		v1 = enterFromConsole("Enter v2: ");
		t1 = enterFromConsole("Enter t1: ");
		t2 = enterFromConsole("Enter t2: ");
		
		l = (t1 * v) + (t2 * (v - v1));
		
		System.out.println("���������� ����: " + (double) l);

	}
	
	public static int enterFromConsole(String message) {

		int value;

		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		System.out.print(message);
		while (!sc.hasNextInt()) {
			System.out.print(message);
		}
		value = sc.nextInt();

		return value;
	}
}
