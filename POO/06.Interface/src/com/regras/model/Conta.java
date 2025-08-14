package com.regras.model;

import com.regras.interfaces.Iconta;

public class Conta implements Iconta {

    // Atributos
    private String titular;
    private String cpf;
    private String agencia;
    private String numeroConta;
    private double saldo;

    // Construtor
    public Conta(String titular, String cpf, String agencia, String numeroConta, double saldo) {
        this.titular = titular;
        this.cpf = cpf;
        this.agencia = agencia;
        this.numeroConta = numeroConta;
        this.saldo = saldo;
    }

    // Getters & Setters
    public String getTitular() {
        return this.titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public String getCpf() {
        return this.cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getAgencia() {
        return this.agencia;
    }

    public void setAgencia(String agencia) {
        this.agencia = agencia;
    }

    public String getNumeroConta() {
        return this.numeroConta;
    }

    public void setNumeroConta(String numeroConta) {
        this.numeroConta = numeroConta;
    }

    public double getSaldo() {
        return this.saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    @Override
    public void exibirDados() {
       System.out.println("\nDADOS DA CONTA");
       System.out.println("Titular: " + this.titular);
       System.out.println("CPF: " + this.cpf);
       System.out.println("Agência: " + this.agencia);
       System.out.println("Conta: " + this.numeroConta);
       System.out.println("Saldo R$ " + String.format("%.2f", this.saldo));
    }

    @Override
    public double fazerDeposito(double valor) {
        this.saldo += valor;
        return this.saldo;
    }

    @Override
    public double fazerSaque(double valor) {
        this.saldo -= valor;
        return this.saldo;
    }

}
