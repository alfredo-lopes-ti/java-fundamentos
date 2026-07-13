package _02_estruturas_condicionais.ex02_par_impar;

import java.util.Locale;
import java.util.Scanner;

/**
 * EXERCÍCIO 02 - Par ou Ímpar
 *
 * Escreva um programa que leia um número inteiro e informe se ele é PAR
 * ou ÍMPAR, utilizando o operador módulo (%) para verificar o resto da
 * divisão por 2.
 *
 * @author Alfredo Lopes
 * @since 2026
 */
public class Main {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int x;

        System.out.println("Digite um número: ");
        x = sc.nextInt();

        if (x % 2 == 0) {
            // Se o resto for 0, o número é par
            System.out.println("PAR");
        } else {
            System.out.println("IMPAR");
            // Se o resto não for 0, o número é ímpar
        }
        sc.close();
    }
}
