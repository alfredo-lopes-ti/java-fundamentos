package _02_estruturas_condicionais.ex12_condicao_ternaria;

import java.util.Scanner;
import java.util.Locale;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);

        Scanner sc = new Scanner(System.in);

        /*double preco = 34.5;
        double desconto;
        if (preco < 20.0) {
            desconto = preco * 0.1;
        }  else {
            desconto = preco * 0.05;
        } */

        // Simplificando através de uma expressão condicional ternária
        double preco = sc.nextDouble();
        double desconto = (preco < 20.0) ? preco * 0.1 : preco * 0.05;
        System.out.printf("Desconto: R$ %.2f%n", desconto);
    }

}