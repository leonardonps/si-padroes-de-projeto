package aularevisao2003.provaestagio.main.ativ05;

import aularevisao2003.provaestagio.atividades.ativ05.Salario;

public class Main {
    public static void main(String[] args) {
        Salario calculadoraQntSalarioMinimo = new Salario(1320, 1800);

        System.out.printf("Salário: %.2f\n", calculadoraQntSalarioMinimo.getSalario());
        System.out.printf("Salário mínimo: %.2f\n", calculadoraQntSalarioMinimo.getSalarioMinimo());
        System.out.printf("Quantidade de salário mínimo em salário: %.2f",
                calculadoraQntSalarioMinimo.calcularQuantSalarioMinimo() );
    }
}
