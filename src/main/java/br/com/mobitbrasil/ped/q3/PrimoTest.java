package br.com.mobitbrasil.ped.q3;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class PrimoTest {

	@Test
	void test() {
		long valor_1 = 5;
		long valor_2 = 383;
		long result_1 = 7;
		long result_2 = 389;
		
		assertEquals(result_1, Primo.proximoPrimo(valor_1));
		assertEquals(result_2, Primo.proximoPrimo(valor_2));
		
	}

}
