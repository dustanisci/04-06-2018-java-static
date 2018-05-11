package run;

import model.Pessoa;

public class Executa {
	public static void main(String[] args) {
//		Nao foi necessario instanciar o objeto para chamar o metodo.
		Pessoa.falar();
		
//		Agora instaciado, pois o outro metodo e' Void.
		Pessoa pessoa = new Pessoa();
		System.out.println(pessoa.comer("pizza"));
	}
}
