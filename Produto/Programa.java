package coursePOO.Exemplo2;

import java.util.Scanner;

public class Programa {

	public static void main(String[] args) {
		Produto produto = new Produto();
		Scanner scan = new Scanner(System.in);
		System.out.println("Entre com os dados do produto: ");
		System.out.print("Nome: ");
		produto.setNome(scan.nextLine());
		System.out.print("Preço: ");
		produto.setPreco(scan.nextDouble());
		System.out.print("Quantidade: ");
		produto.setQuantidade(scan.nextInt());
		
		System.out.println("Informações do produto" + 
		produto.toString());
		
		System.out.println("Entre com o número de produtos a serem "
			 + "adicionados ao estoque:");
		produto.adicionarProdutos(scan.nextInt());
		System.out.println("Informações atualizadas: " + produto.toString());
	
		System.out.println("Entre com o número de produtos a serem "
				 + "removidos do estoque:");
			produto.removerProdutos(scan.nextInt());
			System.out.println("Informações atualizadas: " + produto.toString());
	}

}
