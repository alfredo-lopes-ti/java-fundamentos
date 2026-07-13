package _03_estruturas_repeticao.ex01_metro_quadrado;

import java.util.Locale;
import java.util.Scanner;

/**
 * EXERCÍCIO 01 - Metro Quadrado
 *
 * Escreva um programa que leia a largura e o comprimento de um cômodo,
 * além do preço do metro quadrado do material a ser utilizado. Calcule e
 * exiba a área do cômodo e o preço total do material necessário.
 *
 * @author Alfredo Lopes
 * @since 2026
 */
public class Main {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        double largura = sc.nextDouble();
        double comprimento = sc.nextDouble();
        double metroQuadrado = sc.nextDouble();

        double area = largura * comprimento;
        double preco = area * metroQuadrado;

        System.out.printf("AREA = %.2f%n", area);
        System.out.printf("PRECO = %.2f%n", preco);

        sc.close();
    }
}
