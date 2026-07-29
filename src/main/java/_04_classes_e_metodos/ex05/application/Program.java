package _04_classes_e_metodos.ex05.aplication;

import java.util.Locale;
import java.util.Scanner;
import _04_classes_e_metodos.ex05.util.CurrencyConverter;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("What is the dollar price? ");
        double dollarPrice = sc.nextDouble();
        System.out.print("How many dollars will be bought? ");
        double dollars = sc.nextDouble();

        double amountToPay = CurrencyConverter.dollarToReal(dollarPrice, dollars);

        System.out.printf("Amount to be paid in reais = %.2f%n", amountToPay);

        sc.close();

    }
}
