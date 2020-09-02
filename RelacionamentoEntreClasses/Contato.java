package Aula;

public class Contato {
	private String nome;
	private Telefone [] telefones; //Aqui estamos fazer uma rela��o de um pra v�rios, ou seja, todo 
	//contato tem v�rios telefones. 
	private Endereco endereco; //J� no caso de endere�o, um contato s� pode ter um endere�o, 
	//logo temos uma rela��o de um pra um. Sendo assim, n�o precisamos de um array.
	

	public Telefone[] getTelefones() {
		return telefones;
	}
	public void setTelefones(Telefone[] telefones) {
		this.telefones = telefones;
	}
	

	public Endereco getEndereco() {
		return endereco;
	}
	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	
	
	public void status() {
		System.out.println("Nome: " + this.getNome());
		System.out.println("Endereco: " + this.getEndereco().getNomeRua() + " " + this.getEndereco().getNumero());
		
	}

}
