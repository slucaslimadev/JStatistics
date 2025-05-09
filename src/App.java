import javax.swing.JOptionPane;
import java.util.Scanner;


public class App {
    public static void main(String[] args) throws Exception {
        // Exercicio 5: Classificar tipo de serviço - Usa switch/case para exibir descrição.
        int opcaoServicos = Integer.parseInt(JOptionPane.showInputDialog("Digite o tipo de serviço:\n" +
        "1- Manutenção de Jardins Residenciais\n"+
        "2- Paisagismo e Projetos de Jardim\n"+
        "3- Instalação e Manutenção de Sistemas de Irrigação\n"+
        "4- Cuidado Especial para Plantas e Árvores\n"+
        "5- Criação e Manutenção de Hortas\n"+
        "6- Controle de Pragas e Doenças\n"));
        switch (opcaoServicos) {
            case 1:
            JOptionPane.showMessageDialog(null, "Nesse serviço você terá:\nCorte de grama\n" + //
            "Poda de árvores e arbustos;\n" + //
            "Remoção de ervas daninhas;\n" + //
            "Limpeza de jardim;n" + //
            "Recolhimento de folhas secas;\n" + //
            "Adubação de solo e plantio;");
            break;

            case 2:
            JOptionPane.showMessageDialog(null, "Nesse serviço você terá:\n"+
            "Design e planejamento de jardins personalizados;\n" + //
            "Instalação de jardins de inverno, verticais ou suspensos;\n" + //
            "Criação de hortas urbanas ou jardins comestíveis;\n" + //
            "Escolha de plantas e flores para diferentes estações;\n" + //
            "Colocação de pedras ornamentais, fontes e iluminação externa;");
            break;
            
            case 3:
            JOptionPane.showMessageDialog(null, "Nesse serviço você terá:\n"+
            "Instalação de sistemas de irrigação automática (aspersores, gotejamento, etc.);\r\n" + //
            "Manutenção e reparo de sistemas de irrigação já existentes;\r\n" + //
            "Consultoria sobre o melhor sistema de irrigação para o tipo de planta ou área;");
            break;

            case 4:
            JOptionPane.showMessageDialog(null, "Nesse serviço você terá:\n"+
            "Controle de pragas e doenças com produtos naturais ou químicos\n" + //
            "Consultoria para o cuidado de plantas específicas (ex: orquídeas, suculentas)\n" + //
            "Transplante de árvores e plantas");
            break;

            case 5:
            JOptionPane.showMessageDialog(null, "Nesse serviço você terá:\n"+
            "Planejamento e instalação de hortas em pequenos espaços (varandas, quintais);\r\n" + //
            "Aconselhamento sobre cultivo de vegetais e ervas;\r\n" + //
            "Manutenção periódica de hortas caseiras;");
            break;

            case 6:
            JOptionPane.showMessageDialog(null, "Nesse serviço você terá:\n"+
            "Consultoria sobre controle de pragas e uso de pesticidas orgânicos\n" + //
            "Limpeza e sanitização de áreas infectadas\n" + //
            "Diagnóstico de doenças nas plantas");
            break;
            
            default:
            JOptionPane.showMessageDialog(null, "Opção invalida!");
            break;
        }
    }
}
