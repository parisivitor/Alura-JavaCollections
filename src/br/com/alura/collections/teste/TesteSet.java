package br.com.alura.collections.teste;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

public class TesteSet {

	public static void main(String[] args) {

		Set<String> alunos = new HashSet<>();
		alunos.add("Vitor Parisi");
		alunos.add("Iago Vini");
		alunos.add("Carol Pires");
		alunos.add("Vini Daniel");

		for (String aluno : alunos) {
			System.out.println(aluno);
		}
		System.out.println();

		System.out.println("Carol Piresfoi adicionada novamente? " + alunos.add("Carol Pires"));

		System.out.println("Vitor Parisi contem dentro de alunos? " + alunos.contains("Vitor Parisi"));
		System.out.println("Iago Vini foi removido? " + alunos.remove("Iago Vini"));
		System.out.println(alunos.size());
		System.out.println();

		alunos.forEach(aluno -> {
			System.out.println(aluno);
		});
		System.out.println();

		List<String> alunosArray = new ArrayList<>(alunos);

		alunosArray.forEach(aluno -> {
			System.out.println(aluno);
		});
		System.out.println();

		List<String> letras = new LinkedList<>();
		letras.add("A");
		letras.add("B");
		letras.add("C");

		letras.forEach(letra -> {
			System.out.println(letra);
		});

		Iterator<String> iterador = letras.iterator(); // igual percorrer em lista encadeada em c, se chega no final,
														// para la, e fica como null o next, ate criar outro iterador
		while (iterador.hasNext()) {
			System.out.println(iterador.next());
		}

	}

}
