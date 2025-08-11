package com.objeto.app;

import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
       
        // Instacia classes
        Scanner leia = new Scanner(System.in);
        Pessoa usuario = new Pessoa("", 0, 0.0);

        // Define os valores dos atributos
        System.out.print("Digite seu nome: ");
        usuario.nome = leia.nextLine();
        System.out.print("Sua idade: ");
        usuario.idade = leia.nextInt();
        System.out.print("Sua altura: ");
        usuario.altura = leia.nextDouble();

        // output
        System.err.println(usuario.cumprimentar());
        // usuario.exibirDados();

        // Fecha Scanner
        leia.close();
    }
}
