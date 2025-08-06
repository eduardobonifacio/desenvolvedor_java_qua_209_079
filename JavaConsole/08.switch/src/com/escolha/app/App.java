package com.escolha.app;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner ler = new Scanner(System.in);
        int x, y;
        double result;
        String operacao;

        System.out.println("Informe seu primeiro numero: ");
        x = ler.nextInt();
        System.out.println("Informe o segundo numero: ");
        y = ler.nextInt();
        ler.nextLine();

        System.out.println("Informe qual operacao voce quer usar: (somar, multiplicar, dividir, subtrair)");
        operacao = ler.nextLine();
        
        switch (operacao) {
            case "somar": 
                result = x + y;
                System.out.println("O resultado da soma e " + result);
                break;
            case "multiplicar":
                result = x * y;
                System.out.println("O resultado da multiplicacao e " + result);
                break;
            case "dividir":
                result = x / y;
                System.out.println("O resultado da divisao e " + result);
                break;
            case "subtrair":
                result = x - y;
                System.out.println("O resultado da subtracao e " + result);
                break;
            default:
            System.out.println("Esta operacao nao e valida.");

        }

        System.out.println();


        ler.close();
    }
}