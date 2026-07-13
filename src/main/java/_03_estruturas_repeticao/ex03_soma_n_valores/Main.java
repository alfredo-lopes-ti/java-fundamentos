package _03_estruturas_repeticao.ex03_soma_n_valores;

import java.util.Locale;
import java.util.Scanner;

/**
 * EXERCÍCIO 03 - Somando N Valores
 *
 * Escreva um programa que leia um número N informando quantos valores
 * serão digitados em seguida, e então leia esses N valores inteiros,
 * somando todos eles. Exiba a soma total ao final. Use uma estrutura de
 * repetição for.
 *
 * @author Alfredo Lopes
 * @since 2026
 */
public class Main {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int soma = 0;

        // Estrutura de repetição for
        // inicio | condicao | incremento
        for (int i = 0; i < N; i++) {
            int x = sc.nextInt();
            soma += x;
        }

        System.out.println("Soma: " + soma);

        sc.close();
    }
}
