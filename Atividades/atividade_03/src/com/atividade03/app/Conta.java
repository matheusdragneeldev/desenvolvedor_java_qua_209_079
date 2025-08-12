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

    // Metodos
    public void exibirDados() {
        System.out.println("\nNome do tiular: " + this.nomeTitular);
        System.out.println("CPF: " + this.cpf);
        System.out.println("Agência: " + this.agencia);
        System.out.println("Conta: " + this.numeroConta);
        System.out.println("Saldo da conta R$" + String.format("%.2f", this.saldo));
    }

    public void fazerSaque(Double valorSaque) {
        if (this.saldo < valorSaque || valorSaque <= 0) {
            System.out.println("Saldo indisponivel!");
        } else {
            this.saldo-= valorSaque;
            System.out.println("\nSaque de R$" + valorSaque + " realizado.");
            System.out.println("Saldo atual R$" + String.format("%.2f", this.saldo));
        }
    }

    public void fazerDeposito(Double valorDeposito) {
        if (valorDeposito <= 0) {
            System.out.println("Valor inválido!");
        } else {
            this.saldo+= valorDeposito;
            System.out.println("\nDeposito de R$" + valorDeposito + " realizado.");
            System.out.println("Saldo atual R$" + String.format("%.2f", this.saldo));
        }    
    }

    public void exibirMenu() {
        System.out.println("\nBANCO JAVA");
        System.out.println("1 - Exibir dados da conta");
        System.out.println("2 - Fazer saque");
        System.out.println("3 - Fazer depósito");
        System.out.println("4 - Sair\n");
    }

}
