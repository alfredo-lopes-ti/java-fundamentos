package _02_estruturas_condicionais.ex12_condicao_ternaria;

import java.util.Locale;
import java.util.Scanner;

/**
 * EXERCÍCIO 12 - Condição Ternária
 *
 * Escreva um programa que leia o preço de um produto e calcule o
 * desconto aplicado: 10% se o preço for menor que R$ 20,00, ou 5% caso
 * contrário. Resolva utilizando o operador condicional ternário (?:) ao
 * invés de um if/else tradicional.
 *
 * @author Alfredo Lopes
 * @since 2026
 */
public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);

        Scanner sc = new Scanner(System.in);

        /*double preco = 34.5;
        double desconto;
        if (preco < 20.0) {
            desconto = preco * 0.1;
        }  else {
            desconto = preco * 0.05;
        } */

        // Simplificando através de uma expressão condicional ternária
        double preco = sc.nextDouble();
        double desconto = (preco < 20.0) ? preco * 0.1 : preco * 0.05;
        System.out.printf("Desconto: R$ %.2f%n", desconto);

        sc.close();
    }
}
