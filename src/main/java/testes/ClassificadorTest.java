package testes;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import br.com.mobitbrasil.ped.q7.Classificador;

class ClassificadorTest {

	@Test
	void test() {
		String entradaTest = "comerciais";
		String entradaTest_2 = "o";
		String entradaTest_3 = "palavra";
		
		long saidaTest = 34;
		long saidaTest_2 = 721;
		long saidaTest_3 = 1;
		
		assertEquals(saidaTest, Classificador.contarPalavras(entradaTest));
		assertEquals(saidaTest_2, Classificador.contarPalavras(entradaTest_2));
		assertNotEquals(saidaTest_3, Classificador.contarPalavras(entradaTest_3));
		
	}

}
