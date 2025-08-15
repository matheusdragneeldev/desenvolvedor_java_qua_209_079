package com.calculadora.app;

import javax.swing.JOptionPane;
import com.calculadora.controller.Calculadora;

public class App {
    public static void main(String[] args) throws Exception {
        
        // Classes
        Calculadora calculadora = new Calculadora(0, 0);

        // Array
        String[] opcoes = {"Somar", "Subtrair", "Multiplicar", "Dividir", "Sair"};
        Object opcao = "";

        do {

            // Menu dropdown
            opcao = JOptionPane.showInputDialog(
                null, 
                "Selecione uma opção:", 
                "Calculadora", 
                JOptionPane.QUESTION_MESSAGE, 
                null, 
                opcoes, 
                opcoes[0]);

            // Input de X / Y    
            if (opcao != "Sair") {
                calculadora.setX(Double.parseDouble(JOptionPane.showInputDialog("Digite o valor de X: ")));
                calculadora.setY(Double.parseDouble(JOptionPane.showInputDialog("Digite o valor de Y: ")));
            }

            // Executa metodos
            if (opcao == "Somar") {
                JOptionPane.showMessageDialog(
                    null, 
                    calculadora.somar(calculadora.getX(), calculadora.getY()),
                    "Resultado da soma", 
                    JOptionPane.INFORMATION_MESSAGE);
            }

            if (opcao == "Subtrair") {
                JOptionPane.showMessageDialog(
                    null, 
                    calculadora.subtrair(calculadora.getX(), calculadora.getY()),
                    "Resultado da subtração", 
                    JOptionPane.INFORMATION_MESSAGE);
            }

            if (opcao == "Multiplicar") {
                JOptionPane.showMessageDialog(
                    null, 
                    calculadora.multiplicar(calculadora.getX(), calculadora.getY()),
                    "Resultado da multiplicação", 
                    JOptionPane.INFORMATION_MESSAGE);
            }

            if (opcao == "Dividir") {
                JOptionPane.showMessageDialog(
                    null, 
                    calculadora.dividir(calculadora.getX(), calculadora.getY()),
                    "Resultado da divisão", 
                    JOptionPane.INFORMATION_MESSAGE);
            }

        } while(opcao != "Sair");

    }
}
