package _02_estruturas_condicionais.ex10_imposto_de_renda;

import java.util.Locale;
import java.util.Scanner;

/**
 * EXERCÍCIO 10 - Imposto de Renda
 *
 * Escreva um programa que leia o salário de uma pessoa e calcule o
 * imposto de renda devido, de acordo com as faixas abaixo:
 * até R$ 2.000,00: isento
 * de R$ 2.000,01 a R$ 3.000,00: 8% sobre o que exceder R$ 2.000,00
 * de R$ 3.000,01 a R$ 4.500,00: 18% sobre o que exceder R$ 3.000,00, mais o
 * valor fixo da faixa anterior
 * acima de R$ 4.500,00: 28% sobre o que exceder R$ 4.500,00, mais os
 * valores fixos das faixas anteriores
 *
 * @author Alfredo Lopes
 * @since 2026
 */
public class Main {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        double salario = sc.nextDouble();

        double imposto;
        if (salario <= 2000.0) {
            imposto = 0.0;
        } else if (salario <= 3000.0) {
            imposto = (salario - 2000.0) * 0.08;
        } else if (salario <= 4500.0) {
            imposto = (salario - 3000.0) * 0.18 + 1000.0 * 0.08;
        } else {
            imposto = (salario - 4500.0) * 0.28 + 1500.0 * 0.18 + 1000.0 * 0.08;
        }

        if (imposto == 0.0) {
            System.out.println("Isento");
        } else {
            System.out.printf("R$ %.2f%n", imposto);
        }

        sc.close();
    }
}
