package br.com.mobitbrasil.ped.q7;

import java.io.*;
import java.util.*;
import java.util.regex.*;

public class Classificador {

    /**
     * Verificar a quantidade de ocorrências de uma palavra em um arquivo texto.
     *
     * Arquivo: palavras.txt em src/main/resources/
     *
     * @param palavra - Palavra para pesquisa
     *
     * @return
     */

    public static void trataPalavra(){
        Scanner sc = new Scanner(System.in);

        System.out.println("Entre com a primeira palavra desejada: "); // Entrada da palavra a ser contada.
        String palavra = sc.nextLine();
        System.out.println("Palavra: "+palavra+" \t quantidade: " + Classificador.contarPalavras(palavra)); // Chamada do método contador.
        sc.close();
    }

    public static long contarPalavras(String palavra){ 

        Map<String, Integer> mapPalavras; 
        mapPalavras = new HashMap<String,Integer>(); // Declarando o HashMap que irá guardar as palavras e valores.

        try {
            String path = "src/main/resources/palavras.txt"; // Descrição do caminho do arquivo a ser percorrido.
            File caminhoDoTexto = new File(path);
            FileReader lerCaminhoDoTexto = new FileReader(caminhoDoTexto);
            BufferedReader lerArquivo = new BufferedReader(lerCaminhoDoTexto); // Abertura do arquivo.
            String curtLine = lerArquivo.readLine(); // Leitura do arquivo.

            while (curtLine != null) { // Executa enquando a linha conter caracteres.
                String minusculo = curtLine.toLowerCase(); // Manter os caracteres em letra minúscula.
                Pattern p = Pattern.compile("(\\d+)|([a-záéíóúçãõôê]+)"); // Expressão regular que classifica palavras como uma sequencia de numeros ou letras.
                Matcher m = p.matcher(minusculo); // Testa cada palavra.

                while (m.find()) { // Quando encontrar uma palavra irá adicionar ao HashMap
                    String token = m.group(); // Recebe a palavra.
                    Integer freq = mapPalavras.get(token); // Recebe a quantidade.
                    if (freq != null) mapPalavras.put(token, freq+1); // Adiciona ao contador caso já tenha sido lida.
                    else mapPalavras.put(token, 1); // Inicia com 1 caso seja a primeira leitura.
                }
                curtLine = lerArquivo.readLine(); // Leitura da próxima linha.
            }
           lerArquivo.close();

           for (Map.Entry<String, Integer> entry : mapPalavras.entrySet()) { // Para cada palavra no HashMap, testa se é a mesma que foi recebida na entrada.
               if (entry.getKey().equals(palavra)) return entry.getValue(); // Se for a mesma palavra irá retornar a quantidade acumulada no HashMap.
            }

        } catch(IOException e) {
            System.out.println("Arquivo não encontrado!"); // Tratamento de erro na abertura do arquivo.
        }
        return 0;
        //throw new UnsupportedOperationException();
    }
}