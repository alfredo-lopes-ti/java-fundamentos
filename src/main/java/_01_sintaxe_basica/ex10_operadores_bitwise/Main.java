package _01_sintaxe_basica.ex10_operadores_bitwise;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        
        int mask = 0b100000; 
        int n = sc.nextInt(); 
        
        if ((n & mask) != 0) { // Check if the 6th bit is set
            System.out.println("6th bit is true!");
        } else {
            System.out.println("6th bit is false");
        }
        sc.close();
    }
}