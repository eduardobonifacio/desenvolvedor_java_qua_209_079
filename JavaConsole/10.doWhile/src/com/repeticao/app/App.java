import java.util.Scanner;

public class App {
    
    public static void main(String[] args) throws Exception {
        Scanner ler = new Scanner(System.in);

        String nome;
        int idade, opcao;
        double altura;

        do {
            System.out.println("1 - Registrar");
            System.out.println("2 - Fechar programa");
            System.out.println("Informe sua opcao");
            opcao = ler.nextInt();

            if (opcao == 1) {
                ler.nextLine();
                System.out.println("Informe o nome: ");
                nome = ler.nextLine();
                System.out.println("Informe sua idade: ");
                idade = ler.nextInt();
                System.out.println("Informe sua altura: ");
                altura = ler.nextDouble();
                
                if (idade >= 12 && altura >= 1.15) {
                    System.out.println(nome + " esta autorizado a entrar.");
                } else if (idade < 12 && altura < 1.15) {
                    System.out.println("Sua idade e altura sao menores do que o esperado2");
                } else if (idade < 12 ) {
                    System.out.println("Sua idade e menor do que o permitido");
                } else if (altura < 1.15) {
                    System.out.println("Sua altura e menor que o permitido");
                }
            }

            else if (opcao != 2) {System.out.println("operacao invalida");}
        } while (opcao != 2); 

        ler.close();
    }
}
