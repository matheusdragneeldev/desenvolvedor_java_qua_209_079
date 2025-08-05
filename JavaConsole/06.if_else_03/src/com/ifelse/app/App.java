package com.ifelse.app;

import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        
        // Instacia objeto Scanner
        Scanner leia = new Scanner(System.in);

        // Declaração de variaveis
        String nome;
        double nota;

        // Input
        System.out.println("Nome do aluno: ");
        nome = leia.nextLine();

        System.out.println("Nota do aluno: ");
        nota = leia.nextDouble();

        // 
        if (nota >= 7) {
            System.out.println("Aluno "+nome+" está aprovadoMa com a nota "+nota);
        } else if (nota >= 5) {
            System.out.println("Aluno "+nome+" está em recuperação com a nota "+nota);
        } else {
            System.out.println("Aluno "+nome+" está reprovado com a nota "+nota);
        }

        // Fecha objeto leia
        leia.close();
    }

}
