package aula1704.heranca;

public class App {
    public static void main(String[] args) {
        ContaRenumerada conta1 = new ContaRenumerada();
        System.out.println("Saldo inicial = " + conta1.getSaldo());
        conta1.depositar(100);
        conta1.aplicaRendimentos(0.005);
        System.out.println("Saldo atual = " + conta1.getSaldo());

        ContaEspecial contaEspecial = new ContaEspecial();
        contaEspecial.depositar(100);
        System.out.println("Saldo de 3 meses = " + conta1.getSaldo());
        contaEspecial.setLimite(1000);
        System.out.println("Limite do Chorão = " + contaEspecial.getLimite());
    }
}
