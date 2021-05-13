package services;

import java.util.Date;
import java.util.List;

import entities.Anuncio;

public class Exibir {
	
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
				System.out.println("N�o foi encontrado nenhum anuncio na per�odo informado");
				System.out.println();
			}
		} else {
			int aux = 0;
			for (Anuncio anuncio : anuncios) {
				if (anuncio.getCliente().toLowerCase().contains(cliente.toLowerCase())) {
					aux = 1; 
					System.out.println(anuncio);             
				}
			}
			if (aux == 0) { 
				System.out.println();
				System.out.println("N�o foi encontrado nenhum cliente com o nome informado");
				System.out.println();
			}
		}
	}

}
