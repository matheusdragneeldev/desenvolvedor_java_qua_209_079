package com.atividade_01.app;

import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
       
        // Instacia o objeto Scanner
        Scanner leia = new Scanner(System.in);

        String nome, diagnostico;
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
            
                // ternario
                diagnostico = (resultadoImc < 18.5) ? nome + " está abaixo do peso."
                : (resultadoImc < 25) ? nome + " está com peso normal."
                : (resultadoImc < 30) ? nome + " está com sobrepeso"
                : (resultadoImc < 35) ? nome + " está obeso."
                : (resultadoImc < 40) ? nome + " está com obesidade nivel II."
                : nome + " está com obesidade mórbida.";

                System.out.println("---------------");
                System.out.println("IMC: " + String.format("%.2f", resultadoImc));
                System.out.println(diagnostico);
                System.out.println("---------------");

            } else if (opcao != 2 ) {
                System.out.println("---------------");
                System.out.println("Opção inválida!");
                System.out.println("---------------");
            }
        } while (opcao != 2);
        
        // Fecha Scanner
        leia.close();

    }

}
