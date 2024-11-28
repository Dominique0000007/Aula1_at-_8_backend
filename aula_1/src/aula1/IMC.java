package aula1;

import java.util.Scanner;

public class IMC {

	public static void main(String[] args) {
		
	Scanner scn = new Scanner(System.in);

	System.out.println("Digite sua altura:");
	double altura =scn.nextDouble();
		
		System.out.println("Digite seu peso:");
		double peso = scn.nextDouble();
		
		double imc = peso / Math.pow(altura, 2);
				
	if(imc <= 18.5) {
		System.out.println("Voce esta desnutrido.");
	}
	else if(imc >= 18.6 && imc <= 24.9) {
		System.out.println("peso ideal parabens.");
		
	}
		
	else if(imc >= 25.0 && imc <= 29.9) {
    System.out.println("voce esta levemente acima do peso.");
}
	else if(imc >= 30.0 && imc <= 34.9 ) {
		System.out.println("obesidade grau 1.");
	}
	else if(imc >= 35.0 && imc <=39.9) {
		System.out.println("obesidade grau 2.");
	}
	else {
		System.out.println("Obesidade grau 3.");
	}
		
	 scn.close();
	}
}
