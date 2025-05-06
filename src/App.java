import javax.swing.JOptionPane;
import java.util.Random;
public class App {
    public static void main(String[] args) throws Exception {
        // DESAFIO CARA OU COROA 
        // VARIÁVEL QUE RECEBA A INTERAÇÃO DO JOGO
        // RANDOM
        // SWITH
        // FOR, DO WHILE E WHILE
        String[] espacoAmostral = {"Cara","Coroa"};

        // Random
        Random random = new Random();

        // Contadores
        int contCara = 0;
        int contCoroa = 0;
        String mensagem = "Espaço amostral:{Cara, Coroa}\n"+
                            "Probabilidade de Cara:50%\n"+
                            "Probabilidade de Coroa:50%\n"+
                            "Deseja lançar a moeda??";
        
        //LOOP
        while(true){
            int opcao = JOptionPane.showConfirmDialog(null, mensagem, "Lançando moedas", JOptionPane.YES_NO_OPTION);
            if(opcao != JOptionPane.YES_OPTION){
                String estatisticas = "Jogo finalizado!\n"+ "Total de lançamentos:"+(contCara+contCoroa)+"\n Total Caras:"+contCara+"\n Total Coroas:"+contCoroa;
                JOptionPane.showMessageDialog(null, estatisticas, "Finalizando jogo", JOptionPane.INFORMATION_MESSAGE);
                break;
            }
            int resultado = random.nextInt(2);
            if(resultado == 0){
                contCara++;
            }else{
                contCoroa++;
            }
            String saida= "Resultado do lançamento: "+espacoAmostral[resultado]+"\nIndice gerado: "+resultado;
            JOptionPane.showMessageDialog(null, saida, "Resultado", JOptionPane.INFORMATION_MESSAGE);
        }
        }
    }

