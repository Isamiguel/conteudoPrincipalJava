package aula_POO;

public class Produto {

	private String nome;
	private String plataforma;
	private double preco;
	// Adicionar mais 2 atributos
	

	public Produto(String nome, String plataforma, double preco) {
		this.nome = nome;
		this.plataforma = plataforma;
		this.preco = preco;
	}

	// Adicionar os métodos Get e Set


	public void exibirInformacoes() {
		System.out.println("Nome: " + nome);
		System.out.println("Plataforma: " + plataforma);
		System.out.println("Preço: R$" + preco);
	}
}