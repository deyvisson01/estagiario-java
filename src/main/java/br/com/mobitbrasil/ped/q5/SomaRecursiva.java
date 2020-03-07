package br.com.mobitbrasil.ped.q5;

import java.util.*;
import java.util.stream.LongStream;

public class SomaRecursiva {

    /**
     * Realizar a soma de forma recursiva de todos valores numericos entre 1 e o valor informado.
     *
     * @param valor
     *
     * @return
     */

    public static void recebeValor(){
        Scanner sc = new Scanner(System.in);

        System.out.println("Entre com o valor a ser somado: "); // Entrada do valor
        int valor = sc.nextInt();
        sc.close();

        SomaRecursiva.somar(valor); // Chamada do método somador.
    }

    public static long somar(int valor){
        long result = LongStream.iterate(1, n-> n+1) // Realiza a operação desejada de 1 até o valor da entrada.
        .limit(valor)
        .reduce(0, (a,b) -> a + b); // Descreve a operação.

        System.out.println(result);
        return result;
        
        // throw new UnsupportedOperationException();
    }

}
