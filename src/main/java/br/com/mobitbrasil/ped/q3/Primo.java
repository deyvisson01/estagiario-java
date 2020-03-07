package br.com.mobitbrasil.ped.q3;

public class Primo {

    /**
     * Retornar o proximo numero primo após um valor numerico.
     *
     * @param numero - Valor numerico
     *
     * @return
     */

    public static boolean primo(long numero){ // Método que realzia o teste de validade para um número primo.
        for (int i = 2; i < numero; i++) {
            if (numero % i == 0) return false;   
        }
        return true;
    }

    public static long proximoPrimo(long numero){ // Método que irá buscar o próximo número primo.
        numero++;
        long i = numero + 1;
        while (i > numero) {
            if(!primo(numero)) {
                numero++;
                i++;
            }else i--;
        }
        return numero;

        // throw new UnsupportedOperationException();
    }
}
