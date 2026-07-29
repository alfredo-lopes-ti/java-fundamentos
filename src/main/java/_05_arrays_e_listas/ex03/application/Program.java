package _05_arrays_e_listas.ex03.application;

import java.util.Locale;
import java.util.Scanner;

/*
Fazer um programa para ler nome, idade e altura de N pessoas, conforme exemplo. Depois, mostrar na
tela a altura média das pessoas, e mostrar também a porcentagem de pessoas com menos de 16 anos,
bem como os nomes dessas pessoas caso houver.
*/

public class Program {
    public static void main(String[] args) {

        // Configura o Scanner para aceitar o ponto (.) como separador decimal (padrão americano)
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        // Declaração de variáveis que serão usadas para acumular e guardar os resultados finais
        int nminor;
        double totalHeight, averageHeight, lowestPercentage;

        // Pergunta a quantidade de elementos (N) para definir o tamanho dos vetores
        System.out.println("How many people are you type? ");
        int n = sc.nextInt();

        // Criação de 3 vetores paralelos com o tamanho 'N' digitado pelo usuário
        String[] name = new String[n];
        int[] age = new int[n];
        double[] height = new double[n];

        // 1. ETAPA DE LEITURA: Preenche os vetores com as informações de cada pessoa
        for (int i = 0; i < n; i++) {
            System.out.printf("Data " + (i + 1) + " people: ");

            System.out.print("Enter the name: ");
            name[i] = sc.next(); // Lê apenas a primeira palavra digitada como nome

            System.out.print("Enter the age: ");
            age[i] = sc.nextInt(); // Lê a idade inteira

            System.out.print("enter the height ");
            height[i] = sc.nextDouble(); // Lê a altura no formato double
        }

        // Inicialização dos acumuladores antes de entrar no laço de processamento
        nminor = 0;
        totalHeight = 0;

        // 2. ETAPA DE PROCESSAMENTO: Percorre os vetores para calcular os totais
        for (int i = 0; i < n; i++) {
            // Contagem condicional: se a idade for menor que 16, incrementa o contador
            if (age[i] < 16) {
                nminor++;
            }
            // Acumula a soma de todas as alturas
            totalHeight = totalHeight + height[i];
        }

        // 3. ETAPA DE CÁLCULO DAS ESTATÍSTICAS:
        // Altura média = soma total de alturas dividida pelo total de pessoas (N)
        averageHeight = totalHeight / n;

        // Porcentagem de menores = (quantidade de menores / N) * 100
        // O (double) garante que a divisão entre inteiros não descarte as casas decimais antes da multiplicação
        lowestPercentage = ((double) nminor / n) * 100.0;

        // 4. ETAPA DE SAÍDA: Exibe os resultados calculados formatando as casas decimais
        System.out.printf("\nAverage height: %.2f\n", averageHeight);
        System.out.printf("People under 16 years old: %.1f%%\n", lowestPercentage);

        // Percorre o vetor novamente apenas para imprimir os nomes dos menores de 16 anos
        for (int i = 0; i < n; i++) {
            if (age[i] < 16) {
                System.out.printf("%s\n", name[i]);
            }
        }

        // Fecha o recurso Scanner para evitar vazamento de memória (resource leak)
        sc.close();
    }
}