package com.polimorfismo.app;

import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        
        // Instanciando classes
        Scanner leia = new Scanner(System.in);
        PessoaFisica usuario = new PessoaFisica(null, null, null, null, null, null);
        PessoaJuridica empresa = new PessoaJuridica(null,null,null,null,null,null);

        // Input do usuario
        System.out.println("\nDADOS DO USUÁRIO");
        System.out.println("Digite o nome do usuário:");
        usuario.nome = leia.nextLine();
        System.out.println("CPF:");
        usuario.cpf = leia.nextLine();
        System.out.println("Data de nascimento:");
        usuario.dataNascimento = leia.nextLine();
        System.out.println("Email:");
        usuario.email = leia.nextLine();
        System.out.println("Telefone:");
        usuario.telefone = leia.nextLine();
        System.out.println("Endereço:");
        usuario.endereco = leia.nextLine();

         // Input do usuario
        System.out.println("\nDADOS DA EMPRESA");
        System.out.println("Digite a razão social da empresa:");
        empresa.razaoSocial = leia.nextLine();
        System.out.println("Nome da empresa:");
        empresa.nomeFantasia = leia.nextLine();
        System.out.println("CNPJ:");
        empresa.cnpj = leia.nextLine();
        System.out.println("Email:");
        empresa.email = leia.nextLine();
        System.out.println("Telefone:");
        empresa.telefone = leia.nextLine();
        System.out.println("Endereço:");
        empresa.endereco = leia.nextLine();
    
        // Metodos
        System.out.println(usuario.cumprimentar());
        System.out.println(empresa.cumprimentar());

        // Fechando Scanner
        leia.close();
    }

}
