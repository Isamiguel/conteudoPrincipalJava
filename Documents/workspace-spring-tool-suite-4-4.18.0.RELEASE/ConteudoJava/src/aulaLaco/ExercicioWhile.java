package While1;

import java.util.Scanner;

public class ExercicioWhile {

	public static void main(String[] args) { 
	
		int idade;
		int menorque21 = 0;
		int maiorque50 = 0;
		
		Scanner leia = new Scanner(System.in);
	
		 System.out.print("Digite a idade: ");
	     idade = leia.nextInt();
	     
	     while(idade >= 0) {
	
	     if (idade < 21) {
	    	 menorque21++;
	     }
	     
	     if(idade > 50) {
	    	 maiorque50++;
	     }
	     
	     {
	     System.out.print("Digite uma idade: ");
	     idade = leia.nextInt();
	     }
	     
		 if(idade <= 0) {
			 
	      System.out.println("Pessoas com menos de 21 anos: " + menorque21);
	      idade = leia.nextInt();
	      
		 System.out.println("Pessoas com mais de 50 anos: " + maiorque50);
		 idade = leia.nextInt();
		 
		 }
		}
		}
}