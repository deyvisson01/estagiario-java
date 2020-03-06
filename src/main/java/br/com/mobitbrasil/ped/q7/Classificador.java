package br.com.mobitbrasil.ped.q7;

import java.io.*;
import java.util.*;

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
    public static long contarPalavras(String palavra){
        
        List<String[]> lista = new ArrayList<>();   
         
        try {
            String path = "C:/Users/deyvi/Documents/GitHub/estagiario-java/src/main/resources/palavras.txt";
            File caminhoDoTexto = new File(path);
            FileReader lerCaminhoDoTexto = new FileReader(caminhoDoTexto);
            BufferedReader lerArquivo = new BufferedReader(lerCaminhoDoTexto);

            String str;
            
            while(lerArquivo.ready()){
                str = lerArquivo.readLine();
                lista.add(str.split(" "));
            } 
            lerArquivo.close();

        } catch(IOException e) {
            System.out.println("Arquivo não encontrado!");
        } finally {
            //System.out.println(lista);
        }

        long count = 0;
        int i = 0;
        Iterator<String[]> iterator = lista.iterator();
        while (iterator.hasNext()) {
          System.out.printf("Posição %d- %s\n", i, iterator.next());
          if (iterator.next().equals(palavra)) count++;
          i++;
        }
        
        return count;

        //throw new UnsupportedOperationException();
    }
}