package _05_vetores.ex01.aplication;

import java.util.Locale;
import java.util.Scanner;

public class Program {

    public static void main(String[] args) {
        
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("How many number you are going to enter?: ");
        int n = sc.nextInt();

        int [] vect = new int [n];

        for (int i = 0; i < n; i ++) {
            System.out.println("Type a number: ");
            vect [i] = sc.nextInt();
        }

        System.out.println("Negative numbers: ");

        for (int i = 0; i < n; i ++) {
            if (vect[i] < 0) {
                System.out.printf("%d\n", vect[i]);
            }
        }

        sc.close();
    }
    
}