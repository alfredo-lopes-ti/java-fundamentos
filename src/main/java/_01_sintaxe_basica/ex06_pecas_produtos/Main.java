package src.main.java._01_sintaxe_basica.ex06_pecas_produtos;

import java.util.Scanner;
import java.util.Locale;

public class Main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		int cod1, cod2, qt1, qt2;
		double preco1, preco2, total;

		cod1 = sc.nextInt();
		qt1 = sc.nextInt();
		preco1 = sc.nextDouble();

		cod2 = sc.nextInt();
		qt2 = sc.nextInt();
		preco2 = sc.nextDouble();

		total = preco1 * qt1 + preco2 * qt2;

		System.out.printf("Total: R$ %.2f%n", total);
		sc.close();

	}
}
