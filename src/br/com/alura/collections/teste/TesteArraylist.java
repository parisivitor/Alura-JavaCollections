package br.com.alura.collections.teste;

import java.util.ArrayList;
import java.util.Collections;

public class TesteArraylist {

	public static void main(String[] args) {

		String vitor = "Vitor";
		
		ArrayList<String> nomes = new ArrayList<>();
		
		nomes.add(vitor);
		nomes.add("Eduardo");
		nomes.add("Carolina");
		nomes.add("Iago");
		
		for(int i=0; i < nomes.size(); i++) {
			System.out.println("Nome " + i + ": " + nomes.get(i));
		}
		System.out.println();
		Collections.sort(nomes);  //ordem crescente 
		System.out.println(nomes);
		
		Collections.shuffle(nomes);  //random 
		System.out.println();
		nomes.add(1, "Vinicius");
		for (String nome : nomes) {
			System.out.println(nome);
		}
		
		Collections.reverse(nomes); // serve para inverter a ordem de uma lista
		System.out.println();
		nomes.forEach(nome -> {
			System.out.println(nome);
		} );
		
		//nao entendi como usa kkkkk ou onde
		Collections.singletonList(nomes);// nos devolve uma lista imutável que contêm um único elemento especificado. Ele é útil quando precisamos passar um único elemento para uma API que só aceita uma Collections daquele elemento.

		
		nomes.remove(2);
		System.out.println();
		nomes.forEach(nome -> {
			System.out.println(nome);
		} );
		
		
	}

}
