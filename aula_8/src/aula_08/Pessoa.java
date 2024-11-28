package aula_08;

import java.util.Scanner;

public class Pessoa {

	public static void main(String[] args) {
		
		Scanner scn = new Scanner(System.in);
		
		String nome;
		String idade;
		
		System.out.println("Digite o seu nome:");
		nome = scn.next();
		
		System.out.println("Digite a sua idade:");
		idade = scn.next();
	}
}