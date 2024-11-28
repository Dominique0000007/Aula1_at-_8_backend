package Aplicacao;

public class Aplicacao_conta {

		private String nome;
		private int numero;
		private double saldo;
		
		public Aplicacao_conta(String nome, int numero, double saldo) {
			this.nome = nome;
			this.numero = numero;
			this.saldo = saldo;
		}
		public String toString() {
			return "Aplicacao_conta [nome=" + nome + ", numero=" + numero + ", saldo=" + saldo + "]";
		}
}