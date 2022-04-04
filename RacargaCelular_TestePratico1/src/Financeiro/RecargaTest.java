package Financeiro;

import org.junit.jupiter.api.Test;

import junit.framework.Assert;



public class RecargaTest {
	@Test
	public void deveRecarregar() {
		Conta conta = new Conta(100);
	
		conta.setRecarga(30);
		
	Assert.assertEquals(80, 70);
	}
}
