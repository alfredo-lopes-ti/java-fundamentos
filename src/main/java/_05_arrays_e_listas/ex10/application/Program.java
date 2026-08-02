package _05_arrays_e_listas.ex10.application;

import java.util.Locale;
import java.util.Scanner;

/*
Fazer um programa para ler um conjunto de N nomes de alunos, 
bem como as notas que eles tiraram no 1º e 2º semestres. Cada 
uma dessas informações deve ser armazenada em um vetor. Depois, 
imprimir os nomes dos alunos aprovados, considerando aprovados 
aqueles cuja média das notas seja maior ou igual a 6.0 (seis).
 */

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int n;

        System.out.println("How many students will you type? ");
        n = sc.nextInt();

        String[] names = new String[n];
        double[] firstGrade = new double[n];
        double[] secondGrade = new double[n];

        double [] sum = new double[n];
        double [] average = new double[n];
        
        for (int i = 0; i < n; i++) {
            System.out.println("Enter the name of person: ");
            names[i] = sc.next();
            System.out.println("Enter the first grade: ");
            firstGrade[i] = sc.nextDouble();
            System.out.println("Enter the second grade: ");
            secondGrade[i] = sc.nextDouble();
            sum[i] = firstGrade[i] + secondGrade[i];
            average[i] = sum[i] / 2;
        }

        System.out.println("Approved: ");
        for (int i = 0; i < average.length; i++) {
            if (average[i] >= 6.0) {
                System.out.println(names[i]);
            }
            
        }

        sc.close();

    }

}
