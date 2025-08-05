package com.ifelse.app;

import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        
        // Instacia objeto Scanner
        Scanner leia = new Scanner(System.in);

        // Declaração de variaveis
        String nome;
        int idade;

        // Input
        System.out.println("Digite seu nome: ");
        nome = leia.nextLine();

        System.out.println("Digite sua idade: ");
        idade = leia.nextInt();


        // Operador ternario
        System.out.println(nome + ((idade >= 18) ? " é maior de idade." : " é menor de idade"));

        // Fecha Scanner
        leia.close();

    }

}
