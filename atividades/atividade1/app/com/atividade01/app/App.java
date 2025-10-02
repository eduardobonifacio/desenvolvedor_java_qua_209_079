    package com.atividade01.app;
    import java.util.Scanner;
    public class App {
        public static void main(String[] args) throws Exception {
            /*
            * crie um programa que receba o nome peso e altura do usuario
            * e calcule o valor do seu imc (indice massa corporal)
            *formula é peso/altura*altura e informe o seu diagnostico
            *na tabla do imc (pesquisar)
            *o programa podera calcular o IMC de varios usuarios
            *e devera ter a opcao de sair do programa 
            */

            Scanner ler = new Scanner(System.in);
            String nome;
            int opcao;
            double peso, altura; 

            do {

                System.out.println("1 - Iniciar programa de calculo de imc?");
                System.out.println("2 - Fechar o programa");
                System.err.println("Faca sua escolha: ");
                opcao = ler.nextInt();

                switch(opcao){
                    case 1:
                    ler.nextLine();
                    System.out.println("Informe seu nome: ");
                    nome = ler.nextLine();
                    System.out.println("Informe sua altura: ");
                    altura = ler.nextDouble();
                    System.out.println("Informe seu peso: ");
                    peso = ler.nextDouble();

                    double imc = peso / (altura * altura);
                    System.out.println("Ola " + nome + ", Seu IMC e " + String.format("%.2f", imc));
                    System.out.print("Voce esta na classificacao ");
                    if (imc < 18.5) {System.out.println("Magreza");}
                    if (imc >= 18.5 && imc <= 24.9){System.out.println("normal");}
                    if (imc >= 25 && imc <= 29.9) {System.out.println("Sobrepeso");}
                    if (imc > 30) {System.out.println("obesidade");}
                    break;
                    case 2:
                    System.out.println("Programa encerrado.");
                    default:
                    System.out.println("Opcao invalida");
                }
                    
                
                
            } while (opcao != 2);
            ler.close();
        }
    }
