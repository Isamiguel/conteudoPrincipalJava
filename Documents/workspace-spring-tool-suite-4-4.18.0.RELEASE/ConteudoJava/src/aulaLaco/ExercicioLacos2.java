package aulaLaco;

import java.util.Scanner;

public class ExercicioLacos2 {

	public static void main(String[] args) {

		Scanner leia = new Scanner(System.in);

		String nome;
		Float salario;
		int codigoCargo;

		System.out.println("Nome do colaborador: ");
		nome = leia.next();

		System.out.println("Digite o Salario: ");
		salario = leia.nextFloat();

		System.out.println("Digite o numero do cargo de 1 a 6: ");
		codigoCargo = leia.nextInt();

		float novoSalario = novoSalario = (codigoCargo + salario);

		System.out.println("\nNome do Colaborador: " + nome);
		System.out.println("Cargo: " + codigoCargo);
		System.out.println("Novo Salário: " + novoSalario);

		float percentualReajuste;

		switch (codigoCargo) {
		case 1:
			percentualReajuste = 0.05f;
			break;
		case 2:
			percentualReajuste = 0.08f;
			break;
		case 3:
			percentualReajuste = 0.10f;
			break;

		default:
			System.out.println("Opcção invalida");

		{
		}
		}
	}
}