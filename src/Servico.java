
import javax.swing.JOptionPane;

public class Servico {
    public static void main(String[] args) throws Exception {
        // 18. Classe Serviço com aplicarDesconto() - Retorna valor com desconto.
        AplicarDesconto item1 = new AplicarDesconto();

        item1.setServico("Manutenção de Jardins Residenciais");
        item1.setValor(1600.0); // Valor acima de 1500 para testar o desconto
        item1.setDesconto(0.10); // Exemplo de desconto de 10%
        JOptionPane.showMessageDialog(null, "Serviço: "+item1.getServico()+"\nValor Original: "+item1.getValor()+"\nDesconto: "+ (item1.getDesconto() * 100) + "%" + "\nValor com Desconto: " + item1.aplicarDesconto());

        AplicarDesconto item2 = new AplicarDesconto();
        item2.setServico("Paisagismo e Projetos de Jardim");
        item2.setValor(1200.0); // Valor abaixo de 1500
        item2.setDesconto(0.00); // 
        JOptionPane.showMessageDialog(null, "Serviço: "+item2.getServico()+"\nValor Original: "+item2.getValor()+"\nDesconto: "+ (item2.getDesconto() * 100) + "%" + "\nValor com Desconto: " + item2.aplicarDesconto());
    }
}   