package _03_estruturas_repeticao.ex08_divisores;

import java.util.Locale;
import java.util.Scanner;

/**
 * EXERCÍCIO 08 - Divisão de Valores
 *
 * Ler um número inteiro N e calcular todos os seus divisores.
 *
 * @author Alfredo Lopes
 * @since 2026
 */
public class Main {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                System.out.println(i);
            }
        }

        sc.close();

    }
}
