package by.htp.luchko;

import java.util.Scanner;

public class Task28 {
	
	/*
	 * ��������� ��������� �������� ��������� ���� ���� � �������, ������ � �������.
	 */

	public static void main(String[] args) {
		
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		System.out.print("������� ��������� ���� ����: ");
		double a = sc.nextDouble();
		
		double gr = (a * 180) / Math.PI;
		System.out.println("���� � ��������: " + gr);
		
		a = a % 10;
		a = a / 10;
		System.out.println(a);
		
		
	
	}
}
