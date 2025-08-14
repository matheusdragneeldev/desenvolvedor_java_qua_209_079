package com.quatropilares.app;

import java.util.Scanner;

import com.quatropilares.model.PessoaFisica;
import com.quatropilares.model.PessoaJuridica;

public class App {
    public static void main(String[] args) throws Exception {
        
        // Classes
        Scanner leia = new Scanner(System.in);
        PessoaFisica usuario = new PessoaFisica(null, null, null, null, null, null);
        PessoaJuridica empresa = new PessoaJuridica(null, null, null, null, null, null);

        // Input usuario
        System.out.println("\nDADOS DO USUÁRIO");
        System.out.println("Digite seu nome:");
        usuario.setNome(leia.nextLine());
        System.out.println("Data de nasciento:");
        usuario.setDataNascimento(leia.nextLine());
        System.out.println("CPF:");
        usuario.setCpf(leia.nextLine());
        System.out.println("Email:");
        usuario.setEmail(leia.nextLine());
        System.out.println("Telefone:");
        usuario.setTelefone(leia.nextLine());
        System.out.println("Endereço:");
        usuario.setEndereco(leia.nextLine());

        // Input empresa
        System.out.println("\nDADOS DA EMPRESA");
        System.out.println("Digite o nome da empresa:");
        empresa.setNomeFantasia(leia.nextLine());
        System.out.println("Razão social:");
        empresa.setRazaoSocial(leia.nextLine());
        System.out.println("CNPJ:");
        empresa.setCnpj(leia.nextLine());
        System.out.println("Email:");
        empresa.setEmail(leia.nextLine());
        System.out.println("Telefone:");
        empresa.setTelefone(leia.nextLine());
        System.out.println("Endereço:");
        empresa.setEndereco(leia.nextLine());

        // Output usuario
        System.out.println("\nOlá meu nome é " + usuario.getNome() + ", moro atualmente em " + usuario.getEndereco() 
        + ", nasci em " + usuario.getDataNascimento() + " e meu cpf é " + usuario.getCpf() + ". Me encontre pelo email " 
        + usuario.getEmail() + " ou entre em contato pelo telefone " + usuario.getTelefone() + ".");

        // Output empresa
        System.out.println("\nOlá somos da empresa " + empresa.getNomeFantasia() + " nossa razão social é " + empresa.getRazaoSocial()
        + " com CNPJ " + empresa.getCnpj() + ". Entre em contato pelo email " + empresa.getEmail() + " ou pelo telefone "
        + empresa.getTelefone() + ". Nossa empresa está localizada no endereço " + empresa.getEndereco() + ".");

        // Fecha Scanner
        leia.close();

    }

}
