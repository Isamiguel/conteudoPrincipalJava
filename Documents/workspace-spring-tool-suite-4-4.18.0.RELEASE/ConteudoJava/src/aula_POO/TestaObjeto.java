package aula_POO;

public class TestaObjeto {

	public static void main(String[] args) {
        Produto produto1 = new Produto("PlayStation 4", "Console", 199.90);
        Produto produto2 = new Produto("Nintendo Switch","Console" ,299.90);
        
        System.out.println("Informações do produto 1:");
        produto1.exibirInformacoes();

        System.out.println("Informações do produto 2:");
        produto2.exibirInformacoes();
    }

}
