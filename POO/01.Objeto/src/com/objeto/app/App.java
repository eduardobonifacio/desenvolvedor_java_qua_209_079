package com.objeto.app;
import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {
        Pessoa user = new Pessoa("", 0, 0.0);
        Scanner ler = new Scanner(System.in);


        System.out.println("Qual o seu nome");
        user.nome = ler.nextLine();
        System.out.println("Qual a sua idade");
        user.idade = ler.nextInt();
        System.out.println("Qual a sua altura");
        user.altura = ler.nextDouble();

        System.out.println(user.cumprimentar());
        user.exibirDados();
        
        ler.close();
    }
}
