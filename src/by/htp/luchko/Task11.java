package by.htp.luchko;

public class Task11 {

	/*
	 * Вычислить периметр и площадь прямоугольного треугольника по длинам а и b двух
	 * катетов.
	 * 
	 */

	public static void main(String[] args) {
		
		double a = 3;
		double a1 = Math.pow(3, 2);
		double b = 4;
		double b1 = Math.pow(b, 2);
		
		double c;
				
		c = Math.sqrt(a1 + b1);
		
		double s = (a * b) / 2;
		double p = a + b + c;
		
		System.out.println("S = "  + s);
		System.out.println("P =  " + p);
		

	}

}
