package src.main.java._01_sintaxe_basica.ex05_funcionario;
import java.util.Scanner;
import java.util.Locale;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int id;
        int quantHoras;
        double valorHora;
        double salarioFinal;

        System.out.println("Digite a ID do funcionário: ");
        id = sc.nextInt();

        System.out.println("Digite a quantidade de horas trabalhadas: ");
        quantHoras = sc.nextInt();

        System.out.println("Digite o valor por horas trabalhadas: ");
        valorHora = sc.nextDouble();

        salarioFinal = quantHoras * valorHora;

        //System.out.printf("ID: %d%n", id);
        //System.out.printf("Salario: R$ %.2f%n", salarioFinal);
        System.out.printf("ID = %d%nSalário = U$ %.2f%n", id, salarioFinal);

        sc.close();
    }
}
