import javax.swing.JOptionPane;


public class App {
    public static void main(String[] args) throws Exception {
        //Nível 4 - Vetores Básicos
       // 10. Armazenar áreas em vetor - Armazena e exibe áreas.
       int n = Integer.parseInt(JOptionPane.showInputDialog("Digite o número de Áreas: "));
       double[] areas = new double[n];
         for (int i = 0; i < n; i++) {
              areas[i] = Double.parseDouble(JOptionPane.showInputDialog("Digite a área " + (i + 1) + ": "));
              
         }
         JOptionPane.showMessageDialog(null, "Vetores: "+java.util.Arrays.toString(areas));
        // 11. Moda das áreas - Calcula o valor mais frequente.
        double moda = areas[0];
        JOptionPane.showMessageDialog(null, "A moda é: " + moda);



}
}
