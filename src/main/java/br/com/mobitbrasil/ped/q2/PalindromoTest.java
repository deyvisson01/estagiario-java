package br.com.mobitbrasil.ped.q2;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class PalindromoTest {

	@Test
	void test() {
		String entradaTest = "roma me tem amor";
		String errorTest = "teste false";
		
		assertTrue(Palindromo.checarPalindromo(entradaTest));
		assertFalse(Palindromo.checarPalindromo(errorTest));
	
	}

}
