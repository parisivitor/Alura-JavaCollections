package br.com.alura.collections.modelo;

import java.util.Comparator;

public class OrdenaIdade implements Comparator<Object>{

	@Override
	public int compare(Object o1, Object o2) {
		Funcionario f1 = (Funcionario) o1;
		Funcionario f2 = (Funcionario) o2;
		Integer i1 = f1.getIdade();
		Integer i2 = f2.getIdade();
		int dif = i1.compareTo(i2);
		if(dif == 0)
			dif = f1.getNome().compareTo(f2.getNome());
		return dif;
	}

}
