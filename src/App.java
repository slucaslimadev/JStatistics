import javax.swing.JOptionPane;
public class App {
    public static void main(String[] args) throws Exception {
        // if 
        // if else
        // switch
        // ternário
        int op = Integer.parseInt(JOptionPane.showInputDialog("Qual o resaultado de uma população?\n1- Parâmetro\n2- Estatística"));
        if(op == 1){
            JOptionPane.showMessageDialog(null,"Acertou!, Você escolheu a opção:"+op);
        }else{
            JOptionPane.showMessageDialog(null, "Errou!, Você escolheu a opção:"+op,"JStatistics",JOptionPane.ERROR_MESSAGE);
        }
        // EXERCICIOS
        /*
        CONSIDERANDO OS NÚMEROS 30, 50, 80, 90 DIGITE O VALOR DA MÉDIA ARITMETICA SIMPLES?
        CONSIDERANDO OS VALORES 10, 40, 50, 80, 10. DIGITE QUAL É A MODA?
        QUAL A MEDIDA DE TENDÊNCIA CENTRAL QUE MOSTRA O CENTRO DA AMOSTRA? 
         */
        /* EXERCICIO 1  */ 
        Double media = Double.parseDouble(JOptionPane.showInputDialog("Considerando os números: 30, 50, 80, 90.\nDigite o valor da Média Aritmética simples!"));
        if(media == 62.5){
            JOptionPane.showMessageDialog(null, "Resposta correta!");
        }else{
            JOptionPane.showMessageDialog(null, "Resposta errada!");
        }
        /* EXERCICIO 2 */ 
        int moda = Integer.parseInt(JOptionPane.showInputDialog("Considerando os números: 10, 40, 50, 80, 10.\nDigite qual é a moda!"));
        if(moda == 10){
            JOptionPane.showMessageDialog(null, "Resposta correta!");
        }else{
            JOptionPane.showMessageDialog(null, "Resposta errada!");
        }
        /* EXERCICIO 3  */ 
        String mediana = (JOptionPane.showInputDialog("Qual a medida de tendência central que mostra o centro da amostra?"));
        if(mediana.equalsIgnoreCase("mediana")){
            JOptionPane.showMessageDialog(null, "Resposta correta!");
        }else {
            JOptionPane.showMessageDialog(null, "Resposta incorreta!");
        }

        }
        }
    
