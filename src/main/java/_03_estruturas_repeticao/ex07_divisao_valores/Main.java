package _03_estruturas_repeticao.ex07_divisao_valores;

import java.util.Locale;
import java.util.Scanner;

/**
 * EXERCÍCIO 07 - Divisão de Valores
 *
 * Escreva um programa que leia N (quantidade de casos de teste) e, para
 * cada caso, leia dois valores inteiros X e Y. Calcule e exiba a divisão
 * X / Y com 1 casa decimal. Caso Y seja igual a 0, exiba a mensagem
 * "divisao impossivel" ao invés de realizar o cálculo.
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

            int x = sc.nextInt();
            int y = sc.nextInt();

            if (y == 0) {
                System.out.println("divisao impossivel");
            } else {
                double div = (double) x / y;
                System.out.printf("%.1f%n", div);
            }
        }

        sc.close();
    }
}
