package com.ifelse.app;

import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner ler = new Scanner(System.in);
        String nome;
        int idade;
        
        System.out.println("Informe seu nome: ");
        nome = ler.nextLine();
        System.out.println("Informe sua idade: ");
        idade = ler.nextInt();
        
        System.out.print("Ola " + nome + " sua idade e " + idade + " ,");
        if (idade < 18){
          System.out.print(" voce e menor de idade");
        } else {
            System.out.print(" voce e maior de idade");
        }
        ler.close();
        }



        
}