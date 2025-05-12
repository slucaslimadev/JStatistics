public class AplicarDesconto {
    // Atributos 
    private double valor;
    private double desconto;
    private String servico;
    private double apDesconto;



    public void setValor(Double valor){
        this.valor = valor;
    }
    public void setDesconto(Double desconto){
        this.desconto = desconto;

    }
    public void setServico(String servico){
        this.servico = servico;

    }
    public Double getValor(){
        return valor;
    }
    public Double getDesconto(){
        return desconto;
    }
    public String getServico(){
        return servico;
    }
    public double aplicarDesconto() {
        if (valor > 1500) {
            return valor * (1 - desconto);
        } else {
            return valor; // Nenhum desconto aplicado se o valor não for maior que 1500
        }

}
}