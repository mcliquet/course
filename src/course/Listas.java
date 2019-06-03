package course;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Listas {
	public static void main(String[] args) {
		
		//instancia uma nova lista chamada list do tipo string
		//não usar tipos primitivos, inter, usar Integer
		//arraylist implementa a interface otimizada
		List<String> list = new ArrayList<>(); 
		
		list.add("Maria");
		list.add("Alex");
		list.add("Bob");
		list.add("Anna");
		list.add(2, "Marco");
		
		System.out.println(list.size());
		for (String x : list) {
			System.out.println(x);
		}
		
		System.out.println("---------------------");
		
		//remove linha x, tal que x na posição 0 seja m
		list.removeIf(x -> x.charAt(0) == 'M');
		for (String x : list) {
			System.out.println(x);
		}
		
		System.out.println("---------------------");
		
		//posição na lista
		System.out.println("Index of Bob: " + list.indexOf("Bob"));
		System.out.println("Index of Marco: " + list.indexOf("Marco"));
		
		System.out.println("---------------------");
		
		//declara nova lista result, pegar lista list(stream que permite operações lambda filter(x -> x.charAt(0) == 'A')),
		//filtrar todos que começam com a, coletar estes.
		List<String> result = list.stream().filter(x -> x.charAt(0) == 'A').collect(Collectors.toList());
		for (String x : result) {
			System.out.println(x);
		}
		
		System.out.println("---------------------");
		
		//encontrar elemento da lista que atenda ao requisito
		String name = list.stream().filter(x -> x.charAt(0) == 'J').findFirst().orElse(null);
		System.out.println(name);
	}
}