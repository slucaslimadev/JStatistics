import javax.swing.JOptionPane;

public class App {
    public static void main(String[] args) throws Exception {
        // Nível 6 - Funções e Procedimentos com OO
        // 16. Classe Cliente com método exibir() - Mostra dados do cliente.
        // Recebendo os dados
        Exibir cliente = new Exibir();
        cliente.setNome(JOptionPane.showInputDialog("Digite seu nome:"));
        cliente.setIdade(Integer.parseInt(JOptionPane.showInputDialog("Digite sua idade:")));
        cliente.setEndereco(JOptionPane.showInputDialog("Digite seu endereço:"));
        cliente.setTelefone(JOptionPane.showInputDialog("Digite seu telefone:"));

        // Retornando os dados
        JOptionPane.showMessageDialog(null, "Nome: "+ cliente.getNome()+"\nIdade: "+ cliente.getIdade()+"\nEndereço: "+cliente.getEndereco()+"\nTelefone: "+ cliente.getTelefone());


    }
}