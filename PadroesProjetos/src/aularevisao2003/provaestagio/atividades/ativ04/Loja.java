package aularevisao2003.provaestagio.atividades.ativ04;

public class Loja {

    private double porcentagemIPI;
    private Produto peca1;
    private Produto peca2;
    public Loja(double porcentagemIPI, int codigoP1, double valorP1, int quantP1,
                int codigoP2, double valorP2, int quantP2){
        this.porcentagemIPI = porcentagemIPI;
        this.peca1 = new Produto(codigoP1, valorP1, quantP1);
        this.peca2 = new Produto(codigoP2, valorP2, quantP2);
    }

    public double calcularValorTotal(){
        return (this.peca1.getValor()*this.peca1.getQuantidade()
                + this.peca2.getValor()*this.peca2.getQuantidade())*((this.porcentagemIPI/100)+1);
    }
}
