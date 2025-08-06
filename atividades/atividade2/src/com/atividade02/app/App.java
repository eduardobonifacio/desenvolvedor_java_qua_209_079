    package com.atividade02.app;
    import java.util.Scanner;

    /*crie uma aplicacao usuario informa nome e idade, programa exibe 5 salas de cinema cada filme com classificacao indicativa,
    usuario escolhe sala se tiver idade programa fala e encerra, caso nao tenha ele proibe e pede pra escolher outro
    */


    public class App {
        public static void main(String[] args) throws Exception {
            Scanner ler = new Scanner(System.in);
            String nome;
            int idade, opcao;

            System.out.println("Qual seu nome? ");
            nome = ler.nextLine();
            System.out.println("Qual sua idade? ");
            idade = ler.nextInt();

            do{
            System.out.println("Ola " + nome + ", Esta passando 5 filmes no cinema.");
                System.out.println("Opcao 1 - Terror, classificacao indicativa de 18 anos");
                System.out.println("Opcao 2 - Acao, classificacao indicativa de 16 anos");
                System.out.println("Opcao 3 - Infantil, classificacao livre");
                System.out.println("Opcao 4 - Comedia, classificacao indicativa de 12 anos");
                System.out.println("Opcao 5 - Musical, classificacao de 14 anos");
                System.out.println("Opcao 6 - Nenhuma, sair");
                System.out.println("Por favor, informe o numero da sala do filme que voce gostaria de assistir");
                opcao = ler.nextInt(); 

                switch(opcao) {
                    case 1:
                        if (idade < 18) {System.out.println("Voce nao tem idade suficiente para ver este filme, escolha outro"); break; }
                        else {System.out.println("Voce assistiu ao filme e teve um bom tempo."); System.exit(0);}
                    case 2:
                        if (idade < 16) {System.out.println("Voce nao tem idade suficiente para ver este filme, escolha outro"); break;}
                        else {System.out.println("Voce assistiu ao filme e teve um bom tempo."); System.exit(0);}
                    case 3:
                        System.out.println("Voce assistiu ao filme e teve um bom tempo.");
                        System.exit(0); 
                    case 4:
                        if (idade < 12) {System.out.println("Voce nao tem idade suficiente para ver este filme, escolha outro"); break;}
                        else {System.out.println("Voce assistiu ao filme e teve um bom tempo."); System.exit(0);}
                    case 5:
                        if (idade < 14) {System.out.println("Voce nao tem idade suficiente para ver este filme, escolha outro"); break;}
                        else {System.out.println("Voce assistiu ao filme e teve um bom tempo."); System.exit(0);}
                    case 6:
                        System.out.println("Ate a proxima.");

                }
            } while(opcao != 6);

        

            ler.close();
            }
        }
