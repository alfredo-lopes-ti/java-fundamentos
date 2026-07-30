package _05_arrays_e_listas.ex07.application;

import java.util.Locale;
import java.util.Scanner;

/*
Fazer um programa para ler um número inteiro N
e depois um vetor de N números reais. Em seguida,
mostrar na tela a média aritmética de todos elementos
com três casas decimais. Depois mostrar todos os elementos
do vetor que estejam abaixo da média, com uma casa decimal cada.
 */

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int n;

        System.out.println("How many elements will the vector have? ");
        n = sc.nextInt();

        double[] vect = new double[n];

        for (int i = 0; i < n; i++) {
            System.out.println("Enter a number: ");
            vect[i] = sc.nextDouble();
        }

        double soma = 0;
        double media;

        for (int i = 0; i < n; i++) {
            soma += vect[i];
        }

        media = soma / n;

        System.out.printf("Vector media: %.3f%n", media);
        System.out.println("Below-average elements: ");

        for (int i = 0; i < n; i++) {
            if (vect[i] < media) {
                System.out.printf("%.1f\n", vect[i]);
            }
        }

        sc.close();

    }

}
