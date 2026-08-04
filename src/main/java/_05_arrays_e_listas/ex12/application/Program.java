package _05_arrays_e_listas.ex12.application;

import java.util.Locale;
import java.util.Scanner;

import _05_arrays_e_listas.ex12.entities.Rent;

/*
A dona de um pensionato possui dez quartos para alugar para estudantes, 
sendo esses quartos identificados pelos números 0 a 9.  

Fazer um programa que inicie com todos os dez quartos vazios, e depois 
leia uma quantidade N representando o número de estudantes que vão alugar 
quartos (N pode ser de 1 a 10). Em seguida, registre o aluguel dos N estudantes. 
Para cada registro de aluguel, informar o nome e email do estudante, bem como 
qual dos quartos ele escolheu (de 0 a 9). Suponha que seja escolhido um quarto vago. 
Ao final, seu programa deve imprimir um relatório de todas ocupações do pensionato, 
por ordem de quarto, conforme exemplo. 
*/

public class Program {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        // Cria o vetor com 10 posições (representando os quartos 0 a 9)
        // Por padrão, todas as posições iniciam como 'null' (vazios)
        Rent[] vect = new Rent[10];

        System.out.print("How many rooms will be rented? ");
        int n = sc.nextInt();

        // O laço vai de 1 até <= n para registrar a quantidade correta de estudantes
        for (int i = 1; i <= n; i++) {
            System.out.println();
            System.out.println("Rent #" + i + ":");
            System.out.print("Name: ");
            sc.nextLine(); // Limpa o buffer do scanner
            String name = sc.nextLine();
            
            System.out.print("Email: ");
            String email = sc.next();
            
            System.out.print("Room: ");
            int roomNumber = sc.nextInt();
            
            // Instancia o objeto Rent diretamente na posição escolhida do vetor
            vect[roomNumber] = new Rent(name, email);
        }

        System.out.println();
        System.out.println("Busy rooms:");
        
        // Percorre o vetor do índice 0 ao 9 para incluir o quarto 0 no relatório
        for (int i = 0; i < 10; i++) {
            // Imprime apenas os quartos que foram ocupados (diferentes de null)
            if (vect[i] != null) { 
                System.out.println(i + ": " + vect[i]);
            }
        } // Chave que faltava fechar no código original

        sc.close();
    }
}