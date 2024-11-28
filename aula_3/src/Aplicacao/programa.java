package Aplicacao;

public class programa {
		
		private String nome;
		private double preco;
		private int quantidade;
		
		public programa(String nome, double preco, int quantidade) {
			this.nome = nome;
			this.preco = preco;
			this.quantidade = quantidade;
		}
		public int removerproduto(int remover) {
			
			return quantidade = quantidade + remover;
	}
		public String toString() {
			return "programa [nome=" + nome + ", preco=" + preco + ", quantidade=" + quantidade + "]";
		}
}