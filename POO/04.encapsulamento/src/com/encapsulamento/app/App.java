package com.encapsulamento.app;

import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        
        // Instanciando classe
        Scanner leia = new Scanner(System.in);
        Pessoa usuario = new Pessoa();

        // Atribuindo valores
        System.out.println("Digite seu nome:");
        usuario.setNome(leia.nextLine());
        System.out.println("Sua idade:");
        usuario.setIdade(leia.nextInt());

        // Output
        System.out.println("Meu nome é " + usuario.getNome() + ", e tenho " + usuario.getIdade() + " anos.");

        // Fechando Scanner
        leia.close();

    }

}
