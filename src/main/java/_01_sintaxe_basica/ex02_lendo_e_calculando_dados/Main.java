package _01_sintaxe_basica.ex02_lendo_e_calculando_dados;

import java.util.Locale;
import java.util.Scanner;

/**
 * EXERCÍCIO 02 - Lendo e Calculando Dados
 *
 * Escreva um programa que leia dois valores inteiros informados pelo
 * usuário e exiba na tela o resultado da soma entre eles.
 *
 * @author Alfredo Lopes
 * @since 2026
 */
public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o primeiro valor: ");
        int valor1 = sc.nextInt();

        System.out.println("Digite o segundo valor: ");
        int valor2 = sc.nextInt();

        int resultado = valor1 + valor2;
        System.out.println("O resultado da soma desses valores é: " + resultado);

        sc.close();
    }
}
