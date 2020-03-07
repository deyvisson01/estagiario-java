package testes;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import br.com.mobitbrasil.ped.q2.Palindromo;

class Palindromo_Test {

	@Test
	void test() {
		String entradaTest = "roma me tem amor";
		String errorTest = "teste false";
		
		assertTrue(Palindromo.checarPalindromo(entradaTest));
		assertFalse(Palindromo.checarPalindromo(errorTest));
	}

}
