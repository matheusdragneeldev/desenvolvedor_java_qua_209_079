package com.escolha.app;

import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        
        // Instacia objeto Scanner
        Scanner leia = new Scanner(System.in);

        String tipoOperacao = "";
        int primeiroNumero, segundoNumero, operacao;
        double resultado = 0;

        // Input dos números
        System.out.println("Digite o primeiro número: ");
        primeiroNumero = leia.nextInt();

        System.out.println("Digite o segundo número: ");
        segundoNumero = leia.nextInt();

        // Limpeza buffer
        leia.nextLine();

        // Menu
        System.out.println("-------------------");
        System.out.println("Escolha a operação:");
        System.out.println("1 - Somar.");
        System.out.println("2 - Subtrair");
        System.out.println("3 - Multiplicar");
        System.out.println("4 - Dividir");
        System.out.println("-------------------");
        
        operacao = leia.nextInt();

        switch (operacao) {
            case 1:
                 resultado = primeiroNumero + segundoNumero;
                 tipoOperacao = "soma";
                break;
            case 2:
                resultado = primeiroNumero - segundoNumero;   
                tipoOperacao = "subtração";
                break;
            case 3:
                resultado = primeiroNumero * segundoNumero;
                tipoOperacao = "multiplicação";
                break;
            case 4:
                resultado = primeiroNumero / segundoNumero;   
                tipoOperacao = "divisão";
                break; 
            default:
                tipoOperacao = "operação";
                break;
        }

        System.out.println("-------------------");
        System.out.println("O resultado da " + tipoOperacao + " é: " + resultado);

        // Fecha Scanner
        leia.close();
    }

}
