package aula_7;

public class vaca extends animal implements Mamifero{

	public String emitirSom() {
	return super.emitirSom() + "da vaca faz é: Moo";
}

	@Override
	public String comer() {
		return "A vaca come grama";
	}
}
