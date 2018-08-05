package br.edu.fapi.poo.collections.list;

import java.util.List;

import br.edu.fapi.poo.collections.models.Livro;
import br.edu.fapi.poo.collections.util.Util;

public class ExemploList {

	public static void main(String[] args) {

		// Chamando o m�todo respons�vel por criar o mapa de documentos.
		List<Livro> listaDeLivros = Util.criarListaLivros();

		// Recuperando um elemento da lista.
		System.out.println(listaDeLivros.get(0));
		System.out.println("-------------------");

		// Tentando recupera um elemento que n�o existe na lista.
		// Lan�a exce��o "java.lang.IndexOutOfBoundsException"
		try {
			listaDeLivros.get(5);
		} catch (IndexOutOfBoundsException e) {
			System.out.println("Exce��o lan�ada:" + e.getMessage());
			System.out.println("-------------------");
		}

		// Mostrando a quantidade de elementos na lista.
		System.out.println(listaDeLivros.size());
		System.out.println("-------------------");

		// Mostrando os elementos da lista..
		// Notem que a classe Livro sobrescreveu o m�todo toString().
		for (Livro livro : listaDeLivros) {
			System.out.println(livro.toString());
		}
		System.out.println("-------------------");

		// Verifica se a lista cont�m um objeto.
		// Notem que o m�todo hashCode() e equals() foram sobrescritos
		Livro pesquisaLivro = new Livro();
		pesquisaLivro.setTitulo("Banco de Dados - Projeto e Implementa��o");
		pesquisaLivro.setAutor("Felipe Nery Rodrigues Machado");
		pesquisaLivro.setEditora("�rica");
		pesquisaLivro.setNumeroPaginas(400);

		System.out.println(listaDeLivros.contains(pesquisaLivro));
		System.out.println("-------------------");

		// Removendo todos os elementos da lista.
		listaDeLivros.clear();
		System.out.println(listaDeLivros.size());
		System.out.println("-------------------");

	}
}
