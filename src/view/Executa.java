package view;

import model.Pessoa;

public class Executa {
	public static void main(String[] args) {
		// N�o foi necess�rio instanciar o objeto para chamar o m�todo.
		Pessoa.falar();

		// Agora instaciado, pois o outro metodo � Void.
		Pessoa pessoa = new Pessoa();
		System.out.println(pessoa.comer("pizza"));
	}
}
