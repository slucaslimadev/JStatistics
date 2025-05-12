import javax.swing.JOptionPane;


public class App {
    public static void main(String[] args) throws Exception {
       // 8. Média da área dos jardins - Calcula a média de N áreas.
       int n = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite a quantidade de Áreas que você Deseja calcular"));
       double someAreas = 0;
       double Area = 0;
       for (int i = 1; i<= n; i++){
        Area = Double.parseDouble(JOptionPane.showInputDialog("Digite a Área do seu jardim: "+ i));
        someAreas+=Area;


    }
    // 9. Contar quantos jardins são grandes - Conta os jardins com área > 100m2.
    double mediaArea = someAreas / n;
    JOptionPane.showMessageDialog(null, "\nA média da área dos " + n + " jardins é: " + mediaArea);
    if(Area > 100){
        JOptionPane.showMessageDialog(null,"\nVocê tem: "+ n + " jardins com área maior que 100 m²");

    } 
    else{
        JOptionPane.showMessageDialog(null,"\nVocê tem: "+ n + " jardins com área menor que 100 m²");
    }
}
}