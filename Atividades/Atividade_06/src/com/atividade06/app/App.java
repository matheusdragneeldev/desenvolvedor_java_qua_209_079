package com.atividade06.app;

import javax.swing.JOptionPane;

import com.atividade06.model.Carro;
import com.atividade06.model.Pessoa;

public class App {
    public static void main(String[] args) throws Exception {
       
        // Classe
        Pessoa usuario = new Pessoa(null, null, null, null, null, null);
        Carro carro = new Carro("", "", "", "", "", null);

        // Variaveis
        String opcoes[] = {"Cadastrar usuário", "Cadastrar veículo", "Exibir dados", "Sair"};
        Object opcao;

        do {
            opcao = JOptionPane.showInputDialog(
                null, 
                "Selecione uma opção:", 
                "ATIVIDADE 06", 
                JOptionPane.QUESTION_MESSAGE, 
                null, 
                opcoes, 
                opcoes[0]
            );

            switch (opcao.toString()) {
                case "Cadastrar usuário":
                    usuario.setNome(JOptionPane.showInputDialog("Digite seu nome:"));
                    usuario.setDataNascimento(JOptionPane.showInputDialog("Data de nascimento:"));
                    usuario.setCpf(JOptionPane.showInputDialog("CPF:"));
                    usuario.setTelefone(JOptionPane.showInputDialog("Telefone:"));
                    usuario.setEmail(JOptionPane.showInputDialog("E-mail:"));
                    usuario.setEndereco(JOptionPane.showInputDialog("Endereço:"));
                    break;
                case "Cadastrar veículo":
                    carro.setModelo(JOptionPane.showInputDialog("Digite o modelo do carro:"));
                    carro.setFabricante(JOptionPane.showInputDialog("Fabricante:"));
                    carro.setAno(JOptionPane.showInputDialog("Ano:"));
                    carro.setCor(JOptionPane.showInputDialog("Cor:"));
                    carro.setPlaca(JOptionPane.showInputDialog("Placa:"));
                    break;
                case "Exibir dados":
                    JOptionPane.showMessageDialog(
                        null, 
                        carro.exibirDados(), 
                        "DADOS DO CARRO", 
                        JOptionPane.INFORMATION_MESSAGE
                    );
                    break;
                case "Sair":
                    break;
            }
        } while (opcao != "Sair");
    }
}
