package _01_sintaxe_basica.ex03_lendo_raio_de_um_circulo;

import java.util.Locale;
import java.util.Scanner;

/**
 * EXERCÍCIO 03 - Lendo o Raio de um Círculo
 *
 * Escreva um programa que leia o raio (R) de um círculo e calcule a área
 * (A) desse círculo, exibindo o resultado com 4 casas decimais.
 * Fórmula da área: A = PI * R².
 *
 * @author Alfredo Lopes
 * @since 2026
 */
public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        double R, A;
        final double PI = 3.14159;

        // System.out.println("Digite o valor do raio: ");
        R = sc.nextDouble();

        // A = PI * R * R;
        A = Math.pow(R, 2.0);

        System.out.printf("A=%.4f%n", A);

        sc.close();
    }
}
