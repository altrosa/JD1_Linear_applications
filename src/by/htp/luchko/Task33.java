package by.htp.luchko;

import java.util.Scanner;

public class Task33 {

	/*
	 * ¬вести любой символ и определить его пор€дковый номер, а также указать
	 * предыдущий и последующий символы.
	 */

	public static void main(String[] args) {

		@SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);
		System.out.print("¬ведите символ: ");
		char c = scan.next().trim().charAt(0);
		int code = c;
		System.out.println("code " + code + ", next " + (code + 1) + ", previous " + (code - 1));

	}

}
