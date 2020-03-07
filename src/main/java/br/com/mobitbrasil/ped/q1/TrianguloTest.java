package br.com.mobitbrasil.ped.q1;

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

/**
 * TrianguloTestes
 */
public class TrianguloTest {
    @Test
    void recebeEntradas() {
    	Triangulo triangulo = new Triangulo();
    	assertEquals(true, triangulo.checarTriangulo(5, 5, 5), "Resultado deve ser TRUE");
    }
    
}