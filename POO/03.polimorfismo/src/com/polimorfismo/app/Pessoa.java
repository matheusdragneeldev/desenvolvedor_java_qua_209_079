package com.polimorfismo.app;

public abstract class Pessoa {

    // Atributos
    public String email;
    public String telefone;
    public String endereco;

    // Construtor
    public Pessoa(String email, String telefone, String endereco) {
        this.email = email;
        this.telefone = telefone;
        this.endereco = endereco;
    }

    public String cumprimentar() {
        return null;
    }

}
