package _02_estruturas_condicionais.ex3_multiplos;

import java.util.Scanner;
import java.util.Locale;

public class Main {
	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		int A;
		int B;

		System.out.println("Digite o primeiro numero: ");
		A = sc.nextInt();
		System.out.println("Digite o segundo numero: ");
		B = sc.nextInt();

		if (A % B == 0 || B % A == 0) {
			System.out.println("São multiplos");
		} else
			System.out.println("Não são multiplos");

		sc.close();
	}
}
