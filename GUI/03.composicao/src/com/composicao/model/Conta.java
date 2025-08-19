package com.composicao.model;

import com.composicao.interfaces.IConta;

public class Conta implements IConta {

    // Atributos
    private String agencia;
    private String numeroConta;
    private double saldo;
    private Pessoa titular;

    // Construtor
    public Conta(String agencia, String numeroConta, double saldo, Pessoa titular) {
        this.agencia = agencia;
        this.numeroConta = numeroConta;
        this.saldo = saldo;
        this.titular = titular;
    }

    // Getters & Setters
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

    public Pessoa getTitular() {
        return this.titular;
    }

    public void setTitular(Pessoa titular) {
        this.titular = titular;
    }

    // Metodos
    @Override
    public String exibirDados() {
        return "\nAgência: " + this.agencia + 
            "\nNúmero da conta:" + this.numeroConta +
            "\nSaldo da conta: R$ " + String.format("%.2f", this.saldo) +
            "\nNome do tiular da conta: " + this.titular.getNome() +
            "\nCPF do tiular da conta: " + this.titular.getCpf() +
            "\nE-mail do tiular da conta: " + this.titular.getEmail() +
            "\nTelefone do tiular da conta: " + this.titular.getTelefone() +
            "\nEndereço do tiular da conta: " + this.titular.getEndereco();
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
