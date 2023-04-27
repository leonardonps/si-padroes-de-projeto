package aula1704.heranca;

public class Conta {

    private int numero;
    private double saldo;

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public boolean sacar(double valor){
        this.saldo = this.saldo - valor;
        return true;
    }
    public boolean depositar(double valor){
        this.saldo = this.saldo + valor;
        return true;
    }

    public double getSaldo(){
        return this.saldo;
    }
}
