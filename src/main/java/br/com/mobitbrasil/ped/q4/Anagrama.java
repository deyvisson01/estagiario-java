package br.com.mobitbrasil.ped.q4;

import java.util.*;
public class Anagrama {

    /**
     * Checar se dois textos são anagramas
     *
     * @param a - Primeiro texto
     * @param b - Segundo texto
     *
     * @return
     */
    public static void recebeString(){
        Scanner sc = new Scanner(System.in);

        System.out.println("Entre com a primeira palavra desejada: "); // Recebe a primeira String.
        String palavra1 = sc.nextLine();
        System.out.println("Entre com a segunda palavra desejada: "); // Recebe a segunda String.
        String palavra2 = sc.nextLine();
        sc.close();

        if(checarAnagramas(palavra1, palavra2)) System.out.println("É um anagrama! "); // Chamada do método que irá checar a validade da expressão; Teste com o retorno do método.
        else System.out.println("Não é um anagrama! ");

    }
    public static boolean checarAnagramas(String a, String b){
        String palavra1 = a.replace(" ","").toLowerCase(); // Eliminação dos espaços.
        String palavra2 = b.replace(" ","").toLowerCase();
        
        char [] palavra1_array = palavra1.toCharArray(); // Alocando as Strings em arreios de caracteres.
        char [] palavra2_array = palavra2.toCharArray();
        
        Arrays.sort(palavra1_array); // Ordenando os caracteres.
        Arrays.sort(palavra2_array);

        if (Arrays.equals(palavra1_array, palavra2_array)) return true; // Verifica se os caracteres ordenados formam a mesma sequência.
        else return false;

        // throw new UnsupportedOperationException();
    }

}
