package com.regras.app;

import com.regras.model.Conta;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        
        // Variaveis
        int opcaoMenu;
        double valor = 0;

        // Classes
        Scanner leia = new Scanner(System.in);
        Conta cc = new Conta(null,null,null,null,0);

        System.out.println("Nome do titular da conta:");
        cc.setTitular(leia.nextLine());
        System.out.println("CPF:");
        cc.setCpf(leia.nextLine());

        do {
            // Menu
            System.out.println("\nBANCO JAVA");
            System.out.println("1 - Exibir dados da conta");
            System.out.println("2 - Fazer saque");
            System.out.println("3 - Fazer depósito");
            System.out.println("4 - Sair\n");

            System.out.print("Digite: ");
            opcaoMenu = leia.nextInt();

            switch (opcaoMenu) {
                case 1:
                    cc.exibirDados();
                    break;
                case 2:
                    System.out.println("\nDigite o valor do saque:");
                    valor = leia.nextDouble();

                    System.out.println(cc.getSaldo() < valor || valor <= 0 ? "Saldo indisponivel" : "Saque de R$" + cc.fazerSaque(valor));

                    break;
                case 3:
                    System.out.println("\nDigite o valor do deposito:");
                    valor = leia.nextDouble();
                
                    System.out.println(valor <= 0 ? "Valor inválido" : "Depósito de R$" + cc.fazerDeposito(valor));

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
