package _03_estruturas_repeticao.ex03_lendo_valores;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int soma = 0;

        // Estrutura de repetição for
        // inicio | condicao | incremento
        for (int i = 0; i < N; i++) {
            int x = sc.nextInt();
            soma += x;
        }

        System.out.println("Soma: " + soma);

        sc.close();
    }

}
