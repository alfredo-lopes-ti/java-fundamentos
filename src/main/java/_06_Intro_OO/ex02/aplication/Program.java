package _06_Intro_OO.ex02.aplication;

import java.util.Scanner;
import java.util.Locale;
import _06_Intro_OO.ex02.entities.OrdemServico;

public class Program {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o número da ordem de serviço 1: ");
        int numero = sc.nextInt();

        System.out.println("Digite o nome do cliente da ordem de serviço 1: ");
        sc.nextLine(); // Dica: limpa o buffer do teclado antes de ler texto
        String cliente = sc.nextLine();

        System.out.println("Digite o número de horas trabalhadas na ordem de serviço 1: ");
        double horas = sc.nextDouble();

        System.out.println("Digite o valor da hora do consultor na ordem de serviço 1: ");
        double valorHora = sc.nextDouble();

        // Cria a primeira ordem de serviço
        OrdemServico os1 = new OrdemServico(numero, cliente, horas, valorHora);

        System.out.println("Digite o número da ordem de serviço 2: ");
        int numero2 = sc.nextInt();

        System.out.println("Digite o nome do cliente da ordem de serviço 2: ");
        sc.nextLine(); // Dica: limpa o buffer do teclado antes de ler texto
        String cliente2 = sc.nextLine();

        System.out.println("Digite o número de horas trabalhadas na ordem de serviço 2: ");
        double horas2 = sc.nextDouble();

        System.out.println("Digite o valor da hora do consultor na ordem de serviço 2: ");
        double valorHora2 = sc.nextDouble();

        // Cria a segunda ordem de serviço
        OrdemServico os2 = new OrdemServico(numero2, cliente2, horas2, valorHora2);

        System.out.println("Valor total da ordem de serviço 1: " + os1.calcularValorTotal());
        System.out.println("Valor total da ordem de serviço 2: " + os2.calcularValorTotal());

        sc.close();
    }
}
