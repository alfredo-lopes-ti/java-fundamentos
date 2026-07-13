package _03_estruturas_repeticao.ex06_media_ponderada;

import java.util.Locale;
import java.util.Scanner;

/**
 * EXERCÍCIO 06 - Média Ponderada
 *
 * Escreva um programa que leia N (quantidade de casos de teste) e, para
 * cada caso, leia três notas A, B e C. Calcule e exiba a média
 * ponderada dessas notas, com pesos 2, 3 e 5 respectivamente:
 * média = (A*2 + B*3 + C*5) / 10
 *
 * @author Alfredo Lopes
 * @since 2026
 */
public class Main {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {

            double a = sc.nextDouble();
            double b = sc.nextDouble();
            double c = sc.nextDouble();

            double media = (a * 2.0 + b * 3.0 + c * 5.0) / 10.0;

            System.out.printf("%.1f%n", media);
        }

        sc.close();
    }
}
