package br.edu.fapi.poo.collections.util;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import br.edu.fapi.poo.collections.models.Documento;
import br.edu.fapi.poo.collections.models.Livro;

public class Util {

	public static List<Livro> criarListaLivros() {
		List<Livro> listaDeLivros = new ArrayList<Livro>();

		Livro bancoDeDados = new Livro();
		bancoDeDados.setTitulo("Banco de Dados - Projeto e Implementação");
		bancoDeDados.setAutor("Felipe Nery Rodrigues Machado");
		bancoDeDados.setEditora("Érica");
		bancoDeDados.setNumeroPaginas(400);

		Livro historiaDaEducacao = new Livro();
		historiaDaEducacao.setTitulo("Historia da Educacao");
		historiaDaEducacao.setAutor("Alicia Mariani Lucio");
		historiaDaEducacao.setEditora("Fael");
		historiaDaEducacao.setNumeroPaginas(154);

		Livro linguagemSQL = new Livro();
		linguagemSQL.setTitulo("Linguagem SQL - Guia Prático de Aprendizagem");
		linguagemSQL.setAutor("Luciana Ferreira Baptista");
		linguagemSQL.setEditora("Érica");
		linguagemSQL.setNumeroPaginas(156);

		//Adicionando livros na lista
		listaDeLivros.add(bancoDeDados);
		listaDeLivros.add(historiaDaEducacao);
		listaDeLivros.add(linguagemSQL);

		return listaDeLivros;
	}

	public static Map<String, Documento> criarMapaDocumentos() {

		Map<String, Documento> mapaDeDocumentos = new HashMap<String, Documento>();

		Documento passaporte = new Documento();
		passaporte.setCodigo("ABC123");
		passaporte.setNome("José da Silva");
		passaporte.setTipoDocumento("Passporte");

		Documento cnh = new Documento();
		cnh.setCodigo("0123456789");
		cnh.setNome("José da Silva");
		cnh.setTipoDocumento("CNH");

		//Colocando documentos no mapa
		mapaDeDocumentos.put("Passporte", passaporte);
		mapaDeDocumentos.put("CNH", cnh);
		
		return mapaDeDocumentos;
	}

}
