package com.atividade06.app;
/*
 * crie uma aplicação onde o usuario cadastra ses daods pessoais e os dados do seu veicuo pessoal, e o programa exibe os dados do veiulo na tela
 * onde um dos atributos de veiculo é o proprietario, com o conceito de composição
 * 
 * 
 * 
 * 
 */

import javax.swing.JOptionPane;
import com.atividade06.model.*;


public class App {
    public static void main(String[] args) throws Exception {
        Pessoa usuario = new Pessoa(null, null, null);
        Veiculo veiculo = new Veiculo(null, null, null, null, null, null, usuario);
        String[] opcoes = {"Exibir dados do veiculo", "Sair"};
        Object opcao;

       
        veiculo.setFabricante(JOptionPane.showInputDialog("Qual o fabricante do carro "));
        veiculo.setModelo(JOptionPane.showInputDialog("Qual o modelo do carro "));
        veiculo.setPlaca(JOptionPane.showInputDialog(   "Qual a placa do carro "));
        veiculo.setCor(JOptionPane.showInputDialog("Qual a cor do carro "));
        veiculo.setMarca(JOptionPane.showInputDialog("Qual a marca do carro "));
        veiculo.setAno(JOptionPane.showInputDialog("Qual o ano do carro "));
        usuario.setProprietario(JOptionPane.showInputDialog("Qual o nome do proprietario? "));

        do {
            opcao = JOptionPane.showInputDialog(null, "Escolha sua opção", "Cadastro", JOptionPane.QUESTION_MESSAGE, null, opcoes, opcoes[0]);
            switch(opcao.toString()) {
                case "Exibir dados do veiculo" : JOptionPane.showMessageDialog(null, veiculo.exibirDados(), "Cadastro", JOptionPane.INFORMATION_MESSAGE);
            }

        } while (opcao != "Sair");
    }
}
