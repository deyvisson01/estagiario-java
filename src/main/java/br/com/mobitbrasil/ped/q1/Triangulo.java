package br.com.mobitbrasil.ped.q1;

import java.util.Scanner;
public class Triangulo {

    /**
     * Validar triangulo
     *
     * @param a - Lado a
     * @param b - Lado b
     * @param c - Lado c
     *
     * @return
     */

    public static void receberMedidasTriangulo(){
        Scanner sc = new Scanner(System.in);

        System.out.println("Entre com os lados do triângulo: "); // Recebendo os lados da figura.
        int lado1 = sc.nextInt();
        int lado2 = sc.nextInt();
        int lado3 = sc.nextInt();
        sc.close();
        
        boolean resp = checarTriangulo(lado1, lado2, lado3); // Chamando o método que irá realizar a verificação.
        
        if (resp) System.out.println("É um triangulo!"); // Testando o resultado obtido pelo método.
        else System.out.println("Não é um triangulo!");
    }

    public static boolean checarTriangulo(int a, int b, int c){
        if ((a < b + c) && (b < a + c) && (c < a + b)) { // Teste de validade dos lados de um triângulo.
            return true;
        }else{
            return false;
        }
        // throw new UnsupportedOperationException();
    }

}
