package com.contador.app;

import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        
        // Instacia objeto Scanner
        Scanner leia = new Scanner(System.in);

        int numero = 0;

        System.out.println("Digite um número inteiro:");
        numero = leia.nextInt();

        while (numero >= 0) {
            System.out.println(numero);
            numero--;
        }

        // Fecha Scanner
        leia.close();

    }

}
