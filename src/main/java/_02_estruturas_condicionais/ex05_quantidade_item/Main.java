package _02_estruturas_condicionais.ex05_quantidade_item;

import java.util.Locale;
import java.util.Scanner;

/**
 * EXERCÍCIO 05 - Quantidade de Item
 *
 * Escreva um programa que leia o código de um produto (1 a 4, ou
 * qualquer outro valor para o item padrão) e a quantidade comprada.
 * Calcule o valor total da compra considerando o preço unitário de cada
 * código:
 * 1 = R$ 4,00 | 2 = R$ 4,50 | 3 = R$ 5,00 | 4 = R$ 2,00 | outros = R$ 1,50
 *
 * @author Alfredo Lopes
 * @since 2026
 */
public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int codigo = sc.nextInt();
        int quantidade = sc.nextInt();

        double total;

        if (codigo == 1) {
            total = quantidade * 4.0;
        } else if (codigo == 2) {
            total = quantidade * 4.50;
        } else if (codigo == 3) {
            total = quantidade * 5.00;
        } else if (codigo == 4) {
            total = quantidade * 2.00;
        } else {
            total = quantidade * 1.50;
        }

        System.out.printf("Total: R$ %.2f%n", total);

        sc.close();
    }
}
