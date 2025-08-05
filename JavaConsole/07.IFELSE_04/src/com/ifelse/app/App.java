package com.ifelse.app;
import java.util.Scanner;


public class App {
    public static void main(String[] args) throws Exception {
        Scanner ler = new Scanner(System.in);
        String nome;
        int idade;

        System.out.println("Qual o seu nome " );
        nome = ler.nextLine();
        System.out.println("Qual sua idade ");
        idade = ler.nextInt();

        System.out.println(nome + ((idade >= 18) ? " e maior de idade." : " é menor de idade."));

        ler.close();
    }
}
