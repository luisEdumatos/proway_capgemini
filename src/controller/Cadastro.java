package controller;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

import entities.Anuncio;
import services.Calculadora;

public class Cadastro {

	private static SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
	
	public static void cadastraAnuncio(List<Anuncio> anuncios, int num_anuncios, Scanner sc) throws ParseException {

		for (int i = 0; i < num_anuncios; i++) {
			System.out.println("\nVamos cadastrar o " + (i+1) + "º anúncio");
			System.out.print("Nome do anuncio: ");
			sc.nextLine();
			String nome = sc.nextLine();
			System.out.print("Nome do cliente: ");
			String cliente = sc.nextLine();
			System.out.print("Data de inicio (dd/mm/yyyy): ");
			Date data_inicio = sdf.parse(sc.next());
			System.out.print("Data de término (dd/mm/yyyy): ");
			Date data_fim = sdf.parse(sc.next());
			System.out.print("Investimento por dia (R$): ");
			double investimento = sc.nextDouble();
			anuncios.add(new Anuncio(nome, cliente, data_inicio, data_fim, investimento, Calculadora.valorTotal(investimento, data_fim, data_inicio), Calculadora.max_views(investimento), Calculadora.max_clicks(investimento), Calculadora.max_sharing(investimento)));
		}
	}
}
