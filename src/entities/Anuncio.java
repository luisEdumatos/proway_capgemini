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
	private double valor_total;
	private double max_views;
	private double max_clicks;
	private double max_sharing;
	
	

	private static SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

	public Anuncio(String nome, String cliente, Date data_inicio, Date data_fim, double investimento, double valor_total, double max_views, double max_clicks, double max_sharing) {
		this.nome = nome;
		this.cliente = cliente;
		this.data_inicio = data_inicio;
		this.data_fim = data_fim;
		this.investimento = investimento;
		this.valor_total = valor_total; 
		this.max_views = max_views;
		this.max_clicks = max_clicks; 
		this.max_sharing = max_sharing; 
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
	
	
	@Override
	public String toString() { 
		int dias = (int)(TimeUnit.MILLISECONDS.toDays(getData_fim().getTime() - getData_inicio().getTime())); 
		return "---------------------------" +
			   "\nNome: " + getNome() +  
		       "\nCliente: " + getCliente() +  
		       "\nData inicio: " + sdf.format(getData_inicio()) + 
		       "\nData fim: " + sdf.format(getData_fim()) + 
		       "\nValor total: " + valor_total + 
		       "\nMáximo de visualizações: " + dias*max_views + 
		       "\nMáximo de cliques: " + dias*max_clicks + 
		       "\nMáximo de compartilhamentos: " + dias*max_sharing+ 
		       "\n---------------------------";
	}
}
