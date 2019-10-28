package by.htp.luchko;

import java.util.Scanner;

public class Task20 {

	/*
	 * �������� ����� ����������. ����� ������� �����, ������������� ����
	 * �����������.
	 */

	public static void main(String[] args) {

		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		System.out.print("������� ����� ����������: ");
		double d = sc.nextDouble();

		double r = d / (Math.PI * 2);
		double s = Math.PI * Math.pow(r, 2);
		System.out.println("S = " + s);

	}

}
