package aularevisao2003.provaestagio.atividades.ativ05;

public class Salario {

    private double salario;
    private double salarioMinimo;

    public Salario(double salarioMinimo, double salario){
        this.salarioMinimo = salarioMinimo;
        this.salario = salario;
    }

    public double calcularQuantSalarioMinimo(){
        return this.salario/this.salarioMinimo;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public double getSalarioMinimo() {
        return salarioMinimo;
    }

    public void setSalarioMinimo(double salarioMinimo) {
        this.salarioMinimo = salarioMinimo;
    }
}
