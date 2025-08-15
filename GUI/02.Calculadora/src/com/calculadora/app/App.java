package com.calculadora.app;

import javax.swing.JOptionPane;

import com.calculadora.controller.Calculadora;

public class App {
    public static void main(String[] args) throws Exception {
        Calculadora calculadora = new Calculadora(0,0);
        String[] opcoes = {"somar", "subtrair", "multiplicar", "dividir", "sair"};
        Object opcao;

        do {
            opcao = JOptionPane.showInputDialog(
                null,
                "Selecione uma opção ok: ",
                "Calculadora",
                JOptionPane.QUESTION_MESSAGE,
                null,
                opcoes, 
                opcoes[0]);

                if (opcao != "sair") {
                    calculadora.setX(Double.parseDouble(JOptionPane.showInputDialog(null, "Informe o valor de X")));
                    calculadora.setY(Double.parseDouble(JOptionPane.showInputDialog(null, "Informe o valor de Y")));
                }

                if (opcao == "somar") {
                    JOptionPane.showMessageDialog(
                        null
                        , "A soma dos seus numeros é " + calculadora.somar(calculadora.getX(), calculadora.getY()),
                         "soma",
                         JOptionPane.INFORMATION_MESSAGE
                         );
                }
                else if (opcao == "subtrair") {
                    JOptionPane.showMessageDialog(null,
                     "A subtração dos seus numeros é " + calculadora.subtrair(calculadora.getX(), calculadora.getY()),
                      "soma",
                      JOptionPane.INFORMATION_MESSAGE
                      );
                }
                else if (opcao == "multiplicar") {
                    JOptionPane.showMessageDialog(null,
                     "A multiplicação dos seus numeros é " + calculadora.multiplicar(calculadora.getX(), calculadora.getY()),
                      "soma",
                      JOptionPane.INFORMATION_MESSAGE
                      );
                }
                else if (opcao == "dividir") {
                    JOptionPane.showMessageDialog(null,
                     "A divisão dos seus numeros é " + calculadora.dividir(calculadora.getX(), calculadora.getY()),
                      "soma",
                      JOptionPane.INFORMATION_MESSAGE
                      );
                }
        } while(opcao != "sair");
    }
}
