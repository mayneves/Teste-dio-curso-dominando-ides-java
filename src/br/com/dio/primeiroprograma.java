package br.com.dio;

import br.com.dio.model.gato;

public class primeiroprograma {

	public static void main(String[] args) {
		gato gato = new  gato();
		Livro livro = new 	Livro();
		
		System.out.println(gato);
		System.out.println(livro);
		
		/*int a = 2;
		int b = 3;
	System.out.println(("Hello World ") + (a+b));*/

	}

} 

class Livro {
	private String nome;
	private String npag;
}