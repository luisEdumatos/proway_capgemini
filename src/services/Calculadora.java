package services;

import java.util.Date;
import java.util.concurrent.TimeUnit;

public class Calculadora {
	
	public static double valorTotal(double investimento, Date dataFim, Date dataInicio) { 
		int dias = (int)(TimeUnit.MILLISECONDS.toDays(dataFim.getTime() - dataInicio.getTime())); 
		return dias*investimento; 
	}

	
	public static double maxViews(double investimento) {
		double numView = 0.0;
		double numClicks = 0.0;
		double numSharing = 0.0;
		double auxView;

		numView += 30 * investimento;
		auxView = numView;

		// Regra para o numero maximo de compartilhamentos (4)
		for (int i = 0; i < 4; i++) {
			numClicks = (auxView / 100) * 12;
			numSharing = (numClicks / 20) * 3;
			numView += numSharing * 40;
			auxView = numSharing * 40;
		}
		
		return Math.round(numView);
	}
	
	
	public static double maxClicks(double investimento) {
		double numView = 0.0;
		double numClicks = 0.0;
		double numSharing = 0.0;
		double auxClicks = 0.0;

		numView += 30 * investimento;
	
		// Regra para o numero maximo de compartilhamentos (4)
		for (int i = 0; i < 4; i++) {
			numClicks = (numView / 100) * 12;
			numSharing = (numClicks / 20) * 3;
			numView = numSharing * 40;
			auxClicks += numClicks; 
		}
		
		return Math.round(auxClicks);
	}
	
	public static double maxSharing(double investimento) {
		double numView = 0.0;
		double numClicks = 0.0;
		double numSharing = 0.0;
		double auxSharing = 0.0;
		numView += 30 * investimento;
	
		// Regra para o numero maximo de compartilhamentos (4)
		for (int i = 0; i < 4; i++) {
			numClicks = (numView / 100) * 12;
			numSharing = (numClicks / 20) * 3;
			numView = numSharing * 40;
			auxSharing += numSharing; 
		}
		
		return Math.round(auxSharing);
	}
	
	public static int validaData (Date dataInicio, Date dataFim) { 
		return (int)(TimeUnit.MILLISECONDS.toDays(dataFim.getTime() - dataInicio.getTime())); 
	}

}
