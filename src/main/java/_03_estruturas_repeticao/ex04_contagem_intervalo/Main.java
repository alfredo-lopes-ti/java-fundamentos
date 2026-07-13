package _03_estruturas_repeticao.ex04_contagem_intervalo;

import java.util.Locale;
import java.util.Scanner;

/**
 * EXERCÍCIO 04 - Contagem por Intervalo
 *
 * Escreva um programa que leia um número N de valores e, em seguida,
 * leia esses N valores inteiros. Para cada valor lido, verifique se ele
 * está dentro do intervalo de 10 a 20 (inclusive). Ao final, exiba
 * quantos valores estavam dentro ("in") e quantos estavam fora ("out")
 * desse intervalo.
 *
 * @author Alfredo Lopes
 * @since 2026
 */
public class Main {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();

        int in = 0;
        int out = 0;

        for (int i = 0; i < n; i++) {
            int x = scanner.nextInt();
            if (x >= 10 && x <= 20) {
                in++;
            } else {
                out++;
            }
        }

        System.out.println(in + " in");
        System.out.println(out + " out");

        scanner.close();
    }
}
