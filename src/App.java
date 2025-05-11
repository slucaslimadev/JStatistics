import javax.swing.JOptionPane;



public class App {
    public static void main(String[] args) throws Exception {
        // Nível 5 - Funções e Procedimentos (sem OO)
        // 13. Função para calcular área - Função recebe largura e comprimento.
        
        calcularArea area = new calcularArea();
        // Inputs para receber largura e comprimento
        double largura = Double.parseDouble(JOptionPane.showInputDialog("Digite a largura: "));
        double comprimento = Double.parseDouble(JOptionPane.showInputDialog("Digite o comprimento: "));

        // Chama o método setLargura e setComprimento
        area.setLargura(largura);
        area.setComprimento(comprimento);
        // Resultado
        double resultado = (largura * comprimento);
        JOptionPane.showMessageDialog(null, "Largura: " + area.getLargura() + "\nComprimento: " + area.getComprimento() + "\nÁrea: " + resultado);





}
}
