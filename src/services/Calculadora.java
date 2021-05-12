package services;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

import entities.Anuncio;

public class Calculadora {
	private List<Anuncio> anuncios = new ArrayList<>();
	private int filtro;
	private Date data_inicio;
	private Date data_fim;
	private String cliente;

	SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

	// Construtor para filtragem geral
	public Calculadora(List<Anuncio> anuncios, int filtro) {
		this.anuncios = anuncios;
		this.filtro = filtro;
	}

	// Construtor para filtragem por intervalo de tempo
	public Calculadora(List<Anuncio> anuncios, int filtro, Date data_inicio, Date data_fim) {
		this.anuncios = anuncios;
		this.filtro = filtro;
		this.data_inicio = data_inicio;
		this.data_fim = data_fim;
	}

	// Construtor para filtragem geral
	public Calculadora(List<Anuncio> anuncios, int filtro, String cliente) {
		this.anuncios = anuncios;
		this.filtro = filtro;
		this.cliente = cliente;
	}

	public List<Anuncio> getAnuncios() {
		return anuncios;
	}

	public double valor_total() {
		double total = 0.0;
		if (filtro == 0) { //filtragem geral
			for (Anuncio anuncio : anuncios) {
				total += anuncio.getInvestimento();
			}
		} else if (filtro == 1) { //filtragem por intervalo de tempo 
			Calendar filtro_inicio = Calendar.getInstance(); 
			Calendar filtro_fim = Calendar.getInstance(); 
			Calendar data = Calendar.getInstance(); 
			filtro_inicio.setTime(data_inicio);
			filtro_fim.setTime(data_fim);
			for (Anuncio anuncio : anuncios) {
				data.setTime(anuncio.getData_inicio());
				if ((data.get(Calendar.DAY_OF_YEAR) >= filtro_inicio.get(Calendar.DAY_OF_YEAR)) && (data.get(Calendar.DAY_OF_YEAR) <= filtro_fim.get(Calendar.DAY_OF_YEAR))) {
					total += anuncio.getInvestimento();
				}
			}
		} else { //filtragem por cliente 
			for (Anuncio anuncio : anuncios) {
				if (anuncio.getCliente().equals(cliente)) { 
					total += anuncio.getInvestimento();			
				}
			}
		}
		return total;
	}

	public double max_views() {
		double total = 0.0; 
		if (filtro == 0) { //filtragem geral
			for (Anuncio anuncio : anuncios) {
				total += anuncio.max_views();
			}
		} else if (filtro == 1) { //filtragem por intervalo de tempo 
			Calendar filtro_inicio = Calendar.getInstance(); 
			Calendar filtro_fim = Calendar.getInstance(); 
			Calendar data = Calendar.getInstance(); 
			filtro_inicio.setTime(data_inicio);
			filtro_fim.setTime(data_fim);
			for (Anuncio anuncio : anuncios) {
				data.setTime(anuncio.getData_inicio());
				if ((data.get(Calendar.DAY_OF_YEAR) >= filtro_inicio.get(Calendar.DAY_OF_YEAR)) && (data.get(Calendar.DAY_OF_YEAR) <= filtro_fim.get(Calendar.DAY_OF_YEAR))) {
					total += anuncio.max_views();
				}
			}
		} else { //filtragem por cliente 
			for (Anuncio anuncio : anuncios) {
				if (anuncio.getCliente().equals(cliente)) { 
					total += anuncio.max_views();			
				}
			}
		}
		return total;
	}
	
	public double max_clicks() {
		double total = 0.0; 
		if (filtro == 0) { //filtragem geral
			for (Anuncio anuncio : anuncios) {
				total += anuncio.max_clicks();
			}
		} else if (filtro == 1) { //filtragem por intervalo de tempo 
			Calendar filtro_inicio = Calendar.getInstance(); 
			Calendar filtro_fim = Calendar.getInstance(); 
			Calendar data = Calendar.getInstance(); 
			filtro_inicio.setTime(data_inicio);
			filtro_fim.setTime(data_fim);
			for (Anuncio anuncio : anuncios) {
				data.setTime(anuncio.getData_inicio());
				if ((data.get(Calendar.DAY_OF_YEAR) >= filtro_inicio.get(Calendar.DAY_OF_YEAR)) && (data.get(Calendar.DAY_OF_YEAR) <= filtro_fim.get(Calendar.DAY_OF_YEAR))) {
					total += anuncio.max_clicks();
				}
			}
		} else { //filtragem por cliente 
			for (Anuncio anuncio : anuncios) {
				if (anuncio.getCliente().equals(cliente)) { 
					total += anuncio.max_clicks();			
				}
			}
		}
		return total;
	}
	
	public double max_sharing() {
		double total = 0.0; 
		if (filtro == 0) { //filtragem geral
			for (Anuncio anuncio : anuncios) {
				total += anuncio.max_sharing();
			}
		} else if (filtro == 1) { //filtragem por intervalo de tempo 
			Calendar filtro_inicio = Calendar.getInstance(); 
			Calendar filtro_fim = Calendar.getInstance(); 
			Calendar data = Calendar.getInstance(); 
			filtro_inicio.setTime(data_inicio);
			filtro_fim.setTime(data_fim);
			for (Anuncio anuncio : anuncios) {
				data.setTime(anuncio.getData_inicio());
				if ((data.get(Calendar.DAY_OF_YEAR) >= filtro_inicio.get(Calendar.DAY_OF_YEAR)) && (data.get(Calendar.DAY_OF_YEAR) <= filtro_fim.get(Calendar.DAY_OF_YEAR))) {
					total += anuncio.max_sharing();
				}
			}
		} else { //filtragem por cliente 
			for (Anuncio anuncio : anuncios) {
				if (anuncio.getCliente().equals(cliente)) { 
					total += anuncio.max_sharing();			
				}
			}
		}
		return total;
	}

}
