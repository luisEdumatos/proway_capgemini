package entities;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;

public class Anuncio {
	private String nome;
	private String cliente;
	private Date data_inicio;
	private Date data_fim;
	private double investimento;

	private static SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

	public Anuncio(String nome, String cliente, Date data_inicio, Date data_fim, double investimento) {
		this.nome = nome;
		this.cliente = cliente;
		this.data_inicio = data_inicio;
		this.data_fim = data_fim;
		this.investimento = investimento;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCliente() {
		return cliente;
	}

	public void setCliente(String cliente) {
		this.cliente = cliente;
	}

	public Date getData_inicio() {
		return data_inicio;
	}

	public void setData_inicio(Date data_inicio) {
		this.data_inicio = data_inicio;
	}

	public Date getData_fim() {
		return data_fim;
	}

	public void setData_fim(Date data_fim) {
		this.data_fim = data_fim;
	}

	public double getInvestimento() {
		return investimento;
	}

	public void setInvestimento(double investimento) {
		this.investimento = investimento;
	}
	
	public double valorTotal() { 
		int dias = (int)(TimeUnit.MILLISECONDS.toDays(getData_fim().getTime() - getData_inicio().getTime())); 
		return dias*investimento; 
	}

	public double max_views() {
		double num_view = 0.0;
		double num_clicks = 0.0;
		double num_sharing = 0.0;
		double aux_view;

		num_view += 30 * investimento;
		aux_view = num_view;

		// Regra para o numero maximo de compartilhamentos (4)
		for (int i = 0; i < 4; i++) {
			num_clicks = (aux_view / 100) * 12;
			num_sharing = (num_clicks / 20) * 3;
			num_view += num_sharing * 40;
			aux_view = num_sharing * 40;
		}
		
		return Math.round(num_view);
	}
	
	public double max_clicks() {
		double num_view = 0.0;
		double num_clicks = 0.0;
		double num_sharing = 0.0;
		double aux_clicks = 0.0;

		num_view += 30 * investimento;
	
		// Regra para o numero maximo de compartilhamentos (4)
		for (int i = 0; i < 4; i++) {
			num_clicks = (num_view / 100) * 12;
			num_sharing = (num_clicks / 20) * 3;
			num_view = num_sharing * 40;
			aux_clicks += num_clicks; 
		}
		
		return Math.round(aux_clicks);
	}
	
	public double max_sharing() {
		double num_view = 0.0;
		double num_clicks = 0.0;
		double num_sharing = 0.0;
		double aux_sharing = 0.0;

		num_view += 30 * investimento;
	
		// Regra para o numero maximo de compartilhamentos (4)
		for (int i = 0; i < 4; i++) {
			num_clicks = (num_view / 100) * 12;
			num_sharing = (num_clicks / 20) * 3;
			num_view = num_sharing * 40;
			aux_sharing += num_sharing; 
		}
		
		return Math.round(aux_sharing);
	}
	
	@Override
	public String toString() { 
		int dias = (int)(TimeUnit.MILLISECONDS.toDays(getData_fim().getTime() - getData_inicio().getTime())); 
		return "---------------------------" +
			   "\nNome: " + getNome() +  
		       "\nCliente: " + getCliente() +  
		       "\nData inicio: " + sdf.format(getData_inicio()) + 
		       "\nData fim: " + sdf.format(getData_fim()) + 
		       "\nValor total: " + valorTotal() + 
		       "\nMáximo de visualizações: " + dias*max_views() + 
		       "\nMáximo de cliques: " + dias*max_clicks() + 
		       "\nMáximo de compartilhamentos: " + dias*max_sharing() + 
		       "\n---------------------------";
	}
}
