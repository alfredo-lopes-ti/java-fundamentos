package _05_arrays_e_listas.ex11.application;

import java.util.Locale;
import java.util.Scanner;

public class Program {

    public static void main(String[] args) {

        // Configura o padrão regional para aceitar o ponto (.) como separador decimal
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        
        int n, menCount, womenCount;
        double minHeight, maxHeight, avgFemaleHeight, totalFemaleHeight;

        // Solicita ao usuário a quantidade de elementos que serão armazenados nos vetores
        System.out.print("How many people will be entered? ");
        n = sc.nextInt();

        // Declaração dos vetores (arrays) para armazenar as alturas e os gêneros
        double[] heights = new double[n];
        char[] genders = new char[n];

        // Loop para preencher os vetores com os dados informados pelo usuário
        for (int i = 0; i < n; i++) {
            System.out.printf("Height of person %d: ", i + 1);
            heights[i] = sc.nextDouble();
            System.out.printf("Gender of person %d: ", i + 1);
            genders[i] = sc.next().charAt(0);
        }

        // Define o primeiro elemento como ponto de partida para a menor e maior altura
        minHeight = heights[0];
        maxHeight = heights[0];

        // Varre o vetor de alturas para encontrar o valor máximo e mínimo
        for (int i = 1; i < n; i++) {
            if (heights[i] > maxHeight) {
                maxHeight = heights[i];
            }
            if (heights[i] < minHeight) {
                minHeight = heights[i];
            }
        }

        // Inicializa os contadores e acumuladores
        menCount = 0;
        womenCount = 0;
        totalFemaleHeight = 0;
        
        // Loop para contabilizar homens, mulheres e somar a altura das mulheres
        for (int i = 0; i < n; i++) {
            if (genders[i] == 'M') {
                menCount++;
            } else {
                womenCount++;
                totalFemaleHeight = totalFemaleHeight + heights[i];
            }
        }

        // Calcula a média de altura feminina (com proteção básica caso nenhuma mulher seja informada)
        avgFemaleHeight = womenCount > 0 ? totalFemaleHeight / womenCount : 0.0;

        // Imprime os resultados formatados em inglês
        System.out.printf("Min height = %.2f\n", minHeight);
        System.out.printf("Max height = %.2f\n", maxHeight);
        System.out.printf("Average height of women = %.2f\n", avgFemaleHeight);
        System.out.printf("Number of men = %d\n", menCount);

        sc.close();
    }
}