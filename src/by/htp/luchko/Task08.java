package by.htp.luchko;

public class Task08 {

	/*
	 * Вычислить значение выражения по формуле (все переменные принимают
	 * действительные значения): 𝑏 + √𝑏 2 + 4𝑎𝑐 / 2𝑎 − 𝑎 3 𝑐 + 𝑏 −2
	 */

	public static void main(String[] args) {

		double a1 = 2;
		double b1 = 3;
		double c = 4;

		double b2 = Math.pow(b1, 2);
		double b3 = Math.pow(b1, -2);
		double a2 = Math.pow(a1, 3);

		double z = ((b1 + Math.sqrt(b2 + 4 * a1 * c)) / 2 * a1) - a2 * c + b3;

		System.out.println("z = " + z);

	}

}
