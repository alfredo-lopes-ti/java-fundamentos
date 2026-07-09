package _02_estruturas_condicionais.ex7_cordenadas;

import java.util.Locale;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		double x;
		double y;

		System.out.print("Digite o valor de x: ");
		x = sc.nextDouble();
		System.out.print("Digite o valor de y: ");
		y = sc.nextDouble();

		if (x == 0.0 || y == 0.0) {
			System.out.println("Origem");
		} else if (x == 0.0) {
			System.out.println("está no eixo y");
		} else if (y == 0.0) {
			System.out.println("está no eixo x");
		}

		sc.close();

	}
}
