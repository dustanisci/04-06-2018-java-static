package view;

import model.Pessoa;

public class Executa {
	public static void main(String[] args) {
		// Não foi necessário instanciar o objeto para chamar o método.
		Pessoa.falar();

		// Agora instaciado, pois o outro metodo é Void.
		Pessoa pessoa = new Pessoa();
		System.out.println(pessoa.comer("pizza"));
	}
}
