package _03_estruturas_repeticao.ex02_soma_ate_zero;

import java.util.Locale;
import java.util.Scanner;

/**
 * EXERCÍCIO 02 - Somando até Encontrar Zero
 *
 * Escreva um programa que leia vários números inteiros, um por vez, e
 * some todos eles. A leitura deve parar assim que o valor 0 (zero) for
 * digitado (valor sentinela), e a soma total deve ser exibida ao final.
 * Use uma estrutura de repetição while.
 *
 * @author Alfredo Lopes
 * @since 2026
 */
public class Main {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int x = sc.nextInt();

        int soma = 0;
        while (x != 0) {
            //soma = soma + x;
            soma += x;
            x = sc.nextInt();
        }

        System.out.println(soma);

        sc.close();
    }
}
