package Aplicacao;

import java.util.Scanner;

public class Produto {

	public Produto(String string, int i, int j) {

	}

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
       
		System.out.print("Digite o nome do produto:");
		String nome = scn.next();
		
		double preco = scn.nextDouble();
        int quantidade = scn.nextInt();
        
		System.out.print("Digite o nome de produto:");
		System.out.print("Adicione a quantidade do produto:"); 
		System.out.print("Renova a quantidade do produto:"); 
		
		
		programa x = new programa(nome,preco,quantidade);
		System.out.print(x);
        
        scn.close();
	}
    }