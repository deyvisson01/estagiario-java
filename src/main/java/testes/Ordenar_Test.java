package testes;

import static org.junit.jupiter.api.Assertions.*;
import java.util.ArrayList;
import java.util.List;
import org.junit.jupiter.api.Test;
import br.com.mobitbrasil.ped.q8.Ordenar;
import br.com.mobitbrasil.ped.q8.Pessoa;

class Ordenar_Test {

	@Test
	void test() {
		List<Pessoa> listaPessoa = new ArrayList<Pessoa>();
		List<Pessoa> listaPessoa_saida = new ArrayList<Pessoa>();
		Pessoa pessoa_1 = new Pessoa("teste_1", 55, "teste email", "teste telefone");
		Pessoa pessoa_2 = new Pessoa("teste_2", 44, "teste email", "teste telefone");
		Pessoa pessoa_3 = new Pessoa("teste_3", 33, "teste email", "teste telefone");
		Pessoa pessoa_4 = new Pessoa("teste_4", 22, "teste email", "teste telefone");
		Pessoa pessoa_5 = new Pessoa("teste_5", 11, "teste email", "teste telefone");
		
		listaPessoa.add(pessoa_1);
		listaPessoa.add(pessoa_2);
		listaPessoa.add(pessoa_3);
		listaPessoa.add(pessoa_4);
		listaPessoa.add(pessoa_5);
		
		listaPessoa_saida.add(pessoa_5);
		listaPessoa_saida.add(pessoa_4);
		listaPessoa_saida.add(pessoa_3);
		listaPessoa_saida.add(pessoa_2);
		listaPessoa_saida.add(pessoa_1);
		
		assertEquals(listaPessoa_saida, Ordenar.ordenarPessoas(listaPessoa));
	}

}
