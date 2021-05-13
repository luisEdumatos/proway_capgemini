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
			for (Anuncio anuncio : anuncios) {
				if ((anuncio.getDataInicio().compareTo(dataInicio)>=0) && (anuncio.getDataInicio().compareTo(dataFim)<=0)) {
					System.out.println(anuncio);
				}
			}
		} else {
			for (Anuncio anuncio : anuncios) {
				if (anuncio.getCliente().toLowerCase().contains(cliente.toLowerCase())) {
					System.out.println(anuncio);             
				}
			}
		}
	}

}
