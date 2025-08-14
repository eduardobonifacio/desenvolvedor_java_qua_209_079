package com.quatropilares.app;
import java.util.Scanner;

import com.quatropilares.model.PessoaFisica;
import com.quatropilares.model.PessoaJuridica;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner ler = new Scanner(System.in);
        PessoaFisica usuario = new PessoaFisica("","","","","","");
        PessoaJuridica empresa = new PessoaJuridica("","","","","","");

        System.out.println("Informe os dados do usuario: ");
        System.out.println("Informe o nome:");
        usuario.setNome((ler.nextLine()));
        System.out.println("Informe o CPF: ");
        usuario.setCpf((ler.nextLine()));
        System.out.println("Informe a data de nascimento: ");
        usuario.setDataNascimento((ler.nextLine()));
        System.out.println("Informe o e-mail: ");
        usuario.setEmail((ler.nextLine()));
        System.out.println("Informe o telefone: ");
        usuario.setTelefone((ler.nextLine()));
        System.out.println("Informe o endereço: ");
        usuario.setEndereco((ler.nextLine()));

        System.out.println("Informe os dados da empresa: ");
        System.out.println("Informe a Razão Social: ");
        empresa.setRazaoSocial(ler.nextLine());
        System.out.println("Informe o nome da empresa: ");
        empresa.setRazaoSocial(ler.nextLine());
        System.out.println("Informe o CNPJ");
        empresa.setRazaoSocial(ler.nextLine());
        System.out.println("Informe o e-mail da empresa: ");
        empresa.setRazaoSocial(ler.nextLine());
        System.out.println("Informe o telefone da empresa: ");
        empresa.setRazaoSocial(ler.nextLine());
        System.out.println("Informe o endereço da empresa: ");
        empresa.setRazaoSocial(ler.nextLine());

        System.out.println("Informações do usuario: ");
        System.out.println("Nome " + usuario.getNome());
        System.out.println("CPF " + usuario.getCpf());
        System.out.println("Data de nascimento " + usuario.getDataNascimento());
        System.out.println("E-mail " + usuario.getEmail());
        System.out.println("Telefone " + usuario.getTelefone());
        System.out.println("Endereço " + usuario.getEndereco());

        System.out.println("Informações da empresa");
        System.out.println("Razão social " + empresa.getRazaoSocial());
        System.out.println("Nome da empresa " + empresa.getNomeFantasia());
        System.out.println("CNPJ: " + empresa.getCnpj());
        System.out.println("E-mail da empresa " + empresa.getEmail());
        System.out.println("Telefone da empresa" + empresa.getTelefone());
        System.out.println("Endereço da empresa" + empresa.getEndereco());

        ler.close();
    }
}
