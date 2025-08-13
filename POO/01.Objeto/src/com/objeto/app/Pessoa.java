package com.objeto.app;

public class Pessoa {

    // atributos
    public String nome;
    public int idade;
    public double altura;

    public Pessoa() {
    }

    public Pessoa(String nome, int idade, double altura) {
        this.nome = nome;
        this.altura = altura;
        this.idade = idade;
    }


    // metodo
    public void exibirDados() {
        System.out.println("Nome " + this.nome);
        System.out.println("Idade " + this.idade);
        System.out.println("Altura " + this.altura + " metros.");
    }

    public String cumprimentar() {
        return "Olá, meu nome é " + this.nome + " , tenho " + this.idade + " anos e tenho " + this.altura + " de altura.";
    }
}
