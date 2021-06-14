package br.com.alura.collections.modelo;

public class Aula implements Comparable<Aula> {

	private String titulo;	
	private int tempo;

	public Aula(String nome, int idade) {
		this.titulo = nome;
		this.tempo = idade;
	}


	public int getTempo() {
		return tempo;
	}

	public String getTitulo() {
		return titulo;
	}
	
	@Override
	public String toString() {
		return "[Aula: " + this.titulo + " tempo: " + this.tempo + "]" ;
	}

	@Override
	public int compareTo(Aula outraPessoa) {
		return this.titulo.compareTo(outraPessoa.getTitulo());
	}
}
