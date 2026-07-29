
package _05_arrays_e_listas.ex04.application;

import java.util.Locale;
import java.util.Scanner;

/*
 * ENUNCIADO:
 * Faça um programa que leia N números inteiros e armazene-os em um vetor.
 * Em seguida, mostre na tela todos os números pares e também a quantidade de números pares.
 */

public class Program {
    public static void main (String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int n;
        int[] vect;

        // Leitura da quantidade de elementos a serem digitados
        System.out.println("How many number are you going enter? ");
        n = sc.nextInt();

        // Alocação de memória do vetor após saber o tamanho 'n'
        vect = new int[n];

        // Preenchimento do vetor com os números digitados pelo usuário
        for (int i = 0; i < n; i++) {
            vect[i] = sc.nextInt();
        }

        // Variável acumuladora para contar a quantidade de pares
        int count = 0;

        System.out.print("Even: ");

        // Varredura do vetor para filtrar e exibir apenas os números pares
        for (int i = 0; i < n; i++) {
            // Regra: O resto da divisão por 2 deve ser igual a 0 (% 2 == 0)
            if (vect[i] % 2 == 0) {
                count++; // Incrementa a contagem de pares
                System.out.print(vect[i] + " "); // Imprime o número par
            }
        }

        // Exibição do total acumulado após a finalização do laço
        System.out.println("\nQuantity: " + count);

        sc.close();
    }
}