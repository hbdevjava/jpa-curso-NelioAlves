package aplicacao;

import dominio.Pessoa;

public class Programa {

	public static void main(String[] args) {
	
		Pessoa pessoa1 = new Pessoa(1, "Hebert Brito", "hb@outlook.com");
		Pessoa pessoa2 = new Pessoa(2, "Vikas Brito", "vk@outlook.com");
		Pessoa pessoa3 = new Pessoa(3, "Alisson Rodrigues", "son@outlook.com");
		
		System.out.println(pessoa1);
		System.out.println(pessoa2);
		System.out.println(pessoa3);

	}

}
