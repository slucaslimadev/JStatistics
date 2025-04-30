import java.util.Scanner;

import javax.swing.JOptionPane;
public class App {
    public static void main(String[] args) throws Exception {
        
        // Aplicando Lógica de Programação (Aristoteles e George Boolean)
        
        // Variável = espaço reservado na memória do computador / reserve para guardar valores
        // Tipos de variáveis: text, int, boolean
        /*
         * EX-1: CRIE UM ALGORITMO PARA O JSTATISTICS QUE LEIA A OPÇÃO DESEJADA:
         * QUAL O CONJUNTO DE DADOS UTILIZADOS: 1- POPULACIONAL, 2- AMOSTRAL
         * O VALOR RECEBIDO DEVE SER INTEIRO
         */
        /*Scanner leia = new Scanner(System.in);
        int opcao; //declarei a variável em Java.
        System.out.println("\t #------- \t #------ \t JStatistics \t #----- \t #------ \t ");
        System.out.println("Qual o conjunto de dados utilizado: 1- populacional 2-amostral");
        opcao = leia.nextInt();
        System.out.println(opcao);*/
        int opcao;
        JOptionPane.showMessageDialog(null, "O Jogo da Estatística: JStatistics");
        opcao = Integer.parseInt(JOptionPane.showInputDialog("Vamos começar o Jogo? \n Escolha a estratégia: \n 1- Populacional \n 2- Amostral"));
        JOptionPane.showMessageDialog(null, "Você escolheu: "+opcao,"JStatistics",JOptionPane.DEFAULT_OPTION);

        /*
         * EX-2: VOCÊ DEVE CRIAR UM MENU PERGUNTANDO PARA O USUÁRIO:
         * QUAL TIPO DE VARIÁVEL ELE DESEJA CADASTRAR:
         * 1- QUANTITATIVA
         * 2- QUALITATIVA
         * OS MENUS DEVE TER AS QUEBRAS DE LINHA CONFORME O TEXTO ACIMA
         * MOSTRE A OPÇÃO ESCOLHIDA (INT)
         */
        String opcaoVariavel = JOptionPane.showInputDialog(null,
        "Que tipo de variável ele deseja cadastrar:\n 1- Quantitativa \n 2- Qualitativa");
        int opVariavel = Integer.parseInt(opcaoVariavel);
        JOptionPane.showMessageDialog(null,"Você escolhe: "+opVariavel,"JStatistics",JOptionPane.INFORMATION_MESSAGE);

    }
}
