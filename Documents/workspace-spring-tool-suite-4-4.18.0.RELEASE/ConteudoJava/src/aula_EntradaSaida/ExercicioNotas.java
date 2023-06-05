package Notas;

import java.util.Scanner;

public class ExercicioNotas {

	public static void main(String[] args) {
		
    float nota1,nota2,nota3,nota4,soma,resultado;
    
    Scanner leia = new Scanner(System.in);
    
    System.out.println("\nDigite a primeira nota:");
    nota1 = leia.nextFloat();
    System.out.println("\nDigite a segunda nota:");
    nota2 = leia.nextFloat();
    System.out.println("\nDigite a terceira nota:");
    nota3 = leia.nextFloat();
    System.out.println("\nDigite a quarta nota:");
     nota4 = leia.nextFloat();
     
    soma = nota1+nota2+nota3+nota4;
      resultado = soma /4;
      System.out.println("resultado = 8,1");
	}

}
