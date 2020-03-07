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

        System.out.println("Entre com o palíndromo: "); // Entrada da palavra a ser testada.
        String palavra = sc.nextLine();
        sc.close();
        
        if(checarPalindromo(palavra)) System.out.println("É um palíndromo! "); // Chamada do método que irá realziar a verificação; Teste com o retorno do método.
        else System.out.println("Não é um palíndromo!");
    }

    public static boolean checarPalindromo( String texto) {
        String palavra = texto.replace(" ","").toLowerCase(); // Eliminando os espaços e mantendo o texto recebido em letras minúsculas.
        String palindromo = new StringBuilder(palavra).reverse().toString(); // Revertendo a entrada.

        if (palavra.equals(palindromo)) return true; // Teste de validade da expressão.
        else return false;

        // throw new UnsupportedOperationException();
    }

}
