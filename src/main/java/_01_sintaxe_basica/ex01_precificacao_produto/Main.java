package _01_sintaxe_basica.ex01_precificacao_produto;

import java.util.Locale;
import java.util.Scanner;

/**
 * EXERCÍCIO 01 - Precificação de Produto
 *
 * Um sistema de ERP precisa calcular o preço final de venda de um produto
 * a partir do seu custo de fábrica.
 * Considere: custo de fábrica de R$ 150,00, margem de lucro de 40% sobre o
 * custo, e uma alíquota de ICMS de 18% também sobre o custo.
 * Calcule e exiba o valor do imposto, o valor do lucro e o preço de venda
 * final (custo + imposto + lucro).
 *
 * @author Alfredo Lopes
 * @since 2026
 */
public class Main {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner input = new Scanner(System.in);

        // 1. DECLARAÇÃO DE VARIÁVEIS E CONSTANTES
        double custoFabrica = 150.00;
        double margemLucroPercentual = 40.0;

        // Em Java, usamos a palavra-chave 'final' para criar constantes.
        // Por padrão de mercado, o nome de constantes é sempre em MAIÚSCULO.
        final double ALIQUOTA_ICMS = 18.0;

        // ATENÇÃO: como as duas variáveis acima representam percentuais (%),
        // é preciso dividir por 100 antes de multiplicar pelo custo.
        double valorImposto = custoFabrica * (ALIQUOTA_ICMS / 100.0);

        double valorLucro = custoFabrica * (margemLucroPercentual / 100.0);

        double precoVendaFinal = custoFabrica + valorImposto + valorLucro;

        // SAÍDA DE DADOS (Exibição dos resultados)
        System.out.println("---Relatório de Precificação ERP");
        System.out.println("Custo de Fabrica: " + custoFabrica);
        System.out.println("Valor do Imposto: " + valorImposto);
        System.out.println("Valor do Lucro: " + valorLucro);
        System.out.println("Preço de Venda Final: " + precoVendaFinal);

        input.close();
    }
}
