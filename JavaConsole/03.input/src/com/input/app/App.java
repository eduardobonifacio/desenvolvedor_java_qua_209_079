import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
    Scanner leia = new Scanner(System.in);
    

    String nome;
    String email;
    int idade;

    System.out.println("Informe seu nome ");
    nome = leia.nextLine();
    System.out.println("Informe sua idade ");
    idade = leia.nextInt();
    System.out.println("Informe seu email ");
    leia.nextLine();
    email = leia.nextLine();

    System.out.println("Nome: " + nome + ".");
    System.out.println("Idade: " + idade + ".");
    System.out.println("Email: " + email + ".");

    leia.close();
    }
}
