package _04_classes_e_metodos.ex05.util;

public class CurrencyConverter {

    public static double IOF = 0.06;

    public static double dollarToReal(double dollarPrice, double dollars) {
        return dollarPrice * dollars * (1.0 + IOF);
    }
    
}
