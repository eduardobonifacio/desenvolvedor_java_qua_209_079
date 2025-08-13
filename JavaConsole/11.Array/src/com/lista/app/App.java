package com.lista.app;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner ler = new Scanner(System.in);
        String[] nomes = new String[10];

        for (int i = 0; i < nomes.length; i++) {
            System.out.println("Informe o " + (i + 1 ) + " nome");
            nomes[i] = ler.nextLine();

        }

        for (String nome : nomes){
            System.out.println(nome);
        }
        ler .close();
    }
}
