
import javax.swing.JOptionPane;

public class Estatistica {
    public static void main(String[] args) throws Exception {
        // Nível 7 - Relatórios e Gráficos
        // Estatísticas descritivas - Calcula média, moda, mediana, máximo e mínimo.

        // Calcular média 
        JOptionPane.showMessageDialog(null, "Calculando Média");
        int n = Integer.parseInt(JOptionPane.showInputDialog("Digite a quantidade de números: "));
        
        for(int i = 0; i < n; i++){
            Double.parseDouble(JOptionPane.showInputDialog("Digite o valor: "+ (i + 1)));
        }


        
    }
}   