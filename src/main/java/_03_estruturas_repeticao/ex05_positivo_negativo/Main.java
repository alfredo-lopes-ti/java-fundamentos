package _03_estruturas_repeticao.ex05_positivo_negativo;

import java.util.Locale;
import java.util.Scanner;

/**
 * EXERCÍCIO 05 - Positivo ou Negativo
 *
 * Escreva um programa que pergunte quantos números serão digitados e,
 * para cada número informado, exiba se ele é positivo ou negativo.
 * Use uma estrutura de repetição for.
 *
 * @author Alfredo Lopes
 * @since 2026
 */
public class Main {
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

        scanner.close();
    }
}
