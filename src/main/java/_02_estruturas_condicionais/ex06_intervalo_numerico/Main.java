package _02_estruturas_condicionais.ex06_intervalo_numerico;

import java.util.Locale;
import java.util.Scanner;

/**
 * EXERCÍCIO 06 - Intervalo Numérico
 *
 * Escreva um programa que leia um número entre 0 e 100 e informe em qual
 * intervalo ele se encaixa: [0,25], (25,50], (50,75] ou (75,100].
 * Caso o número esteja fora da faixa de 0 a 100, exiba "Fora de intervalo".
 *
 * @author Alfredo Lopes
 * @since 2026
 */
public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        double numero = sc.nextDouble();

        if (numero < 0.0 || numero > 100.0) {
            System.out.println("Fora de intervalo");
        } else if (numero <= 25.0) {
            System.out.println("Intervalo [0,25]");
        } else if (numero <= 50.0) {
            System.out.println("Intervalo (25,50]");
        } else if (numero <= 75.0) {
            System.out.println("Intervalo (50,75]");
        } else {
            System.out.println("Intervalo (75,100]");
        }

        sc.close();
    }
}
