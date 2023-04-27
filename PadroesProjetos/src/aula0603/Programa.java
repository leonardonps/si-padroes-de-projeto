package aula0603;

public class Programa {

	public static void main(String[] args) {
		
		Conta c2 = new Conta(2, "João", 1500, 3000);
		
		System.out.println("Saldo da conta 2: " + c2.getSaldo());
		
		c2.sacar(500);

		System.out.println("Sacando...");
		System.out.println("Saldo da conta 2: " + c2.getSaldo());

	}

}
