package aula_EntradaSaida;

import java.util.Scanner;

public class ExercicioSalario {

	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);
		String colaborador ="";
		int codigo = 0;
		float salario, reajuste;
		String cargo = "";
		float Reajuste = 0.0f;
		
		System.out.print("Nome do colaborador: ");
		colaborador = ler.nextLine();
		
		System.out.print("Codigo do cargo: ");
		codigo = ler.nextInt();
		
		System.out.print("Salario : ");
		salario = ler.nextInt();
		
		switch (codigo) {
		case 1:
			cargo = "Gerente";
			Reajuste = 0.1f;
			break;
		case 2:
			cargo = "Vendedor";
			Reajuste = 0.7f;
			break;
			
		case 3:
			cargo = "Motorista";
			Reajuste = 0.6f;
			break;
			
		case 4:
			cargo ="Supervisor";
			Reajuste = 0.9f;
			break;
			
		case 5:
			cargo = "Estoquista";
			Reajuste = 0.5f;
			break;
			
		case 6:
			cargo = "Tecnico de TI";
			Reajuste = 0.8f;
			break;
			default:
			System.out.println("Codigo de cargo invalido");
			return;
		
		}
			Reajuste = Reajuste *salario;
			
	    float novoSalario = salario + Reajuste;
	    	    
	    System.out.println("\nNome do colaborador + colaborador");
	    System.out.println("\nNovosalario ");
	    System.out.println("\nCodigo do cargo ");
	}
}