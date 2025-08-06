package com.doWhile.app;

import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

        // Instacia objeto Scanner
        Scanner leia = new Scanner(System.in);

        String nome;
        int idade = 0;
        int opcao = 0;
        double altura = 0;

        do {

            System.out.println("---------------------------");
            System.out.println("1 - Registrar nova entrada.");
            System.out.println("2 - Sair do programa.");
            System.out.println("Informe a opção desejada:");
            System.out.println("---------------------------");
            opcao = leia.nextInt();

            if (opcao == 1 ) {

                leia.nextLine();

                System.out.println("Informe o nome: ");
                nome = leia.nextLine();

                System.out.println("Informe a idade: ");
                idade = leia.nextInt();

                System.out.println("Informe a altura: ");
                altura = leia.nextDouble();

            } else if (opcao != 2) {
                System.out.println("Opção inválida!");
            } 
        
            if (idade >= 12 && altura >= 1.25) {
                System.out.println("Está autorizado.");
            } else {
                System.out.println("Não está autorizado.");
            }


        } while (opcao != 2);
        
        // Fecha Scanner
        leia.close();

    }
}
