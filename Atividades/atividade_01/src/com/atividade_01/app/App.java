package com.atividade_01.app;

import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
       
        // Instacia o objeto Scanner
        Scanner leia = new Scanner(System.in);

        String nome;
        String condicaoImc = "";
        int opcao = 0;
        double altura, peso, resultadoImc;

        do {

        System.out.println("-----------------");
        System.out.println("Calculadora IMC");
        System.out.println("-----------------");
        System.out.println("1 - Novo calculo.");
        System.out.println("2 - Sair.");
        System.out.println("-----------------");
        opcao = leia.nextInt();

            if (opcao == 1) {
                leia.nextLine();

                System.out.println("Informe seu nome:");
                nome = leia.nextLine();

                System.out.println("Informe sua altura:");
                altura = leia.nextDouble();

                System.out.println("Informe seu peso:");
                peso = leia.nextDouble();

                resultadoImc = peso / (altura*altura);

                if (resultadoImc < 18.5) {
                    condicaoImc = "Abaixo do peso.";
                } else if (resultadoImc >= 18.5 && resultadoImc <= 24.9) {
                    condicaoImc = "Peso normal.";
                } else if (resultadoImc >= 25 && resultadoImc <= 29.9) {
                    condicaoImc = "Sobrepeso.";
                } else if (resultadoImc >= 30 && resultadoImc <= 34.9) {
                    condicaoImc = "Obesidade grau I.";
                } else if (resultadoImc >= 35 && resultadoImc <= 39.9) {
                    condicaoImc = "Obesidade grau II.";
                } else {
                    condicaoImc = "Obesidade grau III.";
                }

                System.out.println("Seu IMC é " + resultadoImc + ". Sua condição é: " + condicaoImc);

            } else if (opcao != 2 ) {

            }
        } while (opcao != 2);
        
        // Fecha Scanner
        leia.close();

    }

}
