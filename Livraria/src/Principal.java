
public class Principal {

	public static void main(String[] args) {
		
		Livro livro = new Livro();
		livro.setNome("Lógica de Programação");
		livro.setDescricao("Novos recursos da linguagem");
		livro.setValor(59.90);
		
		livro.mostrarDetalhes();
	}

}
