package br.com.alura.collections.teste;

import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

import br.com.alura.collections.modelo.Funcionario;
import br.com.alura.collections.modelo.OrdenaIdade;

public class TesteTreeSetFuncionario {

	public static void main(String[] args) {
		Funcionario f1 = new Funcionario("Iago", 24);
		Funcionario f2 = new Funcionario("Rodrigo", 23);
		Funcionario f3 = new Funcionario("Vini", 25);
		Funcionario f4 = new Funcionario("Vitor", 25);
		
		
		Set<Funcionario> func = new TreeSet<>(new OrdenaIdade());
		func.add(f1);
		func.add(f2);
		func.add(f3);
		func.add(f4);
		
		Iterator<Funcionario> iteradorF = func.iterator();
		while(iteradorF.hasNext())
			System.out.println(iteradorF.next());
	}

}
