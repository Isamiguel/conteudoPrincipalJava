package aulaCollection;

import java.util.*;

public class ExercicioSet {

	public static void main(String[] args) {
		Set<Integer> set = new HashSet<>();
        Scanner scanner = new Scanner(System.in);
        
    System.out.println("Digite 10 valores inteiros:");

    for (int i = 0; i < 10; i++) {
        int valor = scanner.nextInt();
        set.add(valor);
        
    }
    System.out.println("Elementos da Collection Set:");

    Iterator<Integer> iterator = set.iterator();
    while (iterator.hasNext()) {
        System.out.println(iterator.next());
    }

	}

}
