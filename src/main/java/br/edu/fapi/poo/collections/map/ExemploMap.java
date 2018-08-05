package br.edu.fapi.poo.collections.map;

import java.util.Map;
import java.util.Map.Entry;

import br.edu.fapi.poo.collections.models.Documento;
import br.edu.fapi.poo.collections.util.Util;

public class ExemploMap {
	public static void main(String[] args) {

		// Chamando o método responsável por criar o mapa de documentos.
		Map<String, Documento> mapaDeDocumentos = Util.criarMapaDocumentos();

		// Recuperando um elemento do mapa.
		Documento pesquisa1 = mapaDeDocumentos.get("Passporte");
		System.out.println(pesquisa1.getCodigo());
		System.out.println("-------------------");

		// Tentando recupera um elemento que não existe no mapa.
		Documento pesquisa2 = mapaDeDocumentos.get("NaoExiste");
		System.out.println(pesquisa2);
		System.out.println("-------------------");

		// Mostrando a quantidade de elementos no mapa.
		System.out.println(mapaDeDocumentos.size());
		System.out.println("-------------------");

		// Mostrando os elementos do mapa - Chave e Valor.
		// Notem que a classe Documento sobrescreveu o método toString()
		for (Entry<String, Documento> entry : mapaDeDocumentos.entrySet()) {
			System.out.println(entry.getKey() + " | " + entry.getValue().toString());
		}
		System.out.println("-------------------");

		// Recuperando apenas os valores do mapa (sem as chaves).
		for (Documento documento : mapaDeDocumentos.values()) {
			System.out.println(documento.toString());
		}
		System.out.println("-------------------");

		// Removendo todos os elemtos do mapa.
		mapaDeDocumentos.clear();
		// Mostrando o mapa zerado.
		System.out.println(mapaDeDocumentos.size());
		System.out.println("-------------------");

	}
}
