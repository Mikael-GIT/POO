package coursePOO.Exemplo2;

import java.util.Scanner;

public class Programa {

	public static void main(String[] args) {
		Produto produto = new Produto();
		Scanner scan = new Scanner(System.in);
		System.out.println("Entre com os dados do produto: ");
		System.out.print("Nome: ");
		produto.setNome(scan.nextLine());
		System.out.print("Pre�o: ");
		produto.setPreco(scan.nextDouble());
		System.out.print("Quantidade: ");
		produto.setQuantidade(scan.nextInt());
		
		System.out.println("Informa��es do produto" + 
		produto.toString());
		
		System.out.println("Entre com o n�mero de produtos a serem "
			 + "adicionados ao estoque:");
		produto.adicionarProdutos(scan.nextInt());
		System.out.println("Informa��es atualizadas: " + produto.toString());
	
		System.out.println("Entre com o n�mero de produtos a serem "
				 + "removidos do estoque:");
			produto.removerProdutos(scan.nextInt());
			System.out.println("Informa��es atualizadas: " + produto.toString());
	}

}
