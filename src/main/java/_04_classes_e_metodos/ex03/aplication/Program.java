package _04_classes_e_metodos.ex03.aplication;

import java.util.Locale;
import java.util.Scanner;
import _04_classes_e_metodos.ex03.entities.Product;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);

        Product product = new Product();

        System.out.println("Enter product data:");

        System.out.print("Name: ");
        product.name = scanner.nextLine();

        System.out.print("Price: ");
        product.price = scanner.nextDouble();

        System.out.print("Quantity in stock: ");
        product.quantity = scanner.nextInt();

        System.out.println();
        System.out.println(product);

        System.out.println();
        System.out.println("Enter the number of products to be added in stock: ");
        int quantityToAdd = scanner.nextInt();
        product.addProducts(quantityToAdd);

        System.out.println();
        System.out.println("Updated product data: " + product);

        System.out.println();
        System.out.println("Enter the number of products to be removed from stock: ");
        int quantityToRemove = scanner.nextInt();
        product.removeProducts(quantityToRemove);

        System.out.println();
        System.out.println("Updated product data: " + product);

        scanner.close();
    }
}
