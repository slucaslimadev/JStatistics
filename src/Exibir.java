public class Exibir {
    private String nome;
    private int idade;
    private String endereco;
    private String telefone;
    
    // Armazenando valores 
    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    // Retornando valores
    public String getNome(){
        return nome;
    }
    public int getIdade(){
        return idade;
    }
    public String getEndereco(){
        return endereco;
    }
    public String getTelefone(){
        return telefone;
    }
}
