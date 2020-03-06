package br.com.mobitbrasil.ped.q8;

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Ordenar{

    /**
     * Realizar a ordenação da listagem de pessoas utilizando o atributo idade de @Pessoa
     *
     * @param pessoas - Lista de pessoas
     *
     * @return
     */

    public static void formaLista(){
        List<Pessoa> listaPessoa = new ArrayList<Pessoa>();

        try {
            String path = "src/main/resources/pessoas.txt";
            File caminhoDoTexto = new File(path);
            FileReader lerCaminhoDoTexto = new FileReader(caminhoDoTexto);
            BufferedReader lerArquivo = new BufferedReader(lerCaminhoDoTexto);
            String curtLine = lerArquivo.readLine();

            while (curtLine != null) {
                String a[] = curtLine.split(";");
                int a1 = Integer.parseInt(a[1]);
                Pessoa pessoa = new Pessoa(a[0], a1, a[2], a[3]);
                listaPessoa.add(pessoa);

                curtLine = lerArquivo.readLine();
            }
            lerArquivo.close();
            ordenarPessoas(listaPessoa);

        } catch ( Exception e) {
            // TODO: handle exception
        }
    }

    public static List<Pessoa> ordenarPessoas(List<Pessoa> pessoas){
        System.out.println("Ordenando pessoas pela idade:");
        Collections.sort(pessoas, (Pessoa pessoa1, Pessoa pessoa2) -> pessoa1.getIdade().compareTo(pessoa2.getIdade()));
        pessoas.forEach(p -> System.out.println(p.getNome()+"\t"+p.getIdade()));
        return pessoas;
    }
}