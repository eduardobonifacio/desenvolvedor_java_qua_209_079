package com.amberalert.app.models;

import java.io.Serializable;
import java.sql.Date;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;


@Entity
public class Pessoa implements Serializable{
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long idPessoa;
    private String nome;
    private int idade;
    private int altura;
    private String local_desaparecimento;
    private String observacoes;
    @Temporal(TemporalType.DATE)
    private Date data_desaparecimento;
    private String emailResponsavel;
    private String telefoneResponsavel;
    private String redesResponsavel;

    public Pessoa() {
    }

    
    public long getIdPessoa() {
        return idPessoa;
    }

    public void setIdPessoa(long idPessoa) {
        this.idPessoa = idPessoa;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public int getAltura() {
        return altura;
    }

    public void setAltura(int altura) {
        this.altura = altura;
    }

    public String getLocal_desaparecimento() {
        return local_desaparecimento;
    }

    public void setLocal_desaparecimento(String local_desaparecimento) {
        this.local_desaparecimento = local_desaparecimento;
    }

    public String getObservacoes() {
        return observacoes;
    }

    public void setObservacoes(String observacoes) {
        this.observacoes = observacoes;
    }

    public Date getData_desaparecimento() {
        return data_desaparecimento;
    }

    public void setData_desaparecimento(Date data_desaparecimento) {
        this.data_desaparecimento = data_desaparecimento;
    }

    public String getEmailResponsavel() {
        return emailResponsavel;
    }

    public void setEmailResponsavel(String emailResponsavel) {
        this.emailResponsavel = emailResponsavel;
    }

    public String getTelefoneResponsavel() {
        return telefoneResponsavel;
    }

    public void setTelefoneResponsavel(String telefoneResponsavel) {
        this.telefoneResponsavel = telefoneResponsavel;
    }

    public String getRedesResponsavel() {
        return redesResponsavel;
    }

    public void setRedesResponsavel(String redesResponsavel) {
        this.redesResponsavel = redesResponsavel;
    }
}
