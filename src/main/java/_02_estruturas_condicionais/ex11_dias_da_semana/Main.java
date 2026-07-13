package _02_estruturas_condicionais.ex11_dias_da_semana;

import java.util.Locale;
import java.util.Scanner;

/**
 * EXERCÍCIO 11 - Dias da Semana
 *
 * Escreva um programa que leia um número inteiro entre 1 e 7 e exiba o
 * nome do dia da semana correspondente (1 = Domingo ... 7 = Sábado),
 * utilizando a estrutura switch/case. Para qualquer outro valor, exiba
 * "Valor Invalido".
 *
 * @author Alfredo Lopes
 * @since 2026
 */
public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);

        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        String dia;

        switch (x) {
            case 1:
                dia = "Domingo";
                break;
            case 2:
                dia = "Segunda";
                break;
            case 3:
                dia = "Terça";
                break;
            case 4:
                dia = "Quarta";
                break;
            case 5:
                dia = "Quinta";
                break;
            case 6:
                dia = "Sexta";
                break;
            case 7:
                dia = "Sabado";
                break;
            default: // Caso todas as outras falhem
                dia = "Valor Invalido";
                break;
        }

        System.out.println("Dia da semana " + dia);
        sc.close();
    }
}
