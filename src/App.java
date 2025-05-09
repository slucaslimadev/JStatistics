import javax.swing.JOptionPane;
import java.util.Scanner;


public class App {
    public static void main(String[] args) throws Exception {
    // Exercicio 3: Área do jardim - Calcula a área a partir da largura e comprimento.
    JOptionPane.showMessageDialog(null, "Calculadora de Área");
    Double largura = Double.parseDouble(JOptionPane.showInputDialog("Digite a largura:"));
    Double comprimento = Double.parseDouble(JOptionPane.showInputDialog("Digite o comprimento:"));
    Double calcArea = (largura * comprimento);
    JOptionPane.showMessageDialog(null, "Largura: "+largura+"\nComprimento: "+comprimento+"\nCalculo da Área: "+calcArea);

    // Nível 2 - Estrutura de Seleção
    //Verificar tamanho do jardim - Classifica como Grande ou Pequeno.

    if(calcArea <= 20){
        JOptionPane.showMessageDialog(null, "Jardim cadastrado é Pequeno");
    }else {
        JOptionPane.showMessageDialog(null, "Jardim cadastrado é grande");
    }


    }
}
