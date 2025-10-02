package com.encapsulamento.app;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner ler = new Scanner(System.in);
        Pessoa usuario = new Pessoa();
        
        System.out.println("Informe seu nome");
        usuario.setNome(ler.nextLine());
        System.out.println("Qual a sua idade? ");
        usuario.setIdade(ler.nextInt());

        System.out.println("Nome é " + usuario.getNome());
        System.out.println("Idade é " + usuario.getIdade());

        ler.close();
    }
}
