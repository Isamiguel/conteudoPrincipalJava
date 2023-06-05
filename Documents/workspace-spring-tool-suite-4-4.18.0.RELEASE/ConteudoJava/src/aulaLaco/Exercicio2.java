package Exercicio1;

import java.util.Scanner;

public class Exercicio2 {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		String nome;
		int Idade;
		boolean primeiraDoacao;
		
		System.out.println("Digite o nome do doador: ");
		nome = leia.next();
		
		System.out.println("Digite a idade do doador: ");
		Idade = leia.nextInt(); 
		
		System.out.println("Primeira doação? ");
	    primeiraDoacao = leia.nextBoolean();
	    
	    if(Idade >= 18 && Idade <=59 ) {
	    	System.out.println("Você esta Apto! ");
	    	
	    }
	    else if (Idade <18 && Idade >69) {
	    System.out.println("Lamento, você não está apto!");
	    }
	    else if (Idade >= 60 && Idade <= 69 && primeiraDoacao == true) {
	    	System.out.println("Lamento, você so pode ser doador se não for sua primeira doação!");
	    	
	    	
	    } else {
	    	System.out.println("Parabéns, voce esta apto!");
	    }
	} 

}
