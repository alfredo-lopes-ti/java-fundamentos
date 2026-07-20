package _04_classes_e_metodos.ex04.util;

public class Calculator {

    public static final double PI = 3.14;

    public static double circumference(double radius) {
        return 2.0 * PI * radius;
    }

    public static double volume(double radius) {
        return (4.0 / 3.0) * PI * Math.pow(radius, 3);
    }

}
