import javax.swing.JOptionPane;
import javax.swing.JComboBox;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Estatistica {
    public static void main(String[] args) throws Exception {

        // 19. Estatísticas descritivas - Calcula média, moda, mediana, máximo e mínimo.
        String[] opcoes = {"Selecione uma opção:", "Média", "Moda", "Mediana", "Máximo", "Mínimo"};
        JComboBox<String> comboBox = new JComboBox<>(opcoes);
        comboBox.setSelectedIndex(0);
        int resultado = JOptionPane.showConfirmDialog(
                null,
                comboBox,
                "Estatística",
                JOptionPane.OK_CANCEL_OPTION,
                JOptionPane.QUESTION_MESSAGE
        );
        if (resultado == JOptionPane.OK_OPTION) {
            String opcaoSelecionada = (String) comboBox.getSelectedItem();
            System.out.println("Opção selecionada: " + opcaoSelecionada);

            if (opcaoSelecionada.equals("Média")) {
                String inputMedia = JOptionPane.showInputDialog("Digite os números separados por vírgula:");
                if (inputMedia != null && !inputMedia.trim().isEmpty()) {
                    String[] numerosStr = inputMedia.split(",");
                    double[] valoresInseridos = new double[numerosStr.length];
                    double somaValores = 0;
                    for (int i = 0; i < numerosStr.length; i++) {
                        valoresInseridos[i] = Double.parseDouble(numerosStr[i].trim());
                        somaValores += valoresInseridos[i];
                    }
                    double media = somaValores / valoresInseridos.length;
                    JOptionPane.showMessageDialog(null, "Números inseridos: " + Arrays.toString(valoresInseridos) + "\nA Média é: " + media);
                }
            }

            if (opcaoSelecionada.equals("Moda")) {
                String inputModa = JOptionPane.showInputDialog("Digite os números separados por vírgula:");
                if (inputModa != null && !inputModa.trim().isEmpty()) {
                    String[] numerosStr = inputModa.split(",");
                    double[] valoresInseridos = new double[numerosStr.length];
                    for (int i = 0; i < numerosStr.length; i++) {
                        valoresInseridos[i] = Double.parseDouble(numerosStr[i].trim());
                    }
                    if (valoresInseridos.length > 0) {
                        double moda = calcularModa(valoresInseridos);
                        JOptionPane.showMessageDialog(null, "Números inseridos: " + Arrays.toString(valoresInseridos) + "\nA Moda é: " + moda);
                    }
                }
            }

            if (opcaoSelecionada.equals("Mediana")) {
                String inputMediana = JOptionPane.showInputDialog("Digite os números separados por vírgula:");
                if (inputMediana != null && !inputMediana.trim().isEmpty()) {
                    String[] numerosStr = inputMediana.split(",");
                    double[] valoresInseridos = new double[numerosStr.length];
                    for (int i = 0; i < numerosStr.length; i++) {
                        valoresInseridos[i] = Double.parseDouble(numerosStr[i].trim());
                    }
                    if (valoresInseridos.length > 0) {
                        double mediana = calcularMediana(valoresInseridos);
                        JOptionPane.showMessageDialog(null, "Números inseridos: " + Arrays.toString(valoresInseridos) + "\nA Mediana é: " + mediana);
                    }
                }
            }

            if (opcaoSelecionada.equals("Máximo")) {
                String inputMaximo = JOptionPane.showInputDialog("Digite os números separados por vírgula:");
                if (inputMaximo != null && !inputMaximo.trim().isEmpty()) {
                    String[] numerosStr = inputMaximo.split(",");
                    double[] valoresInseridos = new double[numerosStr.length];
                    for (int i = 0; i < numerosStr.length; i++) {
                        valoresInseridos[i] = Double.parseDouble(numerosStr[i].trim());
                    }
                    if (valoresInseridos.length > 0) {
                        double maximo = calcularMaximo(valoresInseridos);
                        JOptionPane.showMessageDialog(null, "Números inseridos: " + Arrays.toString(valoresInseridos) + "\nO Máximo é: " + maximo);
                    }
                }
            }

            if (opcaoSelecionada.equals("Mínimo")) {
                String inputMinimo = JOptionPane.showInputDialog("Digite os números separados por vírgula:");
                if (inputMinimo != null && !inputMinimo.trim().isEmpty()) {
                    String[] numerosStr = inputMinimo.split(",");
                    double[] valoresInseridos = new double[numerosStr.length];
                    for (int i = 0; i < numerosStr.length; i++) {
                        valoresInseridos[i] = Double.parseDouble(numerosStr[i].trim());
                    }
                    if (valoresInseridos.length > 0) {
                        double minimo = calcularMinimo(valoresInseridos);
                        JOptionPane.showMessageDialog(null, "Números inseridos: " + Arrays.toString(valoresInseridos) + "\nO Mínimo é: " + minimo);
                    }
                }
            }

        } else {
            System.out.println("Seleção cancelada.");
        }
    }

    public static double calcularModa(double[] dados) {
        Map<Double, Integer> frequencia = new HashMap<>();
        for (double numero : dados) {
            frequencia.put(numero, frequencia.getOrDefault(numero, 0) + 1);
        }

        double moda = Double.NaN;
        int maxFrequencia = 0;

        for (Map.Entry<Double, Integer> entry : frequencia.entrySet()) {
            if (entry.getValue() > maxFrequencia) {
                maxFrequencia = entry.getValue();
                moda = entry.getKey();
            }
        }
        return moda;
    }

    public static double calcularMediana(double[] dados) {
        Arrays.sort(dados);
        int meio = dados.length / 2;
        if (dados.length % 2 == 0) {
            return (dados[meio - 1] + dados[meio]) / 2.0;
        } else {
            return dados[meio];
        }
    }

    public static double calcularMaximo(double[] dados) {
        double maximo = Double.NEGATIVE_INFINITY;
        for (double numero : dados) {
            if (numero > maximo) {
                maximo = numero;
            }
        }
        return maximo;
    }

    public static double calcularMinimo(double[] dados) {
        double minimo = Double.POSITIVE_INFINITY;
        for (double numero : dados) {
            if (numero < minimo) {
                minimo = numero;
            }
        }
        return minimo;
    }
}