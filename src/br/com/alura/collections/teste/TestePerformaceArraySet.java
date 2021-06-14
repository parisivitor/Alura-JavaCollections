package br.com.alura.collections.teste;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;


public class TestePerformaceArraySet {

	public static void main(String[] args) {
		
		int tamanho = 500000;
		
		Collection<Integer> testeArray = new ArrayList<>();
		long inicio = System.currentTimeMillis();
		for(int i=0  ; i< tamanho ; i++){
			testeArray.add(i);
		}
		testeArray.forEach(array ->{
			testeArray.contains(array);
		});
		
		long fim = System.currentTimeMillis();
		long tempoTotal = fim-inicio;
		System.out.println("Tempo de insercao e busca Array: " + tempoTotal + "ms");
		
		
		Collection<Integer> testeSet = new HashSet<>();
		inicio = System.currentTimeMillis();
		for(int i=0  ; i< tamanho ; i++){
			testeSet.add(i);
		}
		for (Integer set : testeSet) {
			testeSet.contains(set);
		}
		fim = System.currentTimeMillis();
		tempoTotal = fim-inicio;
		System.out.println("Tempo de insercao e busca HashSet: " + tempoTotal + "ms");
		
	}

}
