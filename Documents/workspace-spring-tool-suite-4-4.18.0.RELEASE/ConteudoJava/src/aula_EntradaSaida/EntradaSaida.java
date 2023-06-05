package aula_EntradaSaida;

import java.util.Scanner;

public class EntradaSaida {

	public static void main(String[] args) {

		float abono, salario, soma;

		Scanner leia = new Scanner(System.in);

		System.out.println("salario");
		salario = leia.nextFloat();

		System.out.println("abono");
		abono = leia.nextFloat();

		soma = salario + abono;

		System.out.println("Resultado da Soma:" + soma);
	}

}
