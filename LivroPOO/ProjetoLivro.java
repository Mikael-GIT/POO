package PraticandoPOO;

public class ProjetoLivro {

	public static void main(String[] args) {
		//Criando um vetor de pessoas, um aglomerado de pessoa. Um grupo de pessoas. 
		Pessoa [] p= new Pessoa[2];

		
		//Criando um vetor de livros, um aglomerado de livros. Um grupo de livros. 
		Livro [] l = new Livro[3];
		
		//Inserindo um objeto pessoa no indice 0 do array de pessoas, no grupo de pessoas. É 
		//basicamente inserindo uma nova pessoa na primeira posição de uma lista.
		p[0] = new Pessoa("Matheus", 20, 'M');
		p[1] = new Pessoa("Mikael", 18, 'M');
		
		l[0] = new Livro("A culpa é das estrelas", "José", 150, p[0]); //Com o p[0], informo que
		//o parametro leitor que a classe Livro pede é a pessoa do indice 0 da lista, que nesse
		//caso é o Matheus.
		l[1] = new Livro("POO para Iniciantes", "Pedro Paulo", 500, p[1]);
		l[2] = new Livro("Java avançado", "Maria Candido", 800, p[0]);
		
		l[0].abrir();
		l[0].folhear(150);
		System.out.println(l[0].detalhes() + "\n");
		System.out.println(l[1].detalhes() + "\n");
		System.out.println(l[2].detalhes() + "\n");
	}

}
