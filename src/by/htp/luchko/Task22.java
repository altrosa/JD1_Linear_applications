package by.htp.luchko;

import java.util.Scanner;

public class Task22 {

	/*
	 * Дано натуральное число Т, которое представляет длительность прошедшего
	 * времени в секундах. Вывести данное значение длительности в часах, минутах и
	 * секундах в следующей форме: ННч ММмин SSc.
	 */

	public static void main(String[] args) {
					
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Введите количество секунд");
		
		double T = sc.nextInt();

		
		double hh = T / 3600;
    	double mm = (T % 3600) / 60;
    	double ss = ((T % 3600) % 60);
    	
    	System.out.println(hh);
    	System.out.println(mm);
    	System.out.println(ss);
    	
	
	}

}
