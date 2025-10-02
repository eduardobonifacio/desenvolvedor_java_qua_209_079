package com.atividade04.model;

public class IMC implements IIMC{
     private String nome;
     private double peso;
     private double altura;



    public IMC(String nome, double peso, double altura) {
        this.nome = nome;
        this.peso = peso;
        this.altura = altura;
    }

    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getPeso() {
        return this.peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public double getAltura() {
        return this.altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    @Override
    public double calcularImc(double peso, double altura) {
        return peso / (altura * altura);
    }

    @Override
    public String escala(double calcularImc) {
        return(calcularImc < 18.5) ? "magreza" 
        : (calcularImc <= 24.9) ? "normal" 
        : (calcularImc <= 29.9) ? "sobrepeso" 
        : "obesidade" ;
        }

}
