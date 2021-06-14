package br.com.alura.collections.teste;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import br.com.alura.collections.modelo.Aluno;
import br.com.alura.collections.modelo.Aula;
import br.com.alura.collections.modelo.Curso;

public class TesteMap {

	public static void main(String[] args) {
		
//		Map<Integer, String> cpfNome = new LinkedHashMap();  LinkedHashMap mantem a ordem de insercao 
		Map<Integer, String> cpfNome = new HashMap();
		
		cpfNome.put(123, "Vitor");
		cpfNome.put(333, "Carol");
		cpfNome.put(321, "Vini");
//		cpfNome.put(321, "OutroVini");
		
		System.out.println(cpfNome.keySet());
		
		//pega a chave e pra cada chave, busca o nome de cada chava respectiva
		
		cpfNome.keySet().forEach(cpf ->{
			System.out.println(cpfNome.get(cpf));
		});
		
		System.out.println("----------------------");
		System.out.println("Acessar as chaves");
		Set<Integer> cpfs = cpfNome.keySet();
		cpfs.forEach(key->{
			System.out.println(key);
		});
		
		System.out.println("----------------------");
		System.out.println("Acessar os valores");
		Collection<String> nomes = cpfNome.values();
		for (String nome : nomes) {
			System.out.println(nome);
		}
		
		System.out.println("----------------------");
		System.out.println("Para associar");
		Set<Entry<Integer, String>> associacoes = cpfNome.entrySet();
		for (Entry<Integer, String> associacao : associacoes) {
			System.out.println("Key: " + associacao.getKey() + ", Valor: " + associacao.getValue());
		}
		
		
		System.out.println("----------------------");
		Curso c1 = new Curso("Java", "Paulo Silveira");

		c1.adiciona(new Aula("java.lang", 15));
		c1.adiciona(new Aula("java.IO", 18));

		Aluno a1 = new Aluno("Fred", 123456);
		Aluno a2 = new Aluno("Fatima", 159753);
		Aluno a3 = new Aluno("Julia", 654321);

		c1.matricula(a1);
		c1.matricula(a2);
		c1.matricula(a3);
		
		System.out.println("Quem é o aluno de matricula 123456? " +c1.buscaMatriculado(123456).getNome());
		
		
		
	}

}
