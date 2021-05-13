package application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

import entities.Anuncio;
import services.Calculadora;

public class Main {

	static List<Anuncio> anuncios = new ArrayList<>();
	
	public static void main(String[] args) throws ParseException {
		// TODO Auto-generated method stub
		
		//Testando commit

		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		Scanner sc = new Scanner(System.in);
		
		int num_anuncios;
		int aux = 1;

		/*************************CADASTRO DE ANUNCIOS*********************************************/
		System.out.println("Digite a quantidade de anuncios que deseja cadastrar neste momento: ");
		num_anuncios = sc.nextInt();
		while (aux == 1) {
			cadastraAnuncio(anuncios, num_anuncios, sc);
			System.out.println("Deseja cadastrar novos anuncios? Sim, digite 1. Não, digite 0");
			aux = sc.nextInt();
			if (aux == 1) {
				System.out.println("Digite a quantidade de anuncios que deseja cadastrar neste momento: ");
				num_anuncios = sc.nextInt();
			}
		}
		aux = 0;
		/*******************************************************************************************/

		/***************************** MENU DE RELATORIOS******************************************************/
		Date data_inicio = new Date();
		Date data_fim = new Date();
		String cliente = "Cliente";
		int aux2 = 1;

		while (aux2 == 1) {
			System.out.println("Digite a opção de relatório que deseja obter: ");
			System.out.println("(1) - Exibir todos anuncios");
			System.out.println("(2) - Filtrar por intervalo de tempo");
			System.out.println("(3) - Filtrar por nome do cliente");
			aux = sc.nextInt();
			if (aux == 1) {
				imprimeAnuncio(anuncios, aux, data_inicio, data_fim, cliente);
			} else if (aux == 2) {
				System.out.println("Digite o intervalo de tempo que deseja filtrar os relatórios existentes");
				System.out.println("Relatórios que iniciam a partir de: ");
				data_inicio = sdf.parse(sc.next());
				System.out.println("E que iniciam antes de: ");
				data_fim = sdf.parse(sc.next());
				imprimeAnuncio(anuncios, aux, data_inicio, data_fim, cliente);
			} else {
				System.out.println("Digite o nome do cliente que deseja filtrar os relatórios existentes: ");
				sc.nextLine();
				cliente = sc.nextLine();
				imprimeAnuncio(anuncios, aux, data_inicio, data_fim, cliente);
			}
			/*****************************************************************************************************/
			System.out.println("Deseja consultar mais algum relatório? Sim, digite 1. Não, digite 0");
			aux2 = sc.nextInt(); 
		}

		sc.close();
	}

	public static List<Anuncio> cadastraAnuncio(List<Anuncio> anuncios, int num_anuncios, Scanner sc) throws ParseException {

		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

		for (int i = 0; i < num_anuncios; i++) {
			System.out.println("\nVamos cadastrar o " + (i+1) + "º anúncio");
			System.out.println("Nome do anuncio: ");
			sc.nextLine();
			String nome = sc.nextLine();
			System.out.println("Nome do cliente: ");
			String cliente = sc.nextLine();
			System.out.println("Data de inicio (dd/mm/yyyy): ");
			Date data_inicio = sdf.parse(sc.next());
			System.out.println("Data de término (dd/mm/yyyy): ");
			Date data_fim = sdf.parse(sc.next());
			System.out.println("Investimento por dia (R$): ");
			double investimento = sc.nextDouble();
			anuncios.add(new Anuncio(nome, cliente, data_inicio, data_fim, investimento, Calculadora.valorTotal(investimento, data_fim, data_inicio), Calculadora.max_views(investimento), Calculadora.max_clicks(investimento), Calculadora.max_sharing(investimento)));
		}

		return anuncios;
	}

	public static void imprimeAnuncio(List<Anuncio> anuncios, int filtro, Date data_inicio, Date data_fim, String cliente) {
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

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
