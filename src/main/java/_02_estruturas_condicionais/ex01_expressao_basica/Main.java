package _02_estruturas_condicionais.ex01_expressao_basica;

import java.util.Locale;
import java.util.Scanner;

/**
 * EXERCÍCIO 01 - Expressão Condicional Básica
 *
 * Escreva um programa que leia um número inteiro e informe se ele é
 * negativo ou positivo, usando uma estrutura if/else.
 *
 * @author Alfredo Lopes
 * @since 2026
 */
public class Main {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int x;

        System.out.println("Digite um número: ");
        x = sc.nextInt();

        if (x < 0) {
            System.out.println("Número negativo");
        } else {
            System.out.println("Número positivo");
        }
        sc.close();
    }
}
