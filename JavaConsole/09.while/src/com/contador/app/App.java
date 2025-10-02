package com.contador.app;

import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner ler = new Scanner(System.in);

        int numero;


        System.out.println("Escolha um numero inteiro: ");
        numero = ler.nextInt();

        while (numero > 0) {
            System.out.println(numero);
            numero--;
        }

        ler.close();
    }
}
