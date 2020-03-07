package br.com.mobitbrasil.ped.q1;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import org.junit.jupiter.api.Test;


/**
 * TrianguloTestes
 */
public class TrianguloTest {
    @Test
    void recebeEntradas() {
    	
    	assertTrue(Triangulo.checarTriangulo(5, 5, 5));
    	assertTrue(Triangulo.checarTriangulo(2, 1, 2));
    	assertFalse(Triangulo.checarTriangulo(10, 2, 2));
    	
    }
    
}