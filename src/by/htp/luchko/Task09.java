package by.htp.luchko;

public class Task09 {

	/*
	 * ��������� �������� ��������� �� ������� (��� ���������� ���������
	 * �������������� ��������):a / c * b / d - ((a * b - c) / c * d);
	 *
	 */

	public static void main(String[] args) {
		
		double a = 8.9;
		double b = 11.6;
		double c = 19;
		double d = 5;
		
		double x = (a / c) * (b / d) - ((a * b - c) / c * d);
		
		System.out.println("x = " + x);

	}

}
