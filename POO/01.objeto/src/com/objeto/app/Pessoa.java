package com.objeto.app;

public class Pessoa {

    // Atributos
    public String nome;
    public int idade;
    public double altura;

    // Construtor vazio
    public Pessoa() {
    }

    // Construtor
    public Pessoa(String nome, int idade, double altura) {
        this.nome = nome;
        this.idade = idade;
        this.altura = altura;
    }

    // Metodo
    public void exibirDados() {
        System.out.println("Nome: " + this.nome);
        System.out.println("Idade: " + this.idade);
        System.out.println("Altura: " + this.altura);
    }

    public String cumprimentar() {
        return "Óla meu nome é " + this.nome + ", tenho " + this.idade + " anos, "
        + "e meço " + this.altura + " metros de altura";
    }

}
