package src.main.java._01_sintaxe_basica.ex02_lendo_e_calculando_dados;

import java.util.Scanner;
import java.util.Locale;

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
