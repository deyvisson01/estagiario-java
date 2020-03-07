package br.com.mobitbrasil.ped.q5;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class SumaRecursivaTest {

	@Test
	void test() {
		System.out.println("Soma recursiva: ");
		int valor = 6;
		long resultadoEsperado = 21;
		
		long resultadoObtido = SomaRecursiva.somar(valor);
		assertEquals(resultadoEsperado, resultadoObtido);
		
	}

}
