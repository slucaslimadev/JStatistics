import javax.swing.JOptionPane;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Aula 03 - Switch e Loops");
        int op;
        do {
            op = Integer.parseInt(JOptionPane.showInputDialog("Digite a opção:\n1- Estatística Descritiva\n2- Probabilidade\n3- Modelos probabilístico\n4- Sair"));
            switch (op) {
                case 1:
                    JOptionPane.showMessageDialog(null, "Estatística Descritiva");
                    break;

                case 2:
                    JOptionPane.showMessageDialog(null, "Probabilidade");
                    break;

                case 3:
                    JOptionPane.showMessageDialog(null, "Modelos Probabilísticos");
                    break;

                case 4:
                    int sair = Integer.parseInt(JOptionPane.showInputDialog(null, "Realmente deseja sair?Digite:\n1- Sim\n2- Não"));
                    if (sair == 1) {
                        JOptionPane.showMessageDialog(null, "Saindo do sistema...");
                        op = 4; 
                    } else {
                        op = 0; 
                    }
                    break;

                default:
                    JOptionPane.showMessageDialog(null, "Opção Inválida!");
                    break;
            }
        } while (op != 4);
    }
}