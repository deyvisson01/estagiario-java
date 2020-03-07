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
        List<Pessoa> listaPessoa = new ArrayList<Pessoa>(); // Inicia a lista de Pessoas.

        try {
            String path = "src/main/resources/pessoas.txt"; // Caminho do arquivo que contém os dados das pessoas.
            File caminhoDoTexto = new File(path);
            FileReader lerCaminhoDoTexto = new FileReader(caminhoDoTexto);
            BufferedReader lerArquivo = new BufferedReader(lerCaminhoDoTexto); // Abertura do arquivo.
            String curtLine = lerArquivo.readLine(); // Leitura do arquivo.

            while (curtLine != null) { // Executa enquanto contem caracteres na linha.
                String a[] = curtLine.split(";"); // Separa os dados pelo ";".
                int a1 = Integer.parseInt(a[1]);
                Pessoa pessoa = new Pessoa(a[0], a1, a[2], a[3]); // Inicializa um objeto Pessoa com os dados do arquivo.
                listaPessoa.add(pessoa); // Adiciona na lista de Pessoas.

                curtLine = lerArquivo.readLine(); // Leitura da próxima linha do arquivo.
            }
            lerArquivo.close();
            ordenarPessoas(listaPessoa); // Chamada do método ordenador passando a lista de Pessoas como parâmetro.

        } catch ( Exception e) {
            // TODO: handle exception
        }
    }

    public static List<Pessoa> ordenarPessoas(List<Pessoa> pessoas){
        System.out.println("Ordenando pessoas pela idade:");
        Collections.sort(pessoas, (Pessoa pessoa1, Pessoa pessoa2) -> pessoa1.getIdade().compareTo(pessoa2.getIdade())); // Uso de Collections para ordenar a lista usando como teste o atributo idade de cada objeto Pessoa.
        pessoas.forEach(p -> System.out.println(p.getNome()+"\t"+p.getIdade())); // Print da lista ordenada.
        return pessoas;
    }
}