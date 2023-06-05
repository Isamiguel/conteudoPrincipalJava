package aula_EstruturaDados;
import java.util.Scanner;
import java.util.Stack;

public class ExercicioPilha {

	public static void main(String[] args) {
		
		Stack<String> pilhaDeLivros = new Stack<>();
        Scanner scanner = new Scanner(System.in);
        int opcao = -1;

        while (opcao != 0) {
            System.out.println(" MENU ");
            System.out.println("1: Adicionar livro na pilha");
            System.out.println("2: Listar todos os livros da pilha");
            System.out.println("3: Retirar um livro da pilha");
            System.out.println("0: Finalizar o programa");
            System.out.print("Escolha uma opção: ");
            opcao = scanner.nextInt();

        }
        scanner.nextLine();

        switch (opcao) {
            case 1:
           System.out.print("Digite o nome do livro: ");
           String nomeLivro = scanner.nextLine();
           pilhaDeLivros.push(nomeLivro);
           System.out.println("Livro adicionado à pilha.");
                break;
            case 2:
           System.out.println("Livros na pilha:");
           for (String livro : pilhaDeLivros) {
           System.out.println(livro);
                }
           if (pilhaDeLivros.isEmpty()) {
           System.out.println("A pilha está vazia.");
                }
                break;
            case 3:
           String livroRetirado = pilhaDeLivros.isEmpty() ? null : pilhaDeLivros.pop();
           System.out.println(livroRetirado != null ? "Livro retirado: " + livroRetirado : "A pilha está vazia.");
                break;
            case 0:
                System.out.println("Programa finalizado.");
                break;
            default:
                System.out.println("Opção inválida. Tente novamente.");
                break;
        }

        System.out.println();
        
	}
    }