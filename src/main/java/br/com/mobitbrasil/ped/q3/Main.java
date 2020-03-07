package br.com.mobitbrasil.ped.q3;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Entre com o número desejado: "); // Entrada do número desejado.
        Long numero = sc.nextLong();
        sc.close();

        System.out.println("O próximo número primo é: "+ Primo.proximoPrimo(numero)); // Chamada do método que irá retornar o número primo.

    }
}