package com.atividade06.model;

public class Pessoa {
    private String proprietario, cpf, telefone;


    public Pessoa(String proprietario, String cpf, String telefone) {
        this.proprietario = proprietario;
        this.cpf = cpf;
        this.telefone = telefone;
    }

    public String getProprietario() {
        return this.proprietario;
    }

    public void setProprietario(String proprietario) {
        this.proprietario = proprietario;
    }

    public String getCpf() {
        return this.cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getTelefone() {
        return this.telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }
   
}
