package ExercicioVetor;

import java.util.Scanner;

public class Vetor1 {

	public static void main(String[] args) {
		int vetor = 10;
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Digite 10 números inteiros:");
        for (int i = 0; i < vetor; i++) {
        	
        }
        System.out.println("Numeros ímpares:");
        for (int i = 1; i < vetor; i += 2) {
        	System.out.println(vetor);
        	
        }
        System.out.println("Elementos pares:");
        for (int i = 0; i < vetor; i++) {
        	
        }
            if (vetor % 2 == 0) {
            	
            }
                System.out.println(vetor);
                int soma = 0;
                for (int i = 0; i < vetor; i++) {
                soma += vetor;
                }
         System.out.println("Soma dos numeros: " + soma);
         
         double media = (double) soma / vetor;
         System.out.println("Média dos elementos: " + media);
	}
}
