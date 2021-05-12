package application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;

import entities.Anuncio;

public class Teste {

	public static void main(String[] args) throws ParseException {
		// TODO Auto-generated method stub

		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		Scanner sc = new Scanner(System.in);
		

		System.out.println("Data de inicio: ");
		Date data_inicio = sdf.parse(sc.next());
		System.out.println("Data de término: ");
		Date data_fim = sdf.parse(sc.next());
		
		
		Calendar filtro_inicio = Calendar.getInstance();
		Calendar filtro_fim = Calendar.getInstance();
		
		filtro_inicio.setTime(data_inicio);
		filtro_fim.setTime(data_fim);
		
		long dif = data_fim.getTime() - data_inicio.getTime(); 
		int x = (int)(TimeUnit.MILLISECONDS.toDays(dif)); 
		
		System.out.println(x);
		sc.close();
	}

}
