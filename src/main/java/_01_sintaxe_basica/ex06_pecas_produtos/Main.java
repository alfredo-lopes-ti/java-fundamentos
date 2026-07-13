package _01_sintaxe_basica.ex06_pecas_produtos;

import java.util.Locale;
import java.util.Scanner;

/**
 * EXERCÍCIO 06 - Peças e Produtos
 *
 * Escreva um programa que leia o código, a quantidade e o preço unitário
 * de duas peças compradas. Calcule e exiba o valor total da compra
 * (soma do valor de cada peça: quantidade * preço unitário).
 *
 * @author Alfredo Lopes
 * @since 2026
 */
public class Main {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int cod1, cod2, qt1, qt2;
        double preco1, preco2, total;

        cod1 = sc.nextInt();
        qt1 = sc.nextInt();
        preco1 = sc.nextDouble();

        cod2 = sc.nextInt();
        qt2 = sc.nextInt();
        preco2 = sc.nextDouble();

        total = preco1 * qt1 + preco2 * qt2;

        System.out.printf("Total: R$ %.2f%n", total);
        sc.close();
    }
}
