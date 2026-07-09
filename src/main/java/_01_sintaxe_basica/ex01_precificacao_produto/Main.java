package _01_sintaxe_basica.ex01_precificacao_produto;

import java.util.Scanner;
import java.util.Locale;

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

		double valorImposto = custoFabrica * ALIQUOTA_ICMS;

		double valorLucro = custoFabrica * margemLucroPercentual;

		double precoVendaFinal = custoFabrica + valorImposto + valorLucro;

		// SAÍDA DE DADOS (Exibição dos resultados)
		System.out.println("---Relatório de Precificação ERP");
		System.out.println("Custo de Fabrica: " + custoFabrica);

		input.close();
	}
}
