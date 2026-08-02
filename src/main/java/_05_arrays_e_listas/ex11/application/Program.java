package _05_arrays_e_listas.ex11.application;

import java.util.Locale;
import java.util.Scanner;

/*
Tem-se um conjunto de dados contendo a altura e o gênero (M, F) de N pessoas. 
Fazer um programa que calcule e escreva a maior e a menor altura do grupo, a ]
média de altura das mulheres, e o número de homens.
 */

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int n;
        String[] gender;
        double[] hight;

        System.out.println("How many person you are type? ");
        n = sc.nextInt();

        hight = new double[n];
        gender = new String[n];
        for (int i = 0; i < n; i++) {
            System.out.println("Enter the Hight of the person: ");
            hight[i] = sc.nextDouble();
            System.out.println("Enter the gender of the person");
            gender[i] = sc.next();
        }

        System.out.println("The major person is: ");

        double[] majorHight = new double[0];
        double[] minorHight = new double[0];

        for (int i = 0; i < hight.length; i++) {
            if (hight[i] > majorHight[i]) {
                majorHight[i] = hight[i];
            }
            if (hight[i] < minorHight[i]) {
                minorHight[i] = hight[i];
            }


        }

        sc.close();

    }

}
