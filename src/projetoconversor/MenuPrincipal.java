package projetoconversor;
import javax.swing.*;

public class MenuPrincipal {
    public void exibirMenu() {
    	int continuar;
        do {   
    	String[] opcoes = {"Conversor de moedas", "Conversor de Temperatura"};
        String escolha = (String) JOptionPane.showInputDialog(null,
                "Escolha uma opção de conversão:",
                "Conversor",
                JOptionPane.QUESTION_MESSAGE,
                null,
                opcoes,
                opcoes[0]);
        

        if (escolha.equals("Conversor de moedas")) {
            ConversorDeMoedas conversor = new ConversorDeMoedas();

            // Solicita ao usuário o valor a ser convertido
            String valorInput = JOptionPane.showInputDialog("Digite o valor em Reais para converter:");
            while (!valorInput.matches("^\\d+(\\.\\d{1,2})?$")) {
                JOptionPane.showMessageDialog(null, "Valor inválido. Insira um valor numérico válido.");
                valorInput = JOptionPane.showInputDialog("Digite o valor em Reais para converter:");
            }
            
            
            double valorEmReais = Double.parseDouble(valorInput);
            
            

            // Solicita ao usuário a moeda de destino
            String[] moedas = {"Dólares", "Euros", "Libras Esterlinas", "Pesos Argentinos", "Pesos Chilenos"};
            String moedaDestino = (String) JOptionPane.showInputDialog(null,
                    "Escolha a moeda de destino:",
                    "Conversor de Moedas",
                    JOptionPane.QUESTION_MESSAGE,
                    null,
                    moedas,
                    moedas[0]);

            double valorConvertido = 0;
            switch (moedaDestino) {
                case "Dólares":
                    valorConvertido = conversor.converterReaisParaDolar(valorEmReais);
                    break;
                case "Euros":
                    valorConvertido = conversor.converterReaisParaEuro(valorEmReais);
                    break;
                case "Libras Esterlinas":
                    valorConvertido = conversor.converterReaisParaLibraEsterlina(valorEmReais);
                    break;
                case "Pesos Argentinos":
                    valorConvertido = conversor.converterReaisParaPesoArgentino(valorEmReais);
                    break;
                case "Pesos Chilenos":
                    valorConvertido = conversor.converterReaisParaPesoChileno(valorEmReais);
                    break;
            }

            JOptionPane.showMessageDialog(null, "Valor convertido: " + valorConvertido + " " + moedaDestino);
        }
        // Adicione a lógica para o conversor de temperatura ou outras opções aqui
        continuar = JOptionPane.showConfirmDialog(null,
                "Deseja continuar?",
                "Continuar?",
                JOptionPane.YES_NO_CANCEL_OPTION,
                JOptionPane.QUESTION_MESSAGE);

        if (continuar == JOptionPane.NO_OPTION) {
            JOptionPane.showMessageDialog(null, "Programa finalizado");
        } else if (continuar == JOptionPane.CANCEL_OPTION) {
            JOptionPane.showMessageDialog(null, "Programa concluído");
        }
    } while (continuar == JOptionPane.YES_OPTION);
}
    }

