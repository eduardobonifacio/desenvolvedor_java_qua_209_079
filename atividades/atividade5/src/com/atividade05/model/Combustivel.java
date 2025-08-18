package com.atividade05.model;

public class Combustivel {
    public double etanol;
    public double gasolina;


    public Combustivel(double etanol, double gasolina) {
        this.etanol = etanol;
        this.gasolina = gasolina;
    }

    public double getEtanol() {
        return this.etanol;
    }

    public void setEtanol(double etanol) {
        this.etanol = etanol;
    }

    public double getGasolina() {
        return this.gasolina;
    }

    public void setGasolina(double gasolina) {
        this.gasolina = gasolina;
    }

    public String melhorCombustivel(double etanol, double gasolina) {
        if (this.etanol < (this.gasolina * (70/100))) {
            return "etanol";
        } else {return "gasolina";}
    }
}
