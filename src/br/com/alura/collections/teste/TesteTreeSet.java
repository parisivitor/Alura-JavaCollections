package br.com.alura.collections.teste;

import java.util.Comparator;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

import br.com.alura.collections.modelo.Aluno;
import br.com.alura.collections.modelo.Curso;
import br.com.alura.collections.modelo.Recibo;

public class TesteTreeSet  {

	public static void main(String[] args) {
		
		Curso c1 = new Curso("Java", "Saamuel Rosa" );
		Curso c2 = new Curso("C", "Marcelo D2");
		Curso c3 = new Curso("C#", "Eduardo Paiva");
		Curso c4 = new Curso("C++", "Mano Brown");

		Recibo r1 = new Recibo(1,70,c1);
		Recibo r2 = new Recibo(2, 80, c2);
		Recibo r3 = new Recibo(3,50,c3);
		Recibo r4 = new Recibo(4, 180, c4);
		
		Comparator<Recibo> compadarador = (Recibo o1, Recibo o2) -> {
			Double d1 = o1.getValor();
			Double d2 = o2.getValor();
			return d1.compareTo(d2);
		};
		
		Set<Recibo> recibo = new TreeSet<>(compadarador);
		recibo.add(r1);
		recibo.add(r2);
		recibo.add(r3);
		recibo.add(r4);
		
		System.out.println(recibo);
		
		
		
		
	}

}
