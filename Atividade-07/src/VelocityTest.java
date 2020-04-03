import java.util.HashSet;
import java.util.Iterator;
import java.util.TreeSet;

public class VelocityTest {

	public static void main(String[] args) {
		//Teste de velocidade do hashset
		long startHashSet = System.nanoTime();
		HashSet<Integer> hash = new HashSet<Integer>();

		//Inserção de 10.000 elementos		
		for (int i = 0; i < 10000 ; i++) {
			hash.add(i);
		}
		
		//Removendo os ultimos 4.999 elementos
		for (int i = 5001; i < 10000; i++) {
			hash.remove(i);
		}
		
		//Verificando se contem 5000 elementos, 2501 retornam true, o restante false
		boolean resHash;
		for (int i = 2500; i <= 7500; i++) {
			resHash = hash.contains(i);
		}
		
		//Navegando com iterator
		Iterator <Integer> iteratorHash = hash.iterator();		
		int nextHash;
		while (iteratorHash.hasNext()) {
			nextHash = iteratorHash.next();
		};
		
		
		
		
		long finishHashSet = System.nanoTime();
		
		//Verificando o tempo
		long elapsedTimeHashSet = finishHashSet - startHashSet;

		long startTreeSet = System.nanoTime();
		
		//Teste de velocidade do treeset
		TreeSet<Integer> tree = new TreeSet<Integer>();
		
		//Inserção de 10.000 elementos
		for (int i = 0; i < 10000 ; i++) {
			tree.add(i);
		}
		
		//Removendo os ultimos 4.999 elementos
		for (int i = 5001; i < 10000; i++) {
			tree.remove(i);
		}
		
		//Verificando se contem 5000 elementos, 2501 retornam true, o restante false
		boolean resTree;		
		for (int i = 2500; i <= 7500; i++) {
			resTree = tree.contains(i);
		}
		
		//Navegando com iterator
		Iterator <Integer> iteratorTree = tree.descendingIterator();
		int nextTree;
		while (iteratorTree.hasNext()) {
			nextTree = iteratorTree.next();
		};
		
		
		long finishTreeSet = System.nanoTime();
		
		//Verificando o tempo
		long elapsedTimeTreeSet = finishTreeSet - startTreeSet;
		
		System.out.println("Tempo gasto pelo HashSet: "+elapsedTimeHashSet);
		System.out.println("Tempo gasto pelo TreeSet: "+elapsedTimeTreeSet);
	}

}
