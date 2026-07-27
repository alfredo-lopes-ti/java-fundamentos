package _05_arrays_e_listas.ex03.aplication;

import java.util.Locale;
import java.util.Scanner;

/*
Fazer um programa para ler nome, idade e altura de N pessoas, conforme exemplo. Depois, mostrar na
tela a altura média das pessoas, e mostrar também a porcentagem de pessoas com menos de 16 anos,
bem como os nomes dessas pessoas caso houver.
*/

public class Program {
public static void main(String[] args) {

    Locale.setDefault(Locale.US);
    Scanner sc = new Scanner(System.in);

    // Variables
    int nminor;
    double totalHeight, averageHeight, lowestPercentage;

    System.out.println("How many people are you type? ");
    int n = sc.nextInt();

    String[] name = new String[n];
    int[] age = new int[n];
    double[] height = new double[n];

    for (int i = 0; i < n; i++) {
        System.out.printf("Data " + (i + 1) + " people: ");

        System.out.print("Enter the name: ");
        name[i] = sc.next();

        System.out.print("Enter the age: ");
        age[i] = sc.nextInt();

        System.out.print("enter the height ");
        height[i] = sc.nextDouble();
    }

    nminor = 0;
    totalHeight = 0;

    for (int i = 0; i < n; i++) {
        if (age[i] < 16) {
            nminor++;
        }
        totalHeight = totalHeight + height[i];
    }

    averageHeight = totalHeight / n;
    lowestPercentage = ((double) nminor / n) * 100.0;

    System.out.printf("\nAltura media = %.2f\n", averageHeight);
    System.out.printf("Pessoas com menos de 16 anos: %.1f%%\n", lowestPercentage);

    for (int i = 0; i < n; i++) {
        if (age[i] < 16) {
            System.out.printf("%s\n", name[i]);
        }
    }

    sc.close();
}
}
