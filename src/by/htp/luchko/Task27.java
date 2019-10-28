package by.htp.luchko;

public class Task27 {

	/*
	 * ƒано значение a. Ќе использу€ никаких функций и никаких операций, кроме
	 * умножени€, получить значение а8 за три операции и а10 за четыре операции.
	 * 
	 */

	public static void main(String[] args) {
		
		long a = 15;
		
		long a2 = a * a;
		long a4 = a2 * a2;
		long a8 = a4 * a4;
		System.out.println("a в восьмой степени: " + a8);
		long a10 = a8 *a2;
		System.out.println("a в дес€той степени: " + a10);
	}

}
