package _05_arrays_e_listas.ex06.application;

import java.util.Locale;
import java.util.Scanner;

/*
Faça um programa para ler dois vetores A e B, contendo N elementos cada.
Em seguida, gere um terceiro vetor C onde cada elemento de C é a soma
dos elementos correspondentes de A e B. Imprima o vetor C gerado.
 */

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int n;
        int[] A;
        int[] B;

        System.out.println("How many numbers are you type? ");
        n = sc.nextInt();

        A = new int[n];
        B = new int[n];

        for (int i = 0; i < n; i++) {
            System.out.println("Enter a value for A: ");
            A[i] = sc.nextInt();
        }

        for (int i = 0; i < n; i++) {
            System.out.println("Enter a value for B: ");
            B[i] = sc.nextInt();
        }

        int[] C = new int[n];

        for (int i = 0; i < n; i++) {
            C[i] = A[i] + B[i];
        }

        System.out.println("Resultant vector: ");
        for (int i = 0; i < n; i++) {
            System.out.println(C[i]);
        }
        sc.close();
    }
}



