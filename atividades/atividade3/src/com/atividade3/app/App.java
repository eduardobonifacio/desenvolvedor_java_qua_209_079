package com.atividade3.app;
import java.util.Scanner;

/* Crie um programa com uma classe chamada Conta, com os seguintes atributos:
 * Titular da conta
 * CPF do titular
 * Agencia
 * Numero da conta
 * Saldo
 * ------------------
 * O usuario devera inforamr o nome do titular e o cpf, e o programa exibe um menu com as seguinte operações:
 * -Exibir dados da conta
 * -Fazer saque
 * -Deposito
 * -Sair do programa

 */ 
public class App {
    public static void main(String[] args) throws Exception {
        // instanciar classes
        Scanner leia = new Scanner(System.in);
        Conta cc = new Conta(null, null, "10101-1", "101010-1", 0.0);
       
        int opcao;
        double valor;

        System.out.println("informe o nome do titular da conta: ");
        cc.titular = leia.nextLine();
        System.out.println("informe o CPF do titular da conta: ");
        cc.cpf = leia.nextLine();

        do {
            // menu
            System.out.println("Banco Java");
            System.out.println("1- Exibir dados da conta");
            System.out.println("2- Fazer depósito");
            System.out.println("3- Fazer saque");
            System.out.println("4- Sair do programa");
            opcao = leia.nextInt();

            switch (opcao) {
                case 1:
                    cc.exibirDados();
                    break;
                case 2:
                    System.out.print("Valor do saque: R$ ");
                    valor =  leia.nextDouble();
                    System.out.println((valor > 0 )?"deposito efetuado com sucessor. Saldo: R$ "+cc.fazerDeposito(valor):"valor do depósito inválido");
                    break;
                case 3:
                    System.out.println("Informe o valor do saque em R$ ");
                    valor =  leia.nextDouble();
                    System.out.println((valor>0 && valor <= cc.saldo)? "saque efetuado com sucesso. Saldo: R$ "+cc.fazerSaque(valor):"valor do sque inválido");
                    break;
                case 4:
                    System.out.println("Encerrando o programa...");
                    break;
                default:
                    System.out.println("Opção inválida!");
            }

        } while (opcao!=4);




        leia.close();
    }
}