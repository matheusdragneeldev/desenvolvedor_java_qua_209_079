package com.dialogos.app;

import javax.swing.JOptionPane;

import com.dialogos.model.Pessoa;

public class App {
    public static void main(String[] args) throws Exception {
        
        // Classes
        Pessoa usuario = new Pessoa(null, 0);

        // Caixa input
        usuario.setNome(JOptionPane.showInputDialog("Digite seu nome: "));
        usuario.setIdade(Integer.parseInt(JOptionPane.showInputDialog("Digite sua idade: ")));

        // Caixa output
        JOptionPane.showMessageDialog(
            null, 
            "Nome: " + usuario.getNome() +
            "\nIdade: " + usuario.getIdade(), 
            "Saída", 
            JOptionPane.INFORMATION_MESSAGE);
    }

}
