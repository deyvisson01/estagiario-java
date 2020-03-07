package testes;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

@RunWith(Suite.class)
@SuiteClasses({Triangulo_Test.class,
				Palindromo_Test.class,
				Primo_Test.class,
				Anagrama_Test.class,
				SomaRecursiva_Test.class,
				Classificador_Test.class,
				Ordenar_Test.class})
public class AllTests {
	
}
