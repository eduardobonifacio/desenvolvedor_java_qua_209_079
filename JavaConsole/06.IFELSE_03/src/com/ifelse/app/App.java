package com.ifelse.app;
import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {
        Scanner ler = new Scanner(System.in);

        String aluno;
        double nota;

        System.out.println("Qual o nome do aluno? ");
        aluno = ler.nextLine();
        System.out.println("Qual a nota do aluno? ");
        nota = ler.nextDouble();

        System.out.println("A nota do aluno: " + aluno + ", foi de " + nota);

        if (nota >= 7) {
            System.out.println("Voce passou de ano c:");
        } else if (nota >= 5) {
            System.out.println("Voce esta de recuperação");
        } else {
            System.out.println("Você reprovou :c");
        }

        ler.close();
    }
}
