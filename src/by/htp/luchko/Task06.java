package by.htp.luchko;

import java.util.Scanner;

public class Task06 {

	/*
	 * Ќаписать код дл€ решени€ задачи. ¬ n малых бидонах 80 л молока. —колько
	 * литров молока в m больших бидонах, если в каждом большом бидоне на 12 л.
	 * больше, чем в малом?
	 * 
	 */

	public static void main(String[] args) {

		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);

		System.out.print("—колько малых бидонов имеем? ");

		int n;
		n = sc.nextInt();

		System.out.print("—колько больших бидонов имеем? ");

		int m;
		m = sc.nextInt();

		int s;
		s = 80 / n;

		int b;
		b = s + 12;

		int x;
		x = b * m;

		System.out.println("x = " + x);

	}

}
