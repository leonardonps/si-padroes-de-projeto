package aularevisao2003.provaestagio.main.ativ03;

import aularevisao2003.provaestagio.atividades.ativ03.Salario;

public class Main {
    public static void main(String[] args) {
        Salario salarioFuncionario = new Salario(1500);
        salarioFuncionario.reajustar();

        System.out.printf("Salário atual: %.2f\n", salarioFuncionario.getAtualSalario());
        System.out.printf("Novo salário do funcionário: %.2f\n", salarioFuncionario.getNovoSalario());
    }
}
