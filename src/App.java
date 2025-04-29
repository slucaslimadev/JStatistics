import java.util.Scanner;

import javax.swing.JOptionPane;
public class App {
    public static void main(String[] args) throws Exception {
        
        // Aplicando Lógica de Programação (Aristoteles e George Boolean)
        Scanner leia = new Scanner(System.in);
        // Variável = espaço reservado na memória do computador / reserve para guardar valores
        // Tipos de variáveis: text, int, boolean
        /*
         * EX-1: CRIE UM ALGORITMO PARA O JSTATISTICS QUE LEIA A OPÇÃO DESEJADA:
         * QUAL O CONJUNTO DE DADOS UTILIZADOS: 1- POPULACIONAL, 2- AMOSTRAL
         * O VALOR RECEBIDO DEVE SER INTEIRO
         */
        JOptionPane.showMessageDialog(null, "O Jogo da Estatística: JStatistics");
        String opcaoDesejado = JOptionPane.showInputDialog(null,"Vamos começar o Jogo?\nEscolha a estratégia:\n1- Populacional\n2- Amostral");
        int opDesejado = Integer.parseInt(opcaoDesejado);
        JOptionPane.showMessageDialog(null, "Você escolheu:"+opDesejado);

        /*
         * EX-2: VOCÊ DEVE CRIAR UM MENU PERGUNTANDO PARA O USUÁRIO:
         * QUAL TIPO DE VARIÁVEL ELE DESEJA CADASTRAR:
         * 1- QUANTITATIVA
         * 2- QUALITATIVA
         * OS MENUS DEVE TER AS QUEBRAS DE LINHA CONFORME O TEXTO ACIMA
         * MOSTRE A OPÇÃO ESCOLHIDA (INT)
         */
        System.out.println("-----------------------------------------");
        String opcaoVariavel = JOptionPane.showInputDialog(null,"Qual tipo de variável você deseja cadastrar?\n1- Quantitativa\n2- Qualitativa");
        int opVariavel = Integer.parseInt(opcaoVariavel);
        JOptionPane.showMessageDialog(null, "Sua escolha foi:"+opVariavel);

    }
}
