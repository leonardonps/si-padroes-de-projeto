package aularevisao2003.provaestagio.atividades.ativ03;

public class Salario {

    private double atualSalario;
    private double novoSalario;

    public Salario(double atualSalario){
        this.atualSalario = atualSalario;
    }
    public double reajustar(){
        return this.novoSalario = this.atualSalario*1.01;
    }

    public double getAtualSalario() {
        return atualSalario;
    }

    public void setAtualSalario(double atualSalario) {
        this.atualSalario = atualSalario;
    }

    public double getNovoSalario() {
        return novoSalario;
    }

    public void setNovoSalario(double novoSalario) {
        this.novoSalario = novoSalario;
    }
}
