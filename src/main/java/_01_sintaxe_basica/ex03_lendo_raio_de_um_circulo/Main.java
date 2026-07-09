package src.main.java._01_sintaxe_basica.ex03_lendo_raio_de_um_circulo;

import java.util.Scanner;
import java.util.Locale;

public class Main {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		double R, A;
		final double PI = 3.14159;

		// System.out.println("Digite o valor do raio: ");
		R = sc.nextDouble();

		// A = PI * R * R;
		A = Math.pow(R, 2.0);

		System.out.printf("A=%.4f%n", A);

		sc.close();

	}
}
