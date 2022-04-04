package Financeiro;

public class verifica {

	public static void main(String[] args) {
		Conta ok = new Conta(100);
		
			ok.recarga(30);
			System.out.println(ok.getSaldo());
	}

}
