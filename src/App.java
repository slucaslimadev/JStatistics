import javax.swing.JOptionPane;

public class App {
    public static void main(String[] args) throws Exception {
        // Classe é um conjunto de objetos
        // Nosso objetivo é entender a diferença entre método void, método string
        // Vaca
        Mamifero m1 = new Mamifero();
        m1.setNomeCientifico("Bos taurus");
        JOptionPane.showMessageDialog(null,"Nome Cientifico: "+m1.getNomeCientifico());
        //Considerando a utilização de metodos set e get
        //Desafio
        // Crie mais dois objetos: Armanezar e mostrar os dados: canguru, peixe boi
        // Canguru
        Mamifero m2 = new Mamifero();
        m2.setNomeCientifico("Macropus");
        JOptionPane.showMessageDialog(null, "Nome Cientifico: "+m2.getNomeCientifico());
        // Peixe boi
        Mamifero m3 = new Mamifero();
        m3.setNomeCientifico("Trichechus");
        JOptionPane.showMessageDialog(null, "Nome Cientifico: "+m3.getNomeCientifico());

    }
}
