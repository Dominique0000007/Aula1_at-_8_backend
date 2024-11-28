package aula_7;

public class cachorro extends animal implements Mamifero {
		
		public String emitirSom() {
		return  super.emitirSom() + " do cachorro faz é: Woof!";
		 
		
	}

		public String comer() {
			return "O cachorro come ração";
		}

}
