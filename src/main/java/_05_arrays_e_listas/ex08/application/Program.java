package _05_arrays_e_listas.ex08.application;

import java.util.Locale;
import java.util.Scanner;

/*
Fazer um programa para ler um vetor de N números inteiros. 
Em seguida, mostrar na tela a média aritmética somente dos 
números pares lidos, com uma casa decimal. Se nenhum número 
par for digitado, mostrar a mensagem "NENHUM NUMERO PAR"
 */

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int n;

        int[] vect;

        System.out.println("How many number are you type? ");
        n = sc.nextInt();

        vect = new int[n];
        for (int i = 0; i < vect.length; i++) {
            System.out.println("Enter a number: ");
            vect[i] = sc.nextInt();
        }

        int evenSum = 0;
        int evenCount = 0;

        // O operador += é fundamental em algoritmos porque transforma a variável em um acumulador.
        for (int i = 0; i < vect.length; i++) {
            if (vect[i] % 2 == 0) {
                evenSum += vect[i];
                evenCount++;
            }
        }

        if (evenCount == 0) {
            System.out.println("No even numbers!");
        } else {
            System.out.printf("Average of even numbers = %.1f%n", (double) evenSum / evenCount);
        }

        sc.close();

    }

}
