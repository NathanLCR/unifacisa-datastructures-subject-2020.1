package Questao04;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Lista {
	public static void main(String[] args) {
		List<Integer> minhaLista = new ArrayList<Integer>();
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Inserir os numero na mesma linha separados por espaço:");
		String[] entrada = sc.nextLine().split(" ");
		
		int numero;
		for(int i=0 ; i < entrada.length ; i++) {
			numero = Integer.parseInt(entrada[i]);
			minhaLista.add(numero);
		}
		
		IntegerComparator comparator = new IntegerComparator();
		
		Collections.sort(minhaLista,comparator);
		System.out.println(minhaLista);
		
	}
}	
