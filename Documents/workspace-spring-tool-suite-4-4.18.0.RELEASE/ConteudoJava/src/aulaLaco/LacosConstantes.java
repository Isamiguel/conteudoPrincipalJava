package Exercicio1;

import java.util.Scanner;

public class LacosConstantes {

	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);
		int num;
		
		System.out.println("Digite um numero inteiro:");
		num = ler.nextInt();
		
		if(num >= 0) {
			if(num %2 == 0) {
			System.out.println("O numero" + num + "é par e positivo");
		}
			else {
				System.out.println("O numero" + num + "é impar e positivo");
			}
		}
		else {
		if(num % 2 == 0)
			System.out.println("O numero" + num + "é impar e negativo");
		else {
			System.out.println("O numero" + num + "é par e negativo");
		}
	}
			
		}
		}	

	
