package testes;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import br.com.mobitbrasil.ped.q4.Anagrama;

class AnagramaTest {

	@Test
	void test() {
		String entradaTest_1 = "pato pato";
		String entradaTest_2 = "topa topa";
		
		String errorTest_1 = "bola bola";
		String errorTest_2 = "topa topa";
		
		assertTrue(Anagrama.checarAnagramas(entradaTest_1, entradaTest_2));
		assertFalse(Anagrama.checarAnagramas(errorTest_1, errorTest_2));
	}

}
