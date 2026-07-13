package _02_estruturas_condicionais.ex07_coordenadas;

import java.util.Locale;
import java.util.Scanner;

/**
 * EXERCÍCIO 07 - Coordenadas
 *
 * Escreva um programa que leia as coordenadas x e y de um ponto no plano
 * cartesiano e informe se o ponto está na origem, no eixo x ou no eixo y.
 *
 * @author Alfredo Lopes
 * @since 2026
 */
public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        double x;
        double y;

        System.out.print("Digite o valor de x: ");
        x = sc.nextDouble();
        System.out.print("Digite o valor de y: ");
        y = sc.nextDouble();

        // CORREÇÃO: para estar na origem, x E y precisam ser 0 ao mesmo
        // tempo (&&), e não apenas um dos dois (||).
        if (x == 0.0 && y == 0.0) {
            System.out.println("Origem");
        } else if (x == 0.0) {
            System.out.println("está no eixo y");
        } else if (y == 0.0) {
            System.out.println("está no eixo x");
        }

        sc.close();
    }
}
