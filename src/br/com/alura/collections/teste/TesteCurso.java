package br.com.alura.collections.teste;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import br.com.alura.collections.modelo.Aluno;
import br.com.alura.collections.modelo.Aula;
import br.com.alura.collections.modelo.Curso;

public class TesteCurso {

	public static void main(String[] args) {

		Curso c1 = new Curso("Java", "Vitor");
		Curso c2 = new Curso("C", "Iago");

//		c1.getAulas().add(new Aula("Java.lang",33));   //utilizando o retorno no metodo getAulas return Collections.unmodifiableList(aulas) faz com que
//		c1.getAulas().add(new Aula("Java.util",23));   //não seja mais possível alterar o valor dessa lista por fora da própria classe

		Aula aula1 = new Aula("Java.util", 23);
		c1.adiciona(aula1);

		c1.adiciona(new Aula("Java.lang", 33));
		c1.adiciona(new Aula("Java.IO", 31));

		List<Aula> aulasImutaveis = c1.getAulas();
//		Collections.sort(aulasImutaveis); // por getAulas ser Collections.unmodifiableCollection() nao tem como mexer no objeto em si. 
		System.out.println(aulasImutaveis);
		System.out.println();

		List<Aula> aulasMutaveis = new ArrayList<Aula>(c1.getAulas());
		Collections.sort(aulasMutaveis);
		System.out.println(aulasMutaveis);
		System.out.println();

		Aluno vitor = new Aluno("Fatima", 159753);

		System.out.println(c1);
		System.out.println();
		
		Set<Aluno> alunos = c1.getAlunos();
		Iterator<Aluno> iterador = alunos.iterator();

		while (iterador.hasNext()) {
		    System.out.println(iterador.next());
		}
		
	
	}

}
