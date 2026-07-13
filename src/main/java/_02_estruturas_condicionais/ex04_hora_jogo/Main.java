package _02_estruturas_condicionais.ex04_hora_jogo;

import java.util.Locale;
import java.util.Scanner;

/**
 * EXERCÍCIO 04 - Hora do Jogo
 *
 * Escreva um programa que leia a hora de início e a hora de término de
 * uma partida (valores entre 0 e 24) e calcule sua duração em horas.
 * Considere que a partida pode passar da meia-noite, ou seja, a hora
 * final pode ser menor que a hora inicial.
 *
 * @author Alfredo Lopes
 * @since 2026
 */
public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        double horaInicial;
        double horaFinal;
        double duracao;

        System.out.print("Digite a hora de início do jogo: ");
        horaInicial = sc.nextDouble();

        System.out.print("Digite a hora de final: ");
        horaFinal = sc.nextDouble();

        if (horaInicial < horaFinal) {
            duracao = horaFinal - horaInicial;
        } else {
            duracao = (24 - horaInicial) + horaFinal;
        }
        System.out.println("O JOGO DUROU " + duracao + " HORA(S)");

        sc.close();
    }
}
