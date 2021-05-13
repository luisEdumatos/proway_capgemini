package services;

import java.util.Date;
import java.util.concurrent.TimeUnit;

public class Calculadora {
	
	public static double valorTotal(double investimento, Date data_fim, Date data_inicio) { 
		int dias = (int)(TimeUnit.MILLISECONDS.toDays(data_fim.getTime() - data_inicio.getTime())); 
		return dias*investimento; 
	}

	
	public static double max_views(double investimento) {
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
	
	
	public static double max_clicks(double investimento) {
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
	
	public static double max_sharing(double investimento) {
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

}
