package com.ifelse.app;

import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
         // Instancia o objeto Scanner
    Scanner leia = new Scanner(System.in);

    String nome;
    int idade;

    // Input
    System.out.println("Informe seu nome:");
    nome = leia.nextLine();

    System.out.println("Informe sua idade:");
    idade = leia.nextInt();

    if (idade > 18) {
        System.out.println(nome + " é maior de idade.");
    } else {
        System.out.println(idade + "é menor de idade.");
    }

    // Fecha o objeto leia
    leia.close();

    }
    
}
