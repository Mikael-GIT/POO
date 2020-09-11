package coursePOO.Exemplo2;

public class Produto {
	private String nome;
	private double preco;
	private int quantidade;
	
	
	public double calcularTotal() {
		double valorTotal = preco * quantidade;
		return valorTotal;
		
	}
	
	public String toString() {
		return nome + ", " + "R$ " + preco + ", " + quantidade + 
				" unidades, " + "Total: " + calcularTotal();
	}
	public void adicionarProdutos(int novosProdutos) {
		this.quantidade += novosProdutos;
	}
	public void removerProdutos(int numProdutos) {
		if(numProdutos <= this.quantidade) {
			this.quantidade -= numProdutos;
		} else {
			System.out.println("Não foi possível remover os produtos.");
		}
		
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public double getPreco() {
		return preco;
	}
	public void setPreco(double preco) {
		this.preco = preco;
	}
	public int getQuantidade() {
		return quantidade;
	}
	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}
	
	
}
