package testes;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import br.com.mobitbrasil.ped.q5.SomaRecursiva;

class SomaRecursiva_Test {

	@Test
	void test() {
		System.out.println("Soma recursiva: ");
		int valor = 6;
		long resultadoEsperado = 21;
		
		long resultadoObtido = SomaRecursiva.somar(valor);
		assertEquals(resultadoEsperado, resultadoObtido);
	}

}
