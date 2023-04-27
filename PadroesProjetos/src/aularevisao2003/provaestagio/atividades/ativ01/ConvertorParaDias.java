package aularevisao2003.provaestagio.atividades.ativ01;

public class ConvertorParaDias {

	private int qtdAnos;
	private int qtdMeses;
	private int qtdDias;
	
	public ConvertorParaDias(int qtdAnos, int qtdMeses, int qtdDias) {
		this.qtdAnos = qtdAnos;
		this.qtdMeses = qtdMeses;
		this.qtdDias = qtdDias;
	}
	
	public int converterParaDias(){
		int totalDias = (this.qtdAnos*365) + (this.qtdMeses*30) + qtdDias;
		return totalDias;
	}
	
}
