package _05_arrays_e_listas.ex02.aplication;

import java.util.Locale;
import java.util.Scanner;

/*
Faça um programa que leia N números reais e armazene-os em um vetor. Em seguida:
- Imprimir todos os elementos do vetor
- Mostrar na tela a soma e a média dos elementos do vetor
 */

public class Program {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int n;
        double sum, media;

        System.out.println("How many numbers are you going to enter? ");
        n = sc.nextInt();

        double[] vect = new double[n];

        for (int i = 0; i < n; i++) {
            System.out.println("Enter a number: ");
            vect[i] = sc.nextDouble();
        }

        sum = 0;

        for (int i = 0; i < n; i++) {
            sum = sum + vect[i];
        }

        media = sum / n;

        System.out.print("Valores: ");

        for (int i = 0; i < n; i++) {
            System.out.printf("%.1f", vect[i]);
        }

        System.out.printf("\nSOMA = %.2f\n", sum);
        System.out.printf("MEDIA = %.2f\n", media);

    }

}