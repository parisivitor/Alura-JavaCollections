package br.com.alura.collections.teste;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

import br.com.alura.collections.modelo.Aula;

public class TesteArrayListObj {

	public static void main(String[] args) {
		Aula p1 = new Aula("Primeira aula", 25);
		Aula p2 = new Aula("Orientada Objetos", 23);
		Aula p3 = new Aula("Collections", 24);
		Aula p4 = new Aula("Java.IO", 26);

		ArrayList<Aula> pessoas = new ArrayList<>();
		pessoas.add(p1);
		pessoas.add(p2);
		pessoas.add(p3);
		pessoas.add(p4);

		System.out.println(pessoas); // sem sobrescrever o metodo toString, vai printar o endereco do objeto
		System.out.println();

		Collections.sort(pessoas);


		pessoas.forEach(pessoa -> {
			System.out.println(pessoa);
		});
		System.out.println();

		pessoas.sort(Comparator.comparing(Aula::getTempo)); //faz a ordenacao por ondem de tempo, ja que tempo é int e int ja tem uma ordenacao padrao
		
		pessoas.forEach(pessoa -> {
			System.out.println(pessoa);
		});
	}

}
