package by.htp.luchko;

public class Task27 {

	/*
	 * ���� �������� a. �� ��������� ������� ������� � ������� ��������, �����
	 * ���������, �������� �������� �8 �� ��� �������� � �10 �� ������ ��������.
	 * 
	 */

	public static void main(String[] args) {
		
		long a = 15;
		
		long a2 = a * a;
		long a4 = a2 * a2;
		long a8 = a4 * a4;
		System.out.println("a � ������� �������: " + a8);
		long a10 = a8 *a2;
		System.out.println("a � ������� �������: " + a10);
	}

}
