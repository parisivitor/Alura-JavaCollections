package br.com.alura.collections.modelo;

import java.util.Comparator;

public class Funcionario {

	String nome;
	int idade;

	public Funcionario(String nome, int idade) {
		super();
		this.nome = nome;
		this.idade = idade;
	}

	public String getNome() {
		return nome;
	}

	public int getIdade() {
		return idade;
	}
	
	@Override
	public String toString() {
		return "Nome: " + this.nome + " idade: " + this.idade;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + idade;
		result = prime * result + ((nome == null) ? 0 : nome.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Funcionario other = (Funcionario) obj;
		if (idade != other.idade)
			return false;
		if (nome == null) {
			if (other.nome != null)
				return false;
		} else if (!nome.equals(other.nome))
			return false;
		return true;
	}
	
	
	
//	LOUCURAS DA MINHA CABEÇA soaksoaksoa
//	public Comparator<Funcionario> OrdenaIdade() {
//		Comparator<Funcionario> comparador = (f1,f2) -> {
//			Integer  i1 = f1.getIdade();
//			Integer i2 = f2.getIdade();
//			return  i1.compareTo(i2);
//		};
//		return comparador;
//	}

	
}
