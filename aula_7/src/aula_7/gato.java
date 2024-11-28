package aula_7;

public class gato extends animal implements Mamifero{

		public String emitirSom() {
		return super.emitirSom() + "do gato faz é: Meow";
	
	}
		
		public String comer() {
			return "o gato come peixe";
		}
		
}
