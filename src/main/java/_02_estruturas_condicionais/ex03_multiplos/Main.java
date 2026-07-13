package _02_estruturas_condicionais.ex03_multiplos;

import java.util.Locale;
import java.util.Scanner;

/**
 * EXERCÍCIO 03 - Múltiplos
 *
 * Escreva um programa que leia dois números inteiros A e B e informe se
 * um é múltiplo do outro (ou seja, se A é divisível por B, ou se B é
 * divisível por A).
 *
 * @author Alfredo Lopes
 * @since 2026
 */
public class Main {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int A;
        int B;

        System.out.println("Digite o primeiro numero: ");
        A = sc.nextInt();
        System.out.println("Digite o segundo numero: ");
        B = sc.nextInt();

        if (A % B == 0 || B % A == 0) {
            System.out.println("São multiplos");
        } else
            System.out.println("Não são multiplos");

        sc.close();
    }
}
