package br.com.mobitbrasil.ped.q2;
import java.util.Scanner;

public class Palindromo {

    /**
     * Checar palindromo
     *
     * @param texto - Texto palindromo
     *
     * @return
     */

    public static void recebePalindromo(){
        Scanner sc = new Scanner(System.in);

        System.out.println("Entre com o palíndromo: ");
        String palavra = sc.nextLine();
        sc.close();
        
        if(checarPalindromo(palavra)) System.out.println("É um palíndromo! ");
        else System.out.println("Não é um palíndromo!");
    }

    public static boolean checarPalindromo( String texto) {
        String palavra = texto.replace(" ","").toLowerCase();
        String palindromo = new StringBuilder(palavra).reverse().toString();

        if (palavra.equals(palindromo)) return true;
        else return false;

        // throw new UnsupportedOperationException();
    }

}
