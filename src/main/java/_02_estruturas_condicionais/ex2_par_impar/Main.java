package _02_estruturas_condicionais.ex2_par_impar;

import java.util.Scanner;
import java.util.Locale;

public class Main {
	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		int x;

		System.out.println("Digite um número: ");
		x = sc.nextInt();

		if (x % 2 == 0) {
			// Se o resto for 0, o número é par
			System.out.println("PAR");
		} else {
			System.out.println("IMPAR");
			// Se o resto não for 0, o número é ímpar
		}
		sc.close();
	}
}
