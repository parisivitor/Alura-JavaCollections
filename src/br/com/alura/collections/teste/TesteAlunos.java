package br.com.alura.collections.teste;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import br.com.alura.collections.modelo.Aluno;
import br.com.alura.collections.modelo.Aula;
import br.com.alura.collections.modelo.Curso;

public class TesteAlunos {
	public static void main(String[] args) {

		Curso c1 = new Curso("Java", "Paulo Silveira");

		c1.adiciona(new Aula("java.lang", 15));
		c1.adiciona(new Aula("java.IO", 18));

		Aluno a1 = new Aluno("Fred", 123456);
		Aluno a2 = new Aluno("Fatima", 159753);
		Aluno a3 = new Aluno("Julia", 654321);

		c1.matricula(a1);
		c1.matricula(a2);
		c1.matricula(a3);
		
		System.out.println(c1);
		System.out.println(c1.getAlunos());
		System.out.println();

		c1.getAlunos().forEach(aluno -> {
			System.out.println(aluno);
		});
		System.out.println();

// 		teste de conjunto vazio		
//		Set<Aluno> alunos = Collections.emptySet();
//		alunos.add(a1); // ao tentar acidiona dara erro UnsupportedOperationException, pois o conjunto sempre sera vazio !
		
//		Set<Aluno> alunos = Collections.synchronizedSet(new HashSet<>()); //Retorna um conjunto sincronizado (thread-safe) apoiado pelo conjunto especificado. Para garantir o acesso serial, 
//																		  //é fundamental que todo o acesso ao conjunto de apoio seja realizado por meio do conjunto retornado.
		
		System.out.println("o aluno " + a1.getNome() + " esta matriculado? " + c1.estaMatriculado(a1));
		
		Aluno fred = new Aluno("Fred", 123456);
		System.out.println("o aluno " + fred.getNome() + " esta matriculado? " + c1.estaMatriculado(fred));  //so vai funcionar ao fazer a sobrescrita do metodo equal e hashcode; (ctrl+3 equal) -> eclipse  ja cria automaticamente 
		
	}

}
