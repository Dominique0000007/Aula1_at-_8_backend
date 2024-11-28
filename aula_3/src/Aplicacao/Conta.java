package Aplicacao;

import java.util.Scanner;

public class Conta {	
	
		public static void main(String[] args) {
			Scanner scn = new Scanner(System.in);
	       
			System.out.print("Digite o  seu nome:");
			String nome = scn.next();
			
			double numero = scn.nextDouble();
	        int saldo = scn.nextInt();
	        
			System.out.print("Digite o seu nome:");
			System.out.print("Adicione a quantidade de dinheiro:"); 
			System.out.print("Remova a quantidade de dinheiro:"); 
			
			
			programa x = new programa(nome,numero,saldo);
			System.out.print(x);
	        
	        scn.close();
	}

}
