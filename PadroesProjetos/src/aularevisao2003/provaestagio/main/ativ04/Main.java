package aularevisao2003.provaestagio.main.ativ04;

import aularevisao2003.provaestagio.atividades.ativ04.Loja;
import aularevisao2003.provaestagio.atividades.ativ04.Produto;

public class Main {
    public static void main(String[] args) {
        Loja minhaLoja = new Loja(10, 001, 100, 100,
                002, 100, 100);

        System.out.println("Valor total é de: " + minhaLoja.calcularValorTotal());
    }
}
