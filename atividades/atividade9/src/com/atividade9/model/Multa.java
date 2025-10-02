package com.atividade9.model;

public class Multa {
    public double tempo;
    public double pardal1;
    public double pardal2;


    public Multa(double tempo, double pardal1, double pardal2) {
        this.tempo = tempo;
        this.pardal1 = pardal1;
        this.pardal2 = pardal2;
    }

    public double getTempo() {
        return this.tempo;
    }

    public void setTempo(double tempo) {
        this.tempo = tempo;
    }

    public double getPardal1() {
        return this.pardal1;
    }

    public void setPardal1(double pardal1) {
        this.pardal1 = pardal1;
    }

    public double getPardal2() {
        return this.pardal2;
    }

    public void setPardal2(double pardal2) {
        this.pardal2 = pardal2;
    }


    
}
