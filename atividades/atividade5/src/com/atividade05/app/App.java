package com.atividade05.app;

import javax.swing.JOptionPane;
    /*
     * crie um app para verificar qua melhor combustivel para um carro flex abastecer
     * compensa mais abastecer etanol caso o valor ele seja ate 70% da gasolina
     * 
     * 
     * 
     * 
     * 
     */

import com.atividade05.model.*;
public class App {
    public static void main(String[] args) throws Exception {
        Combustivel combustivel = new Combustivel(0.0,0.0);
        String[] opcoes = {"Calcular relevancia", "Sair"};
        Object opcao;

        do {
            opcao = JOptionPane.showInputDialog(null,
            "Gostaria de calcular a relevancia do etanol e gasolina",
            "CalculadoraEtanol",
            JOptionPane.QUESTION_MESSAGE,
            null,
            opcoes,
            opcoes[0]);


            if (opcao != "Sair") {
                combustivel.setEtanol(Double.parseDouble(JOptionPane.showInputDialog(null, "Qual o preço do seu etanol?").replace(",", ".")));
                combustivel.setGasolina(Double.parseDouble(JOptionPane.showInputDialog(null, "Qual o preço da sua gasolina?").replace(",", ".")));
            }

            
            JOptionPane.showMessageDialog(null,
                "Compensa mais pegar " + combustivel.melhorCombustivel(combustivel.getEtanol(), combustivel.getGasolina()),
                "Qual compensa mais",
                JOptionPane.INFORMATION_MESSAGE);
        } while (opcao != "Sair");
    }
}
