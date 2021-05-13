package services;

import java.util.Date;
import java.util.List;

import entities.Anuncio;

public class Exibir {
	
	public static void imprimeAnuncio(List<Anuncio> anuncios, int filtro, Date data_inicio, Date data_fim, String cliente) {
		if (filtro == 1) {
			for (Anuncio anuncio : anuncios) {
				System.out.println(anuncio);
			}
		} else if (filtro == 2) {
			for (Anuncio anuncio : anuncios) {
				if ((anuncio.getData_inicio().compareTo(data_inicio)>=0) && (anuncio.getData_inicio().compareTo(data_fim)<=0)) {
					System.out.println(anuncio);
				}
			}
		} else {
			for (Anuncio anuncio : anuncios) {
				if (anuncio.getCliente().equals(cliente)) {
					System.out.println(anuncio);             
				}
			}
		}
	}

}
