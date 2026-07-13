package _01_sintaxe_basica.ex05_funcionario;

import java.util.Locale;
import java.util.Scanner;

/**
 * EXERCÍCIO 05 - Funcionário
 *
 * Escreva um programa que leia o ID de um funcionário, a quantidade de
 * horas trabalhadas no mês e o valor pago por hora trabalhada.
 * Calcule e exiba o salário final desse funcionário (horas * valor da hora).
 *
 * @author Alfredo Lopes
 * @since 2026
 */
public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int id;
        int quantHoras;
        double valorHora;
        double salarioFinal;

        System.out.println("Digite a ID do funcionário: ");
        id = sc.nextInt();

        System.out.println("Digite a quantidade de horas trabalhadas: ");
        quantHoras = sc.nextInt();

        System.out.println("Digite o valor por horas trabalhadas: ");
        valorHora = sc.nextDouble();

        salarioFinal = quantHoras * valorHora;

        // System.out.printf("ID: %d%n", id);
        // System.out.printf("Salario: R$ %.2f%n", salarioFinal);
        System.out.printf("ID = %d%nSalário = U$ %.2f%n", id, salarioFinal);

        sc.close();
    }
}
