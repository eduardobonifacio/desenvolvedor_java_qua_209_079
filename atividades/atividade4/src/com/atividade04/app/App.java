package com.atividade04.app;

import javax.swing.JOptionPane;

import com.atividade04.model.IMC;

 /*
            * crie um programa que receba o nome peso e altura do usuario
            * e calcule o valor do seu imc (indice massa corporal)
            *formula é peso/altura*altura e informe o seu diagnostico
            *na tabla do imc (pesquisar)
            *o programa podera calcular o IMC de varios usuarios
            *e devera ter a opcao de sair do programa 
            */


public class App {
    public static void main(String[] args) throws Exception {
        IMC imc = new IMC(null, 0, 0);
        String[] opcoes = {"Calcular IMC" ,"Sair"};
        Object opcao;
    
        do {
            opcao = JOptionPane.showInputDialog(null, "Gostaria de calcular seu IMC?", "CalculadoraIMC", JOptionPane.QUESTION_MESSAGE, null, opcoes, opcoes[0]);

            if (opcao != "Sair" ) {
                imc.setNome(JOptionPane.showInputDialog(null, "Qual o seu nome?"));
                imc.setPeso(Double.parseDouble(JOptionPane.showInputDialog(null, "Qual o seu peso?").replace(",", ".")));
                imc.setAltura(Double.parseDouble(JOptionPane.showInputDialog(null, "Qual o seu altura?").replace(",", ".")));

            }

            double imcValor = imc.calcularImc(imc.getPeso(), imc.getAltura());


            JOptionPane.showMessageDialog(null,
             "Ola " + imc.getNome() + " seu imc é " + String.format("%.2f", imcValor) +
              " e você esta na categoria " + imc.escala(imcValor),
               "CalculadoraIMC",
                JOptionPane.INFORMATION_MESSAGE);

        } while(opcao != "Sair");
    }
}
