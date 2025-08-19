package com.gasolina.app;

import javax.swing.JOptionPane;

import com.gasolina.model.Combustivel;

public class App {
    public static void main(String[] args) throws Exception {
       
        // Classe
        Combustivel combustivel = new Combustivel(0, 0);

        // Array
        String opcoes[] = {"Calcular melhor combustivel", "Sair"};
        Object opcao;

        do {
            opcao = JOptionPane.showInputDialog(
                null, 
                "Escolha uma opção", 
                null, 
                JOptionPane.QUESTION_MESSAGE,
                null, 
                opcoes, 
                opcoes[0]
            );

            if (opcao == "Calcular melhor combustivel") {
                combustivel.setGasolina(Double.parseDouble(JOptionPane.showInputDialog("Informe o valor da gasolina em R$: ").replace(",", ".")));
                combustivel.setEtanol(Double.parseDouble(JOptionPane.showInputDialog("Informe o valor do etanol em R$: ").replace(",", ".")));

                // Output
                JOptionPane.showMessageDialog(
                    null, 
                    combustivel.calculo(), 
                    "Resultado", 
                    JOptionPane.INFORMATION_MESSAGE
                );
            }

        } while(opcao != "Sair");

    }

}
