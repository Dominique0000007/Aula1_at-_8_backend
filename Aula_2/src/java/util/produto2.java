package Aplicação;

import java.util.Scanner;

public class produto {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		import java.util.Scanner;

		public class Main {
		  public static void main(String[] args) {
		    Scanner scanner = new Scanner(System.in);

		    System.out.println("Digite o nome do produto:");
		    String nome = scanner.nextLine();

		    System.out.println("Digite a quantidade do produto:");
		    int quantidade = scanner.nextInt();

		    Produto produto = new Produto(nome, quantidade);

		    System.out.println("Dados do produto:");
		    System.out.println("Nome: " + produto.getNome());
		    System.out.println("Quantidade: " + produto.getQuantidade());

		    System.out.println("Deseja realizar uma entrada no estoque? (s/n)");
		    String resposta = scanner.next();

		    if (resposta.equalsIgnoreCase("s")) {
		      System.out.println("Digite a quantidade a ser adicionada:");
		      int quantidadeAdicionada = scanner.nextInt();
		      produto.setQuantidade(produto.getQuantidade() + quantidadeAdicionada);
		      System.out.println("Quantidade atualizada: " + produto.getQuantidade());
		    }

		    System.out.println("Deseja realizar uma saída no estoque? (s/n)");
		    resposta = scanner.next();

		    if (resposta.equalsIgnoreCase("s")) {
		      System.out.println("Digite a quantidade a ser removida:");
		      int quantidadeRemovida = scanner.nextInt();
		      if (quantidadeRemovida <= produto.getQuantidade()) {
		        produto.setQuantidade(produto.getQuantidade() - quantidadeRemovida);
		        System.out.println("Quantidade atualizada: " + produto.getQuantidade());
		      } else {
		        System.out.println("Quantidade insuficiente no estoque!");
		      }
		    }

		    System.out.println("Dados do produto atualizados:");
		    System.out.println("Nome: " + produto.getNome());
		    System.out.println("Quantidade: " + produto.getQuantidade());
		  }
		}
		
	}
		}