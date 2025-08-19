package com.composicao.app;

import javax.swing.JOptionPane;

import com.composicao.model.Conta;
import com.composicao.model.Pessoa;

public class App {
    public static void main(String[] args) throws Exception {
        
        // Classes
        Pessoa usuario = new Pessoa(null, null, null, null, null);
        Conta conta = new Conta("1234-5", "9876-5", 0, usuario);

        // Array opções menu
        String opcoes[] = {
            "Exibir dados da conta", 
            "Fazer depósito", 
            "Fazer saque", 
            "Sair"};

        // Variaveis
        Object opcao;
        double valor;

        // Input do titular da conta
        usuario.setNome(JOptionPane.showInputDialog("Informe o nome do titular da conta:"));
        usuario.setCpf(JOptionPane.showInputDialog("Informe o CPF do titular da conta:"));
        usuario.setEmail(JOptionPane.showInputDialog("Informe o e-mail do titular da conta:"));
        usuario.setTelefone(JOptionPane.showInputDialog("Informe o telefone do titular da conta:"));
        usuario.setEndereco(JOptionPane.showInputDialog("Informe o endereço do titular da conta:"));

        do {
            opcao = JOptionPane.showInputDialog(
                null, 
                "Escolha a operação:", 
                "Java Bank", 
                JOptionPane.QUESTION_MESSAGE, 
                null, 
                opcoes, 
                opcoes[0]);

            switch (opcao.toString()) {
                case "Exibir dados da conta":
                    JOptionPane.showMessageDialog(
                        null, 
                        conta.exibirDados(), 
                        "Dados da conta", 
                        JOptionPane.INFORMATION_MESSAGE
                    );
                    break;
                case "Fazer depósito":
                    valor = Double.parseDouble(JOptionPane.showInputDialog("Informe o valor do depósito em R$:"));
                    JOptionPane.showMessageDialog(
                        null, 
                        "Depósito efetuado com sucesso.\nSaldo atual: R$ " + conta.fazerDeposito(valor), 
                        "Depósito", 
                        JOptionPane.INFORMATION_MESSAGE
                    );
                    break;
                case "Fazer saque":
                    valor = Double.parseDouble(JOptionPane.showInputDialog("Informe o valor do saque em R$:"));
                    JOptionPane.showMessageDialog(
                        null, 
                        "Saque efetuado com sucesso.\nSaldo atual: R$ " + conta.fazerSaque(valor), 
                        "Saque", 
                        JOptionPane.INFORMATION_MESSAGE
                    );
                    break;
                case "Sair":
                    break;
            }

        } while(opcao != "Sair");

    }

}
