import javax.swing.JOptionPane;
import java.util.Random;

public class JogoDados {
    public static void main(String[] args) {
        // Desafio Jogo de Dados
        // Variável para receber a interação do jogo
        // Random
        // Switch
        // For, Do While e While

        // Número de lados do dado
        int numLados = 6;
        String[] ladosDoDado = new String[numLados];
        for (int i = 0; i < numLados; i++) {
            ladosDoDado[i] = "Lado " + (i + 1);
        }

        // Random
        Random random = new Random();

        // Contadores
        int totalLancamentos = 0;
        int[] contagemLados = new int[numLados]; // Para contar quantas vezes cada lado cai
        String mensagem = "Bem-vindo ao Jogo de Dados!\n" +
                "Espaço Amostral: {Lado 1, Lado 2, Lado 3, Lado 4, Lado 5, Lado 6}\n" +
                "Probabilidade de cada lado: " + (100.0 / numLados) + "%\n" +
                "Deseja lançar o dado?";

        // Loop
        while (true) {
            int opcao = JOptionPane.showConfirmDialog(null, mensagem, "Lançando Dados", JOptionPane.YES_NO_OPTION);
            if (opcao != JOptionPane.YES_OPTION) {
                StringBuilder estatisticas = new StringBuilder("Jogo finalizado!\n");
                estatisticas.append("Total de lançamentos: ").append(totalLancamentos).append("\n");

                for (int i = 0; i < numLados; i++) {
                    estatisticas.append("Total ").append(ladosDoDado[i]).append(": ").append(contagemLados[i]).append("\n");
                }
                JOptionPane.showMessageDialog(null, estatisticas.toString(), "Finalizando Jogo", JOptionPane.INFORMATION_MESSAGE);
                break;
            }

            int resultado = random.nextInt(numLados); // Gera um número de 0 a 5
            contagemLados[resultado]++;
            totalLancamentos++;

            String saida = "Resultado do lançamento: " + ladosDoDado[resultado] + "\nÍndice gerado: " + resultado;
            JOptionPane.showMessageDialog(null, saida, "Resultado", JOptionPane.INFORMATION_MESSAGE);
        }
    }
}
