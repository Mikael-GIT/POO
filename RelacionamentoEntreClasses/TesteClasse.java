package Aula;

public class TesteClasse {

	public static void main(String[] args) {
		Contato contato = new Contato();
		contato.setNome("Mikael");
		
		//Relacionamento tem-um endereço
		Endereco endereco = new Endereco();
		endereco.setNomeRua("Rua Geni Saraiva");
		endereco.setNumero("2329");
		endereco.setComplemento("Makro");
		endereco.setCidade("Nova Iguaçu");
		endereco.setEstado("Rio de Janeiro");
		endereco.setCep("26031481");
		contato.setEndereco(endereco);
		
		//Relacionamento tem-um telefone
		Telefone telefone1 = new Telefone();
		telefone1.setOperadora("Vivo");
		telefone1.setDdd("21");
		telefone1.setNumero("971959588");
		
		Telefone telefone2 = new Telefone();
		telefone2.setOperadora("Vivo");
		telefone2.setDdd("21");
		telefone2.setNumero("971959588");
		
		Telefone [] telefones = new Telefone[2];
		
		telefones[0] = telefone1;
		telefones [1] = telefone2;
		
		contato.setTelefones(telefones);
		
		if(contato != null && contato.getTelefones() != null && contato.getEndereco() != null) {
			contato.status();
			for(Telefone t : contato.getTelefones()) {
				System.out.println("Número: " + t.getDdd() + t.getNumero());
			}
		} else {
			System.out.println("Não foi possível imprimir as informações.");
		}
		
		
			
	}

}
