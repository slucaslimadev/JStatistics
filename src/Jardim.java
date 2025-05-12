import javax.swing.JOptionPane;

public class Jardim {
    public static void main(String[] args) throws Exception {
        // 17. Classe Jardim com método calcularÁrea() - Retorna a área.
        calcularArea area = new calcularArea();
        double largura = Double.parseDouble(JOptionPane.showInputDialog("Digite a Largura: "));
        double comprimento = Double.parseDouble(JOptionPane.showInputDialog("Digite o comprimento: "));
        

        area.setLargura(largura);
        area.setComprimento(comprimento);

        double resultado = (largura * comprimento);

        JOptionPane.showMessageDialog(null, "\nLargura infomada: "+area.getLargura()+"\nComprimento informado: "+area.getComprimento()+"\nÁrea: "+resultado);

    }
}