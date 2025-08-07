package com.atividade_02.app;

import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
    
        // Instacia Objeto Scanner
        Scanner leia = new Scanner(System.in);

        String nome;
        int idade, opcao;
        boolean entradaNegada = false;

        System.out.println("-----------------");
        System.out.println("DADOS DO INGRESSO");
        System.out.println("-----------------");
        
        System.out.println("Seu nome: ");
        nome = leia.nextLine();
        System.out.println("-----------------");
        
        System.out.println("Sua idade: ");
        idade = leia.nextInt();
        System.out.println("-----------------");

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
                System.out.println("------");
                System.out.println("TICKET");
                System.out.println("------");
                System.out.println("Nome: " + nome);
                System.out.println("Filme: Branca de Neve");
                System.out.println("Ingresso: Adquirido");
                System.out.println("---------------------");
                break;
            } else if ( idade >= 18 && opcao == 2) {
                System.out.println("------");
                System.out.println("TICKET");
                System.out.println("------");
                System.out.println("Nome: " + nome);
                System.out.println("Filme: Premonição");
                System.out.println("Ingresso: Adquirido");
                System.out.println("-------------------");
                break;
            }  else if (idade >= 14 && opcao == 3) {
                System.out.println("------");
                System.out.println("TICKET");
                System.out.println("------");
                System.out.println("Nome: " + nome);
                System.out.println("Filme: Guerra dos Mundos");
                System.out.println("Ingresso: Adquirido");
                System.out.println("------------------------");
                break;
            } else if (opcao == 4) {
                System.out.println("------");
                System.out.println("TICKET");
                System.out.println("------");
                System.out.println("Nome: " + nome);
                System.out.println("Filme: Carros");
                System.out.println("Ingresso: Adquirido");
                System.out.println("-------------------");
                break;
            } else if ( idade >= 18 && opcao == 5) {
                System.out.println("------");
                System.out.println("TICKET");
                System.out.println("------");
                System.out.println("Nome: " + nome);
                System.out.println("Filme: Jogos Mortais");
                System.out.println("Ingresso: Adquirido");
                System.out.println("--------------------");
                break;
            } else if (opcao < 1 || opcao > 5) {
                System.out.println("-----------------------------------------");
                System.out.println("Escolha apenas opções válidas!");
                System.out.println("-----------------------------------------");
                 entradaNegada = true;
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
