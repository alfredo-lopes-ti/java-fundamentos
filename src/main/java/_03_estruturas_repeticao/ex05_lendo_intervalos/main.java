package _03_estruturas_repeticao.ex05_lendo_intervalos;

import java.util.Scanner;
import java.util.Locale;

public class main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        int N, X;

        System.out.print("Quantos números você vai digitar? ");
        N = scanner.nextInt();

        for (int i = 0; i < N; i++) {
            System.out.print("Digite um número: ");
            X = scanner.nextInt();

            if (X < 0) {
                System.out.println("Número negativo!");
            } else {
                System.out.println("Número positivo!");
            }
        }
    }

}
