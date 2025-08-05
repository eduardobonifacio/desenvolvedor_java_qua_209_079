

import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {
        Scanner ler = new Scanner(System.in);
        String nome;
        int idade;
        double altura;

        System.out.println("Qual seu nome: ");
        nome = ler.nextLine();
        System.out.println("Qual sua idade: ");
        idade = ler.nextInt();
        System.out.println("Qual a sua altura (ex: 1.80): ");
        altura = ler.nextDouble();


        System.out.print("Ola " + nome);
        if ((altura >= 1.40) && (idade >= 12)) {
          System.out.print(", voce esta apto a entrar");
        } else if (((altura < 1.40) && (idade < 12))) {
          System.out.println(", voce nao tem altura nem idade suficiente");
        } else if (altura < 1.40) {
          System.out.print(", voce nao tem altura suficiente");
        } else if (idade < 12 ) {
          System.out.print(", voce e muito novo");
        } 

        ler.close();
      }        
}