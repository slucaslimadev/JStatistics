import javax.swing.JOptionPane;
import java.util.Scanner;


public class App {
    public static void main(String[] args) throws Exception {
    // Exercicio 2: Cadastro simples de cliente - Entrada e exibição do nome e endereço.
    String nome;
    String endereco;
    JOptionPane.showMessageDialog(null, "Jardim Verde: Sistema de controle de Jardinagem");
    JOptionPane.showMessageDialog(null, "Cadastro de cliente");
    nome = JOptionPane.showInputDialog("Digite seu nome: ");
    endereco = JOptionPane.showInputDialog("Digite seu endereço: ");
    JOptionPane.showMessageDialog(null, "Dados cadastrados:\nNome: "+nome+"\nEndereço: "+endereco, "Jardim Verde", JOptionPane.DEFAULT_OPTION);


    }
}
