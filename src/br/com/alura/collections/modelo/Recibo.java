package br.com.alura.collections.modelo;

public class Recibo {

	private int cod;
	private double valor;
	private Curso curso;

	public int getCod() {
		return cod;
	}

	public double getValor() {
		return valor;
	}

	public Curso getCurso() {
		return curso;
	}

	public Recibo(int cod, double valor, Curso curso) {
		this.cod = cod;
		this.valor = valor;
		this.curso = curso;
	}
	
	@Override
	public String toString() {
		return "Cod: " + this.getCod() + ", Curso: " + this.getCurso().getNome() + ", Valor: R$" + this.getValor() ;
				
	}

}
