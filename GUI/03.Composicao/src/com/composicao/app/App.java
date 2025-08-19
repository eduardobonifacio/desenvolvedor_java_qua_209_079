package com.composicao.app;

import javax.swing.JOptionPane;

import com.composicao.model.Conta;
import com.composicao.model.Pessoa;

public class App {
    public static void main(String[] args) throws Exception {
        Pessoa usuario = new Pessoa(null, null, null, null, null);
        Conta cc = new Conta("1234-5", "12345-6", 0, usuario);
        String[] opcoes = {"Exibir dados", "Fazer deposito", "Fazer saque",  "Sair"};
        Object opcao;

        usuario.setNome(JOptionPane.showInputDialog("Qual o seu nome "));
        usuario.setCpf(JOptionPane.showInputDialog("Qual o seu cpf "));
        usuario.setEmail(JOptionPane.showInputDialog("Qual o seu email "));
        usuario.setTelefone(JOptionPane.showInputDialog("Qual o seu telefone "));
        usuario.setEndereco(JOptionPane.showInputDialog("Qual o seu endereço "));

        do {
            opcao = JOptionPane.showInputDialog(null, "Escolha a operação desejada", "Banco", JOptionPane.QUESTION_MESSAGE, null, opcoes, opcoes[0]);
            switch(opcao.toString()) {
                case "Exibir dados" : JOptionPane.showMessageDialog(null, cc.exibirDados(), null, JOptionPane.INFORMATION_MESSAGE); break;
                case "Fazer deposito" : cc.fazerDeposito(Double.parseDouble(JOptionPane.showInputDialog("Quanto você quer depositar em "))); break;
                case "Fazer saque" : cc.fazerSaque(Double.parseDouble(JOptionPane.showInputDialog("Quanto você quer sacar em "))); break;

            }
        } while(opcao != "Sair");
        }
    
}
