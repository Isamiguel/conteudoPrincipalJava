package aula_POO;

public class TestaCliente {

	public static void main(String[] args) {
	
		Cliente cliente1 = new Cliente("Laura", 25, "Rua Paraiba, 132");
        Cliente cliente2 = new Cliente("Isabella", 30, "Rua Rio Branco, 580");
        
        System.out.println("Informações do Cliente 1:");
        System.out.println("Nome: " + cliente1.getNome());
        System.out.println("Idade: " + cliente1.getIdade());
        System.out.println("Endereço: " + cliente1.getEndereco());

        System.out.println();

        System.out.println("Informações do Cliente 2:");
        System.out.println("Nome: " + cliente2.getNome());
        System.out.println("Idade: " + cliente2.getIdade());
        System.out.println("Endereço: " + cliente2.getEndereco());

	}

}
