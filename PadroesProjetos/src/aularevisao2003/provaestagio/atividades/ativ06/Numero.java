package aularevisao2003.provaestagio.atividades.ativ06;

public class Numero {

    private int numero;
    private int numeroAnterior;
    private int numeroProximo;
    public Numero(int numero){
        this.numero = numero;
    }

    public void calcularAntesDepoisNumero(){
        this.numeroAnterior = this.numero - 1;
        this.numeroProximo = this.numero + 1;
    }

    public void exibirAntesDepoisNumero(){
        System.out.printf("Número: %d\n", this.numero);
        System.out.printf("Número anterior: %d\n", this.numeroAnterior);
        System.out.printf("Próximo número: %d\n", this.numeroProximo);
    }

}
