// Correção no nome do pacote: "application" com dois 'p'
package _05_arrays_e_listas.ex05.application;

import java.util.Locale;
import java.util.Scanner;

/*
Faça um programa que leia N números reais e armazene-os em um vetor. Em seguida,
mostrar na tela o maior número do vetor (supor não haver empates). Mostrar também
a posição do maior elemento, considerando a primeira posição como 0 (zero).
 */

public class Program {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int n, posMajor;

        System.out.print("How many numbers will you enter? ");
        n = sc.nextInt();

        double[] vect = new double[n];
        double major;

        for (int i = 0; i < n; i++) {
            System.out.print("Enter a number: ");
            vect[i] = sc.nextDouble();
        }

        // Decisão: assumimos inicialmente que o primeiro elemento (índice 0) é o maior
        major = vect[0];
        posMajor = 0;

        // Decisão: iniciamos o loop em i = 1 para evitar comparar vect[0] com ele mesmo
        for (int i = 1; i < n; i++) {
            if (vect[i] > major) {
                major = vect[i];
                // Causa raiz do bug corrigida: atualizamos a variável de posição sempre que um novo maior for encontrado
                posMajor = i;
            }
        }

        System.out.printf("HIGHEST VALUE = %.1f\n", major);
        System.out.printf("POSITION OF HIGHEST VALUE = %d\n", posMajor);

        sc.close();
    }
}