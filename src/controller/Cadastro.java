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
	
	public static void cadastraAnuncio(List<Anuncio> anuncios, int numAnuncios, Scanner sc) throws ParseException {

		for (int i = 0; i < numAnuncios; i++) {
			System.out.println("\nVamos cadastrar o " + (i+1) + "º anúncio");
			System.out.print("Nome do anuncio: ");
			sc.nextLine();
			String nome = sc.nextLine();
			System.out.print("Nome do cliente: ");
			String cliente = sc.nextLine();
			System.out.print("Data de inicio (dd/mm/yyyy): ");
			Date dataInicio = sdf.parse(sc.next());
			System.out.print("Data de término (dd/mm/yyyy): ");
			Date dataFim = sdf.parse(sc.next());
			while (Calculadora.validaData(dataInicio, dataFim)) {
				System.out.println();
				System.out.println("**Atenção**: Você digitou uma data final anterior a data inicial.");
				System.out.println("Por gentileza, digite as datas corretas: ");
				System.out.print("Data de inicio (dd/mm/yyyy): ");
				dataInicio = sdf.parse(sc.next());
				System.out.print("Data de término (dd/mm/yyyy): ");
				dataFim = sdf.parse(sc.next());
			}
			System.out.print("Investimento por dia (R$): ");
			double investimento = sc.nextDouble();
			anuncios.add(new Anuncio(nome, cliente, dataInicio, dataFim, investimento, Calculadora.valorTotal(investimento, dataFim, dataInicio), Calculadora.maxViews(investimento), Calculadora.maxClicks(investimento), Calculadora.maxSharing(investimento)));
		}
	}
}
