package br.com.alura.collections.modelo;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Curso {

	private String nome;
	private String instrutor;
	private List<Aula> aulas = new ArrayList<>();
	private Set<Aluno> alunos = new HashSet<>();
	Map<Integer, Aluno> matriculaParaAluno = new HashMap<>();

	public Curso(String nome, String instrutor) {
		this.nome = nome;
		this.instrutor = instrutor;
	}

	public String getNome() {
		return nome;
	}

	public String getInstrutor() {
		return instrutor;
	}

	public List<Aula> getAulas() {
		return Collections.unmodifiableList(this.aulas);
	}
	
	public void adiciona(Aula aulas) {
		this.aulas.add(aulas);
	}
	
	public int getTempoTotal() {
		int tempoTotal=0;
		for (Aula aula : aulas) {
			tempoTotal += aula.getTempo();
		}
		return tempoTotal;
//	    return this.aulas.stream().mapToInt(Aula::getTempo).sum(); //mesma funcao utilizando stream do java 8

	}
	
	@Override
	public String toString() {
		return "[Nome do curso: " +  this.getNome() + ", Instrutor: " +this.getInstrutor() + ", Tempo Total: " + getTempoTotal() + " minutos, Aulas:" +  this.getAulas() + "alunos: " +this.getAlunos() + "]" ;
	}
	
	
	public Set<Aluno> getAlunos() {
		return Collections.unmodifiableSet(alunos);  //transforma em imutavel
	}
	
	public void matricula(Aluno aluno) {
		this.alunos.add(aluno);
		this.matriculaParaAluno.put(aluno.getMatricula(), aluno);

	}
	
	public Aluno buscaMatriculado(int matricula) {
		if(matriculaParaAluno.get(matricula) == null)
			throw new NullPointerException("Não existe aluno com essa matricula");
		return matriculaParaAluno.get(matricula);
	}
	
	
	public boolean estaMatriculado(Aluno aluno) {
		return this.alunos.contains(aluno);  //utilizar contains para saber se o objeto esta presente 
	}
	
	@Override
	public boolean equals(Object obj) {
		Aluno outro = (Aluno) obj;			//type cast para transforma o obj generico em um obj Aluno
//		return this.getNome() == outro.getNome(); //ma pratica utilizar ==
		return this.nome.equals(outro.getNome());
	}
	
	@Override
	public int hashCode() {
		return this.nome.hashCode();  //classe string ja tem um metodo hashCode que refaz a divisao para montar a tabela de dispersao (tabela de espalhamento / tabela hash);
	}
	
	
	

}
