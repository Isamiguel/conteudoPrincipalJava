package aula_EstruturaDados;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class ExercicioFila {

	public static void main(String[] args) {
	
		Queue<String> filaClientes = new LinkedList<>();
        Scanner scanner = new Scanner(System.in);
        int opcao;

        do {
        	 System.out.println("Menu:");
             System.out.println("1: Adicionar um novo Cliente na fila");
             System.out.println("2: Listar todos os Clientes na fila");
             System.out.println("3: Chamar (retirar) uma pessoa da fila");
             System.out.println("0: Sair");
             System.out.print("Opção: ");
             opcao = scanner.nextInt();
             scanner.nextLine();
             
             switch (opcao) {
             case 1:
                 System.out.print("Nome do Cliente: ");
                 String nomeCliente = scanner.nextLine();
                 filaClientes.add(nomeCliente);
                 System.out.println("Cliente adicionado à fila.");
                 break;
             case 2:
                 if (filaClientes.isEmpty()) {
                     System.out.println("A fila está vazia.");
                 } else {
                     System.out.println("Clientes na fila:");
                     for (String cliente : filaClientes) {
                         System.out.println(cliente);
                     }
                 }
                 break;
             case 3:
                 if (filaClientes.isEmpty()) {
                     System.out.println("A fila está vazia.");
                 } else {
                     String clienteChamado = filaClientes.poll();
                     System.out.println("Cliente chamado: " + clienteChamado);
                 }
                 break;
             case 0:
                 System.out.println("Programa finalizado.");
                 break;
             default:
                 System.out.println("Opção inválida. Tente novamente.");
         }
     } while (opcao != 0);

     scanner.close();
 
	}
}