package src.main.java._02_estruturas_condicionais.ex4_hora_jogo;

import java.util.Scanner;
import java.util.Locale;

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
