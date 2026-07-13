package _02_estruturas_condicionais.ex08_empresa_telefonia;

import java.util.Locale;
import java.util.Scanner;

/**
 * EXERCÍCIO 08 - Empresa de Telefonia
 *
 * Uma empresa de telefonia cobra uma taxa fixa de R$ 50,00 por até 100
 * minutos consumidos no mês. Escreva um programa que leia a quantidade de
 * minutos utilizados e calcule o valor da conta, cobrando R$ 2,00 por
 * minuto excedente que passar de 100.
 *
 * @author Alfredo Lopes
 * @since 2026
 */
public class Main {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int minutos = sc.nextInt();
        double conta = 50.0;

        if (minutos > 100) {
            conta = conta + (minutos - 100) * 2.0;
        }

        System.out.printf("Valor da conta = R$ %.2f%n", conta);

        sc.close();
    }
}
