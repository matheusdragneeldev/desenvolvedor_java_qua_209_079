package com.atividade_02.app;

import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
    
        // Instacia Objeto Scanner
        Scanner leia = new Scanner(System.in);

        String nome;
        int idade, classificacao, opcao;
        boolean entradaNegada = false;

            System.out.println("Seu nome: ");
            nome = leia.nextLine();

            System.out.println("Sua idade: ");
            idade = leia.nextInt();

        do {
            System.out.println("----------------------------------------------------");
            System.out.println("CINEMA");
            System.out.println("----------------------------------------------------");
            System.out.println("Escolha uma opção:");
            System.out.println("1 - Branca de Neve (Classificação Indicativa +10)");
            System.out.println("2 - Premonição (Classificação Indicativa +18)");
            System.out.println("3 - Guerra dos Mundos (Classificação Indicativa +14)");
            System.out.println("4 - Carros (Classificação Indicativa Livre)");
            System.out.println("5 - Jogos Mortais (Classificação Indicativa +18)");
            System.out.println("----------------------------------------------------");
            opcao = leia.nextInt();

            if ( idade >= 10 && opcao == 1) {
                System.out.println("Ingresso comprado");
                break;
            } else if ( idade >= 18 && (opcao == 2 || opcao == 5)) {
                System.out.println("Ingresso comprado");
                break;
            } else if (idade >= 14 && opcao == 3) {
                System.out.println("Ingresso comprado");
                break;
            } else if (opcao == 4) {
                System.out.println("Ingresso comprado");
                break;
            } else {
                 System.out.println("-----------------------------------------");
                 System.out.println("Idade não permitida! Escolha outro filme.");
                 System.out.println("-----------------------------------------");
                entradaNegada = true;
            }

        } while (entradaNegada);

        // Fecha Scanner
        leia.close();

    }
}
