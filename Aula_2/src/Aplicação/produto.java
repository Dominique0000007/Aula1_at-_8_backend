package Aplicação;

import java.util.Scanner;

public class produto {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		
			public class Produto; {
		    private String nome;
		    private int quantidade;

		    public Produto(String nome, int quantidade) {
		        this.nome = nome;
		        this.quantidade = quantidade;
		    }

		    public void mostrarDados() {
		        System.out.println("Nome do produto: " + nome);
		        System.out.println("Quantidade em estoque: " + quantidade);
		    }

		    public void entradaEstoque(int quantidadeEntrada) {
		        quantidade += quantidadeEntrada;
		        System.out.println("Entrada de estoque realizada com sucesso!");
		    }

		    public void saidaEstoque(int quantidadeSaida) {
		        if (quantidadeSaida <= quantidade) {
		            quantidade -= quantidadeSaida;
		            System.out.println("Saída de estoque realizada com sucesso!");
		        } else {
		            System.out.println("Não há quantidade suficiente em estoque para realizar a saída!");
		        }
		    }

		    public static void main(String[] args) {
		        Scanner scanner = new Scanner(System.in);

		        System.out.println("Digite o nome do produto:");
		        String nome = scanner.nextLine();

		        System.out.println("Digite a quantidade inicial do produto:");
		        int quantidade = scanner.nextInt();

		        Produto produto = new Produto(nome, quantidade);

		        System.out.println("Dados do produto:");
		        produto.mostrarDados();

		        System.out.println("Deseja realizar uma entrada de estoque? (s/n)");
		        String resposta = scanner.next();
		        if (resposta.equalsIgnoreCase("s")) {
		            System.out.println("Digite a quantidade a ser adicionada:");
		            int quantidadeEntrada = scanner.nextInt();
		            produto.entradaEstoque(quantidadeEntrada);
		        }

		        System.out.println("Deseja realizar uma saída de estoque? (s/n)");
		        resposta = scanner.next();
		        if (resposta.equalsIgnoreCase("s")) {
		            System.out.println("Digite a quantidade a ser removida:");
		            int quantidadeSaida = scanner.nextInt();
		            produto.saidaEstoque(quantidadeSaida);
		        }

		        System.out.println("Dados do produto após as operações:");
		        produto.mostrarDados();
		    }
		}
		
	}
}