package com.atividade03.app;

import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

        // Variaveis
        int opcaoMenu = 0;
        double valorSaque, valorDeposito;

        // Instacia classes
        Scanner leia = new Scanner(System.in);
        Conta conta = new Conta(null, null, "123-4", "987-6", 0.0);

        System.out.println("Nome do titular da conta:");
        conta.nomeTitular = leia.nextLine();
        System.out.println("CPF:");
        conta.cpf = leia.nextLine();

        do {
            // Menu
            conta.exibirMenu();
            System.out.print("Digite: ");
            opcaoMenu = leia.nextInt();

            switch (opcaoMenu) {
                case 1:
                    conta.exibirDados();
                    break;
                case 2:

                    /* Opção com operador ternario
                    System.out.println((valorSaque > 0) ? "Saque realizado com sucesso. Saldo: R$ "
                    + conta.fazerSaque(valorSaque) : "Saldo indisponivel!");
                    */

                    System.out.println("\nDigite o valor do saque:");
                    valorSaque = leia.nextDouble();
                    conta.fazerSaque(valorSaque);
                    break;
                case 3:
                    System.out.println("\nDigite o valor do deposito:");
                    valorDeposito = leia.nextDouble();
                    conta.fazerDeposito(valorDeposito);
                    break;
                case 4:
                    System.out.println("\nPrograma finalizado.");
                    break;
                default:
                    System.out.println("\nDigite uma opção válida!");
            }
        } while (opcaoMenu != 4);
        
        // Fecha Scanner
        leia.close();
    }
}
