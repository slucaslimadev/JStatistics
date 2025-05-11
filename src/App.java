import java.util.Arrays;
import javax.swing.JOptionPane;


public class App {
    public static void main(String[] args) throws Exception {
        // 12. Ordenar serviços por valor - Ordena vetor de valores.
        int numServicos = Integer.parseInt(JOptionPane.showInputDialog("Digite o número de serviços:"));
        // Arrays
        double[] valores = new double[numServicos];
        for(int i=0; i < numServicos; i++){
            valores[i] = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor do serviço " + (i+1) + ":"));
        }

        Arrays.sort(valores);
        JOptionPane.showMessageDialog(null, "Valores ordenados: " + Arrays.toString(valores));


    }



}

