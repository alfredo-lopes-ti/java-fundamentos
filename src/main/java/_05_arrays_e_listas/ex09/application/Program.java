package _05_arrays_e_listas.ex10.application;

import java.util.Locale;
import java.util.Scanner;

/*
Fazer um programa para ler um conjunto de nomes de pessoas e 
suas respectivas idades. Os nomes devem ser armazenados em um 
vetor, e as idades em um outro vetor. Depois, mostrar na tela 
o nome da pessoa mais velha.
 */

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);


        String[] names;
        int[] ages;

        System.out.println("How many people will you type? ");
        int n = sc.nextInt();

        names = new String[n];
        ages = new int[n];

        for (int i = 0; i < ages.length; i++) {
            System.out.println("Enter name of person: ");
            names[i] = sc.next();
            System.out.println("Enter age of person: ");
            ages[i] = sc.nextInt();
        }

        int oldest = 0;
        for (int i = 1; i < ages.length; i++) {
            if (ages[i] > ages[oldest]) {
                oldest = i;
            }
        }
        System.out.println("Oldest person: " + names[oldest]);

        sc.close();

    }

}
