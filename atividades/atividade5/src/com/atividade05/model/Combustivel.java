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
        if (etanol <= (gasolina * 0.7)) {
            return "etanol";
        } else {return "gasolina";}
    }
}
