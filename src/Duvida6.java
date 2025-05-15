import javax.swing.JOptionPane;

public class Duvida6 {
    //Desconto por fidelidade - Aplica desconto com base na quantidade de serviços.
 
    //Contador
    // CONSTANTE
    public static final int FIDELIDADE = 10; 
    public static final double DESCONTO = 0.10;
    public static void main(String args[]){
        
        JOptionPane.showMessageDialog(null, "Iniciando compra");
        
        int contador = 0;
        double acumulador = 0;
        int opcao;
        do{
            opcao = Integer.parseInt(JOptionPane.showInputDialog(null, "Serviços:\n1- Poda (150.00)\n 2- Cortar grama (250.00)\n 3- Sair"));
            if(opcao == 1){
                acumulador=acumulador+150;
                contador = contador + 1;
            }else if(opcao ==2 ){
                acumulador=acumulador+250;
                contador = contador +1;
            }

        }while(opcao != 3);
        JOptionPane.showMessageDialog(null, "Total da compra:" + acumulador + "\n Quantidade de serviços selecionados:" + contador);
        if(contador >= FIDELIDADE){
            double valorDesconto = acumulador - (acumulador * DESCONTO);
            JOptionPane.showMessageDialog(null, "Valor total: "+ acumulador+ "\n Valor com desconto: "+valorDesconto);
        }

    }
}
