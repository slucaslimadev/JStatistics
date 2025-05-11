import javax.swing.JOptionPane;



public class App {
    public static void main(String[] args) throws Exception {
        //14. Procedimento para exibir dados do cliente - Exibe dados com JOptionPane
        exibirCliente cliente = new exibirCliente();
        cliente.setNome(JOptionPane.showInputDialog("Digite o nome:"));
        cliente.setIdade(Integer.parseInt(JOptionPane.showInputDialog("Digite a idade:")));
        cliente.setCpf(JOptionPane.showInputDialog("Digite o CPF:"));
        cliente.setEndereco(JOptionPane.showInputDialog("Digite o endereço:"));
        cliente.setTelefone(JOptionPane.showInputDialog("Digite o telefone:"));
        cliente.setEmail(JOptionPane.showInputDialog("Digite o email:"));
        JOptionPane.showMessageDialog(null, "Nome: "+cliente.getNome()+"\nIdade: "+cliente.getIdade()+"\nCPF: "+cliente.getCpf()+"\nEndereço: "+cliente.getEndereco()+"\nTelefone: "+cliente.getTelefone()+"\nEmail: "+cliente.getEmail(), "Dados do Cliente", JOptionPane.INFORMATION_MESSAGE);


}
}
