import javax.swing.JOptionPane;

public class CalculaMedia {

    public static double calcularMedia(int[] vetor) {
        // 15. Função para calcular média - Recebe vetor e retorna média.
        int soma = 0;
        for (int numero : vetor) {
            soma += numero;
        }
        return (double) soma / vetor.length;
    }

    public static void main(String[] args) {
        String tamanhoStr = JOptionPane.showInputDialog(null, "Digite o tamanho do vetor:", "Entrada", JOptionPane.QUESTION_MESSAGE);
        int tamanho = Integer.parseInt(tamanhoStr);

        int[] vetorUsuario = new int[tamanho];

        for (int i = 0; i < tamanho; i++) {
            String elementoStr = JOptionPane.showInputDialog(null, "Digite o elemento " + (i + 1) + ":", "Entrada", JOptionPane.QUESTION_MESSAGE);
            vetorUsuario[i] = Integer.parseInt(elementoStr);
        }

        double media = calcularMedia(vetorUsuario);
        JOptionPane.showMessageDialog(null, "A média dos elementos do vetor é: " + media, "Resultado", JOptionPane.INFORMATION_MESSAGE);

        System.exit(0);
    }
}