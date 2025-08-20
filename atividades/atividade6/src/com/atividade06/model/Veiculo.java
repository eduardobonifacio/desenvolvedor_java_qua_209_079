package com.atividade06.model;

import com.atividade06.interfaces.IDados;

public class Veiculo implements IDados {
    private String fabricante, modelo, placa, cor, marca, ano;
    private Pessoa proprietario;

    public Veiculo(String fabricante, String modelo, String placa, String cor, String marca, String ano, Pessoa proprietario) {
        this.fabricante = fabricante;
        this.modelo = modelo;
        this.placa = placa;
        this.cor = cor;
        this.marca = marca;
        this.ano = ano;
        this.proprietario = proprietario;
    }

    public String getFabricante() {
        return this.fabricante;
    }

    public void setFabricante(String fabricante) {
        this.fabricante = fabricante;
    }

    public String getModelo() {
        return this.modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getPlaca() {
        return this.placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public String getCor() {
        return this.cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public String getMarca() {
        return this.marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getAno() {
        return this.ano;
    }

    public void setAno(String ano) {
        this.ano = ano;
    }

    public Pessoa getProprietario() {
        return this.proprietario;
    }

    public void setProprietario(Pessoa proprietario) {
        this.proprietario = proprietario;
    }

    @Override
    public String exibirDados() {
       return "Fabricante " + this.fabricante +   
        "\n Modelo " + this.modelo +
        "\n Placa " + this.placa + 
        "\n Cor " + this.cor + 
        "\n Marca " + this.marca +  
        "\n Ano " + this.ano + 
        "\n Proprietario " + this.proprietario.getProprietario();
    }

    
}