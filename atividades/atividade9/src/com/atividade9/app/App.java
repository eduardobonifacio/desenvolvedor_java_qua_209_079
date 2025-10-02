import javax.swing.JOptionPane;

import com.atividade9.model.Multa;

public class App {
    public static void main(String[] args) throws Exception {
        Multa multa = new Multa(0, 0, 0);
        String[] opcoes = {"Calcular distancia", "Sair"};
        Object opcao;

        do {
            opcao = JOptionPane.showInputDialog(null, "Gostaria de calcular a distancia", "Calculadora Pedal", JOptionPane.QUESTION_MESSAGE, null, opcoes, opcoes[0]);

            if (opcao != "Sair") {
                multa.setPardal1(Double.parseDouble(JOptionPane.showInputDialog(null, "Qual a distancia do primeiro pardal? (metros)?")));
                multa.setPardal2(Double.parseDouble(JOptionPane.showInputDialog(null, "Qual a distancia do segundo pardal? (metros)?")));
                multa.setTempo(Double.parseDouble(JOptionPane.showInputDialog(null, "Em quanto tempo (minutos)?")));
                
                }

            String isMulta;
            double velocidade = (multa.getPardal2() - multa.getPardal1()) /  (multa.getTempo() / 60)  ;

            if (velocidade <= 80) {
                isMulta = "o carro sera multado" ;
            } else {
                isMulta = "o carro não sera multado";
            }

            JOptionPane.showMessageDialog(null,
             "A velocidade do carro foi de " +  (velocidade / 1000) + "km/h , " + isMulta,
                "Calculadora Velocidade",
               JOptionPane.INFORMATION_MESSAGE);
            
        } while(opcao != "Sair");
    }
}
