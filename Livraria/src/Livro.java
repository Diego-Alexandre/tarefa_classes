
public class Livro {
	
	String nome;
	String descricao;
	double valor;
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	public double getValor() {
		return valor;
	}
	public void setValor(double valor) {
		this.valor = valor;
	}
	
	void mostrarDetalhes() {
		System.out.println("Mostrando Detalhes do Livro");
		System.out.println("Nome: " + nome);
		System.out.println("Descricao: " + descricao);
		System.out.println("Valor: " + valor);
		
		
	}
	
	

}
