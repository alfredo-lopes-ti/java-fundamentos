package _02_estruturas_condicionais.ex09_quadrante;

import java.util.Locale;
import java.util.Scanner;

/**
 * EXERCÍCIO 09 - Quadrante
 *
 * Escreva um programa que leia as coordenadas x e y de um ponto no plano
 * cartesiano e informe em qual quadrante (Q1, Q2, Q3 ou Q4) ele se
 * encontra, ou se está na origem ou sobre um dos eixos.
 *
 * @author Alfredo Lopes
 * @since 2026
 */
public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        double x, y;
        x = sc.nextDouble();
        y = sc.nextDouble();

        if (x == 0.0 && y == 0.0) {
            System.out.println("Origem");
        } else if (x == 0.0) {
            System.out.println("Eixo Y");
        } else if (y == 0.0) {
            System.out.println("Eixo X");
        } else if (x > 0.0 && y > 0.0) {
            System.out.println("Q1");
        } else if (x < 0.0 && y > 0.0) {
            System.out.println("Q2");
        } else if (x < 0.0 && y < 0.0) {
            System.out.println("Q3");
        } else {
            System.out.println("Q4");
        }
        sc.close();
    }
}
