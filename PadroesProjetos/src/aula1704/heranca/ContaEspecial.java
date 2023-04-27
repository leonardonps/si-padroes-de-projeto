package aula1704.heranca;

public class ContaEspecial extends Conta {
    private double limite;

    public boolean sacar(double valor){
        this.setSaldo(this.getSaldo() - (valor*0.90));

        return true;
    }

    public double getLimite() {
        return limite;
    }

    public void setLimite(double limite) {
        this.limite = limite;
    }
}
