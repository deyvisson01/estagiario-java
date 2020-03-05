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

        System.out.println("Entre com a primeira palavra desejada: ");
        String palavra1 = sc.nextLine();
        System.out.println("Entre com a segunda palavra desejada: ");
        String palavra2 = sc.nextLine();
        sc.close();

        if(checarAnagramas(palavra1, palavra2)) System.out.println("É um anagrama! ");
        else System.out.println("Não é um anagrama! ");

    }
    public static boolean checarAnagramas(String a, String b){
        String palavra1 = a.replace(" ","").toLowerCase();
        String palavra2 = b.replace(" ","").toLowerCase();
        
        char [] palavra1_array = palavra1.toCharArray();
        char [] palavra2_array = palavra2.toCharArray();
        
        Arrays.sort(palavra1_array);
        Arrays.sort(palavra2_array);

        if (Arrays.equals(palavra1_array, palavra2_array)) return true;
        else return false;

        // throw new UnsupportedOperationException();
    }

}
