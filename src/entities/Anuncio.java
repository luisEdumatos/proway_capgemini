package entities;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;

public class Anuncio {
	private String nome;
	private String cliente;
	private Date dataInicio;
	private Date dataFim;
	private double investimento;
	private double valorTotal;
	private double maxViews;
	private double maxClicks;
	private double maxSharing;
	private int numDias; 

	private static SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

	public Anuncio(String nome, String cliente, Date dataInicio, Date dataFim, double investimento, double valorTotal, double maxViews, double maxClicks, double maxSharing) {
		this.nome = nome;
		this.cliente = cliente;
		this.dataInicio = dataInicio;
		this.dataFim = dataFim;
		this.investimento = investimento;
		this.valorTotal = valorTotal; 
		this.maxViews = maxViews;
		this.maxClicks = maxClicks; 
		this.maxSharing = maxSharing; 
		numDias = (int)(TimeUnit.MILLISECONDS.toDays(dataFim.getTime() - dataInicio.getTime())); 
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

	public Date getDataInicio() {
		return dataInicio;
	}

	public void setDataInicio(Date dataInicio) {
		this.dataInicio = dataInicio;
	}

	public Date getDataFim() {
		return dataFim;
	}

	public void setDataFim(Date dataFim) {
		this.dataFim = dataFim;
	}

	public double getInvestimento() {
		return investimento;
	}

	public void setInvestimento(double investimento) {
		this.investimento = investimento;
	}
	
	
	@Override
	public String toString() { 
		return "---------------------------" +
			   "\nNome: " + nome +  
		       "\nCliente: " + cliente +  
		       "\nData inicio: " + sdf.format(getDataInicio()) + 
		       "\nData fim: " + sdf.format(getDataFim()) + 
		       "\nValor total: " + valorTotal + 
		       "\nMáximo de visualizações: " + numDias*maxViews + 
		       "\nMáximo de cliques: " + numDias*maxClicks + 
		       "\nMáximo de compartilhamentos: " + numDias*maxSharing+ 
		       "\n---------------------------";
	}
}
