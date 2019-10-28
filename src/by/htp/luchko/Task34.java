package by.htp.luchko;

import java.math.BigDecimal;
import java.util.Scanner;

public class Task34 {

	/*
	 * ���� �������� �, ���������� ����� ���������� � ������. ��������� � � �����
	 * ������� ������� ��������� ����������.
	 * 
	 */

	public static void main(String[] args) {

		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		System.out.print("������� �������� �: ");
		double b = sc.nextInt();

		BigDecimal kb;
		System.out.println(new BigDecimal(b).divide(new BigDecimal(1024)));
	}
}
