package principal;

import aula_7.cachorro;
import aula_7.gato;
import aula_7.vaca;

	public class main{

		public  static void main(String[] args) {

			cachorro c = new cachorro();
			gato g = new gato();
			vaca v = new vaca();
			
			System.out.println(c.emitirSom());
			System.out.println(c.comer());	
			
			System.out.println(g.emitirSom());
			System.out.println(g.comer());
			
			System.out.println(v.emitirSom());
			System.out.println(v.comer());

		}

	}