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

        System.out.println("Entre com a primeira palavra desejada: ");
        String palavra = sc.nextLine();
        System.out.println("Palavra: "+palavra+" \t quantidade: " + Classificador.contarPalavras(palavra));
        sc.close();

    }

    public static long contarPalavras(String palavra){
        
        List<String[]> lista = new ArrayList<>();   

        Map<String, Integer> mapPalavras;
        mapPalavras = new HashMap<String,Integer>();
        

        try {
            String path = "src/main/resources/palavras.txt";
            File caminhoDoTexto = new File(path);
            FileReader lerCaminhoDoTexto = new FileReader(caminhoDoTexto);
            BufferedReader lerArquivo = new BufferedReader(lerCaminhoDoTexto);

            String curtLine = lerArquivo.readLine();
            while (curtLine != null) {
                String minusculo = curtLine.toLowerCase();

                Pattern p = Pattern.compile("(\\d+)|([a-záéíóúçãõôê]+)"); // Utilizei uma expressão regular que classifica palavras como uma sequencia de numeros ou letras.
                Matcher m = p.matcher(minusculo);

                while (m.find()) {
                    String token = m.group();
                    Integer freq = mapPalavras.get(token);
                    if (freq != null) mapPalavras.put(token, freq+1);
                    else mapPalavras.put(token, 1);
                }
                curtLine = lerArquivo.readLine();
            }
           lerArquivo.close();
           for (Map.Entry<String, Integer> entry : mapPalavras.entrySet()) {
               if (entry.getKey().equals(palavra)) {
                return entry.getValue();
               }
         }

        } catch(IOException e) {
            System.out.println("Arquivo não encontrado!");
        } finally {
            //System.out.println(lista);
        }
        return 0;

        //throw new UnsupportedOperationException();
    }
}