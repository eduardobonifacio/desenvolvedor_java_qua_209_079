package com.polimorfismo.app;
import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {
        Scanner ler = new Scanner(System.in);
        Pessoa seiLa = new Pessoa(null, null, null);
        PessoaFisica usuario = new PessoaFisica(null, null, null, null, null, null);
        PessoaJuridica empresa = new PessoaJuridica(null, null, null, null, null, null);
        
        System.out.println(usuario.cumprimentar);   







        
        System.out.println(usuario.cumprimentar);
        System.out.println(empresa.cumprimentar);

        ler.close();
    }
}
