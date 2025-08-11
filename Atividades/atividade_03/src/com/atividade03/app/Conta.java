package com.atividade03.app;

public class Conta {

    // Atributos
    public String nomeTitular;
    public String cpf;
    public String agencia;
    public String numeroConta;
    public double saldo;
    
    // Construtor
    public Conta(String nomeTitular, String cpf, String agencia, String numeroConta, double saldo) {
        this.nomeTitular = nomeTitular;
        this.cpf = cpf;
        this.agencia = agencia;
        this.numeroConta = numeroConta;
        this.saldo = saldo;
    }

    public void dadosConta() {
        System.out.println("\nNome do tiular: " + this.nomeTitular);
        System.out.println("CPF: " + this.cpf);
        System.out.println("Agência: " + this.agencia);
        System.out.println("Conta: " + this.numeroConta);
    }

    public void menu() {
        System.out.println("\n1 - Exibir dados da conta");
        System.out.println("2 - Fazer saque");
        System.out.println("3 - Fazer depósito");
        System.out.println("4 - Sair\n");
    }

}
