package com.heranca.app;

import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        
        // Instanciando classes
        PessoaFisica usuario = new PessoaFisica();
        PessoaJuridica empresa = new PessoaJuridica();
        Scanner leia = new Scanner(System.in);

        // Input usuario
        System.out.println("\nINFORME OS DADOS DO USUÁRIO");
        System.out.println("Nome de usuário: ");
        usuario.nome = leia.nextLine();
        System.out.println("CPF: ");
        usuario.cpf = leia.nextLine();
        System.out.println("Telefone: ");
        usuario.Telefone = leia.nextLine();
        System.out.println("Email: ");
        usuario.email = leia.nextLine();
        System.out.println("Endereço: ");
        usuario.endereco = leia.nextLine();

        // Input empresa
        System.out.println("\nINFORME OS DADOS DA EMPRESA");
        System.out.println("Razão social da empresa: ");
        empresa.razaoSocial = leia.nextLine();
        System.out.println("Nome fantasia: ");
        empresa.nomeFantasia = leia.nextLine();
        System.out.println("CNPJ: ");
        empresa.cnpj = leia.nextLine();
        System.out.println("Email: ");
        empresa.email = leia.nextLine();
        System.out.println("Telefone: ");
        empresa.Telefone = leia.nextLine();
        System.out.println("Endereço: ");
        empresa.endereco = leia.nextLine();

        usuario.cumprimentar();

        // Output usuario
        System.out.println("\nEXIBINDO DADOS DO USUÁRIO");
        System.out.println("Nome: " + usuario.nome);
        System.out.println("CPF: " + usuario.cpf);
        System.out.println("Telefone: " + usuario.Telefone);
        System.out.println("Email: " + usuario.email);
        System.out.println("Endereço: " + usuario.endereco);

        // Output empresa
        System.out.println("\nEXIBINDO DADOS DA EMPRESA");
        System.out.println("Razão social: " + empresa.razaoSocial);
        System.out.println("Nome fantasia: " + empresa.nomeFantasia);
        System.out.println("CNPJ: " + empresa.cnpj);
        System.out.println("Email: " + empresa.email);
        System.out.println("Telefone: " + empresa.Telefone);
        System.out.println("Endereço: " + empresa.endereco);

        // Fechando Scanner
        leia.close();
    }

}
