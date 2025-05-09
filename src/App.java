import javax.swing.JOptionPane;


public class App {
    public static void main(String[] args) throws Exception {
        // Exercicio 6: Desconto por fidelidade - Aplica desconto com base na quantidade de serviços.
        int opcaoServicos;
        int[] quantidadeServicos = new int[7];
        double desconto = 0.0;
        double valorTotal = 0.0;
        double valorTotalComDesconto = 0.0;
        do {
            opcaoServicos = Integer.parseInt(JOptionPane.showInputDialog("Digite o tipo de serviço:\n" +
            "1- Manutenção de Jardins Residenciais\n"+
            "2- Paisagismo e Projetos de Jardim\n"+
            "3- Instalação e Manutenção de Sistemas de Irrigação\n"+
            "4- Cuidado Especial para Plantas e Árvores\n"+
            "5- Criação e Manutenção de Hortas\n"+
            "6- Controle de Pragas e Doenças\n"+
            "0- Sair\n"));

            // Calcula a quantidade total de serviços
            int totalServicos = 0;
            for (int i = 1; i < quantidadeServicos.length; i++) {
                totalServicos += quantidadeServicos[i];
            }
                    
            // Aplica o desconto
            if (totalServicos > 3) {
                desconto = 0.10; // 10% de desconto para mais de 3 serviços
            } else if (totalServicos > 1) {
                desconto = 0.05; // 5% de desconto para mais de 1 serviço
            }
            valorTotalComDesconto = valorTotal - (valorTotal * desconto);
            switch (opcaoServicos) {
                case 1:
                valorTotal = 100.0;
                JOptionPane.showMessageDialog(null, "Valor do serviço: "+valorTotal+"\nNesse serviço você terá:\nCorte de grama\n" + //
                "Poda de árvores e arbustos;\n" + //
                "Remoção de ervas daninhas;\n" + //
                "Limpeza de jardim;n" + //
                "Recolhimento de folhas secas;\n" + //
                "Adubação de solo e plantio;");

                quantidadeServicos[1]++;
                break;
    
                case 2:
                valorTotal = 150.0;
                JOptionPane.showMessageDialog(null,"Valor do serviço:"+valorTotal+"\nNesse serviço você terá:\n"+
                "Design e planejamento de jardins personalizados;\n" + //
                "Instalação de jardins de inverno, verticais ou suspensos;\n" + //
                "Criação de hortas urbanas ou jardins comestíveis;\n" + //
                "Escolha de plantas e flores para diferentes estações;\n" + //
                "Colocação de pedras ornamentais, fontes e iluminação externa;");
                quantidadeServicos[2]++;
                break;
                
                case 3:
                valorTotal = 200.0;
                JOptionPane.showMessageDialog(null,"Valor do serviço:"+valorTotal+ "\nNesse serviço você terá:\n"+
                "Instalação de sistemas de irrigação automática (aspersores, gotejamento, etc.);\r\n" + //
                "Manutenção e reparo de sistemas de irrigação já existentes;\r\n" + //
                "Consultoria sobre o melhor sistema de irrigação para o tipo de planta ou área;");
                quantidadeServicos[3]++;
                break;
    
                case 4:
                valorTotal = 250.0;
                JOptionPane.showMessageDialog(null, "Valor do serviço: "+valorTotal+"\nNesse serviço você terá:\n"+
                "Controle de pragas e doenças com produtos naturais ou químicos\n" + //
                "Consultoria para o cuidado de plantas específicas (ex: orquídeas, suculentas)\n" + //
                "Transplante de árvores e plantas");
                quantidadeServicos[4]++;
                break;
    
                case 5:
                valorTotal = 300.0;
                JOptionPane.showMessageDialog(null,"Valor do serviço: "+valorTotal+ "\nNesse serviço você terá:\n"+
                "Planejamento e instalação de hortas em pequenos espaços (varandas, quintais);\r\n" + //
                "Aconselhamento sobre cultivo de vegetais e ervas;\r\n" + //
                "Manutenção periódica de hortas caseiras;");
                quantidadeServicos[5]++;
                break;
    
                case 6:
                valorTotal = 350.0;
                JOptionPane.showMessageDialog(null,"Valor do serviço: "+valorTotal+ "\nNesse serviço você terá:\n"+
                "Consultoria sobre controle de pragas e uso de pesticidas orgânicos\n" + //
                "Limpeza e sanitização de áreas infectadas\n" + //
                "Diagnóstico de doenças nas plantas");
                quantidadeServicos[6]++;
                break;

                case 0:
                int sair = Integer.parseInt(JOptionPane.showInputDialog(null, "Realmente deseja sair?\nDigite:\n1- Sim\n2- Não"));
                if (sair == 1) {
                    JOptionPane.showMessageDialog(null, "Saindo do sistema...");
                    JOptionPane.showMessageDialog(null, "Resumo da Compra:\n" +
                    "Valor Total: " + valorTotal + "\n" +
                    "Desconto Aplicado: " + (desconto * 100) + "%\n" +
                    "Valor Total com Desconto: " + valorTotalComDesconto);
                    opcaoServicos = 0; 
                } else {
                    opcaoServicos = 2; 
                }
                break;


                default:
                JOptionPane.showMessageDialog(null, "Opção invalida!");
                break;


        }


        } while (opcaoServicos != 0);


    }
}
