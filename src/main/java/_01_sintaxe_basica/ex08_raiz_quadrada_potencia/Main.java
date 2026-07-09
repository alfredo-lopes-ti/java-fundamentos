package _01_sintaxe_basica.ex08_raiz_quadrada_potencia;

import java.util.Locale;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		double x = 3.0;
		double y = 4.0;
		double z = -5.0;
		double A, B, C;

		A = Math.sqrt(x);
		B = Math.sqrt(y);
		C = Math.sqrt(25.0);
		System.out.println("Raíz quadrada de " + x + " = " + A);
		System.out.println("Raíz quadrada de " + y + " = " + B);
		System.out.println("Raíz quadrada de " + z + " = " + C);

		A = Math.pow(x, y);
		B = Math.pow(y, 2.0);
		C = Math.pow(5.0, 5.2);
		System.out.println(x + " elevado a " + y + " = " + A);
		System.out.println(y + " elevado ao quadrado = " + B);
		System.out.println("5 elevado ao quadrado = " + C);

		Math.abs(y);
		Math.abs(z);
		System.out.printf("Valor absoluto de " + y + " = " + A);
		System.out.println();
		System.out.printf("Valor absoluto de " + z + " = " + B);

		sc.close();

	}
}
