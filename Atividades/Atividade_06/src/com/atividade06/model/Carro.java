package com.atividade06.model;

public class Carro {

    // Atributos
    private String modelo;
    private String fabricante;
    private String ano;
    private String cor;
    private String placa;
    private Pessoa proprietario;

    // Construtor
    public Carro(String modelo, String fabricante, String ano, String cor, String placa, Pessoa proprietario) {
        this.modelo = modelo;
        this.fabricante = fabricante;
        this.ano = ano;
        this.cor = cor;
        this.placa = placa;
        this.proprietario = proprietario;
    }
    
    // Getters & Setters
    public String getModelo() {
        return this.modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getFabricante() {
        return this.fabricante;
    }

    public void setFabricante(String fabricante) {
        this.fabricante = fabricante;
    }

    public String getAno() {
        return this.ano;
    }

    public void setAno(String ano) {
        this.ano = ano;
    }

    public String getCor() {
        return this.cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public String getPlaca() {
        return this.placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public Pessoa getProprietario() {
        return this.proprietario;
    }

    public void setProprietario(Pessoa proprietario) {
        this.proprietario = proprietario;
    }

    // Metodo
    public String exibirDados() {
        return "\nModelo: " + this.getModelo() + 
            "\nFabricante: " + this.getFabricante() + 
            "\nAno: " + this.getAno() + 
            "\nCor: " + this.getAno() + 
            "\nPlaca: " + this.placa;
    }
    
}
