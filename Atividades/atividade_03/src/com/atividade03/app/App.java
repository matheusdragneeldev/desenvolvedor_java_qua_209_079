package com.atividade03.app;

import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        
        // Variaveis
        int opcaoMenu = 0;

        // Instacia classes
        Scanner leia = new Scanner(System.in);
        Conta conta = new Conta(null, null, null, null, 0);

        System.out.println("Nome do titular da conta:");
        conta.nomeTitular = leia.nextLine();
        System.out.println("CPF:");
        conta.cpf = leia.nextLine();

        conta.menu();

        // Menu
        System.err.print("Digite: ");
        opcaoMenu = leia.nextInt();

        switch (opcaoMenu) {
            case 1:
                conta.dadosConta();
                break;
            case 2:
                break;
            case 3:
                break;
            case 4:
                break;
            default:
                break;
        }

        // Fecha Scanner
        leia.close();
    }
}
