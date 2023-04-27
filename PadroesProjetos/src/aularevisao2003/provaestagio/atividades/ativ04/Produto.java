package aularevisao2003.provaestagio.atividades.ativ04;

public class Produto {
    private int codigo;
    private double valor;
    private int quantidade;

    public Produto(int codigo, double valor, int quantidade){
        this.codigo = codigo;
        this.valor = valor;
        this.quantidade = quantidade;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }
}
