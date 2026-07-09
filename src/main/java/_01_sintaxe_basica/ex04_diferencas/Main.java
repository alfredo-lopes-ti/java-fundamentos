package src.main.java._01_sintaxe_basica.ex04_diferencas;

import java.util.Scanner;
import java.util.Locale;

public class Main {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		int A, B, C, D;

		// System.out.println("Digite o primeiro valor: ");
		A = sc.nextInt();
		// System.out.println("Digite o segundo valor: ");
		B = sc.nextInt();
		// System.out.println("Digite o terceiro valor: ");
		C = sc.nextInt();
		// System.out.println("Digite o quarto valor: ");
		D = sc.nextInt();

		int dif = A * B - C * D;

		System.out.println("DIFERENCA = " + dif);

		sc.close();

	}
}
