package services;

import java.text.Normalizer;
import java.util.Date;
import java.util.List;

import entities.Anuncio;

public class Exibir {
	private static String cliente1;
	private static String cliente2; 
	
	public static void imprimeAnuncio(List<Anuncio> anuncios, int filtro, Date dataInicio, Date dataFim, String cliente) {
		if (filtro == 1) {
			for (Anuncio anuncio : anuncios) {
				System.out.println(anuncio);
			}
		} else if (filtro == 2) {
			int aux = 0; 
			for (Anuncio anuncio : anuncios) {
				if ((anuncio.getDataInicio().compareTo(dataInicio)>=0) && (anuncio.getDataInicio().compareTo(dataFim)<=0)) {
					aux = 1; 
					System.out.println(anuncio);
				}
			}
			if (aux == 0) { 
				System.out.println();
				System.out.println("Não foi encontrado nenhum anuncio na período informado");
				System.out.println();
			}
		} else {
			int aux = 0;
			for (Anuncio anuncio : anuncios) {
				cliente1 = removerAcentos(anuncio.getCliente().toLowerCase()); 
				cliente2 = removerAcentos(cliente.toLowerCase());
				if (cliente1.contains(cliente2)) {
					aux = 1; 
					System.out.println(anuncio);             
				}
			}
			if (aux == 0) { 
				System.out.println();
				System.out.println("Não foi encontrado nenhum cliente com o nome informado");
				System.out.println();
			}
		}
	}
	
	public static String removerAcentos(String str) {
	    return Normalizer.normalize(str, Normalizer.Form.NFD).replaceAll("[^\\p{ASCII}]", "");
	}

}
