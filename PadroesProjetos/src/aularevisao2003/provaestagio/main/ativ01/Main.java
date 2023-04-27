package aularevisao2003.provaestagio.main.ativ01;

import aularevisao2003.provaestagio.atividades.ativ01.ConvertorParaDias;

public class Main {
	public static void main(String[] args) {
		ConvertorParaDias convertor = new ConvertorParaDias(3, 2, 15);
		System.out.println("Quantidades em dias: " + convertor.converterParaDias());
	}
}
