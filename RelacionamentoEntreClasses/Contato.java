package Aula;

public class Contato {
	private String nome;
	private Telefone [] telefones; //Aqui estamos fazer uma relação de um pra vários, ou seja, todo 
	//contato tem vários telefones. 
	private Endereco endereco; //Já no caso de endereço, um contato só pode ter um endereço, 
	//logo temos uma relação de um pra um. Sendo assim, não precisamos de um array.
	

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
