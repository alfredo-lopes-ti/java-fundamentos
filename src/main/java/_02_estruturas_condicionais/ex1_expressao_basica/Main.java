package src.main.java._02_estruturas_condicionais.ex1_expressao_basica;

import java.util.Scanner;
import java.util.Locale;

public class Main {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int x;

        System.out.println("Digite um número: ");
        x = sc.nextInt();

        if (x < 0) {
            System.out.println("Número negativo");
        } else {
            System.out.println("Número positivo");
        }
        sc.close();
    }
}
