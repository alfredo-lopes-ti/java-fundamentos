package _01_sintaxe_basica.ex07_formas;

import java.util.Locale;
import java.util.Scanner;

/**
 * EXERCÍCIO 07 - Formas Geométricas
 *
 * Escreva um programa que leia três valores A, B e C e calcule a área de
 * cinco formas geométricas diferentes, exibindo cada resultado com 3
 * casas decimais:
 * - Triângulo: (A * C) / 2
 * - Círculo: PI * C²
 * - Trapézio: ((A + B) / 2) * C
 * - Quadrado: B²
 * - Retângulo: A * B
 *
 * @author Alfredo Lopes
 * @since 2026
 */
public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        double A, B, C, triangulo, circulo, trapezio, quadrado, retangulo;

        A = sc.nextDouble();
        B = sc.nextDouble();
        C = sc.nextDouble();

        triangulo = A * C / 2.0;
        circulo = 3.14159 * C * C;
        trapezio = (A + B) / 2.0 * C;
        quadrado = B * B;
        retangulo = A * B;

        System.out.printf("TRIANGULO: %.3f%n", triangulo);
        System.out.printf("CIRCULO: %.3f%n", circulo);
        System.out.printf("TRAPEZIO: %.3f%n", trapezio);
        System.out.printf("QUADRADO: %.3f%n", quadrado);
        System.out.printf("RETANGULO: %.3f%n", retangulo);

        sc.close();
    }
}
