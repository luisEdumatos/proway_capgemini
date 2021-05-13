package view;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

import entities.Anuncio;
import services.Exibir;

public class MenuRelatorios {

	private static SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
	
	public static void menuRelatorios(List<Anuncio> anuncios, Scanner sc) throws ParseException { 
		
		Date dataInicio = new Date();
		Date dataFim = new Date();
		String cliente = "Cliente";
		int aux = 0;
		int aux2 = 1;

		while (aux2 == 1) {
			System.out.println();
			System.out.println("*************MENU DE RELATORIOS****************");
			System.out.println("Digite a opção de relatório que deseja obter: ");
			System.out.println("(1) - Exibir todos anuncios");
			System.out.println("(2) - Filtrar por intervalo de tempo");
			System.out.println("(3) - Filtrar por nome do cliente");
			System.out.println("(4) - Voltar ao cadastro de anuncios");
			aux = sc.nextInt();
			if (aux == 1) {
				Exibir.imprimeAnuncio(anuncios, aux, dataInicio, dataFim, cliente); 
			} else if (aux == 2) {
				System.out.println("Digite o intervalo de tempo que deseja filtrar os relatórios existentes");
				System.out.print("Relatórios que iniciam a partir de: (dd/MM/yyyy) -> ");
				dataInicio = sdf.parse(sc.next());
				System.out.print("E que iniciam antes de: (dd/MM/yyyy) ->");
				dataFim = sdf.parse(sc.next());
				Exibir.imprimeAnuncio(anuncios, aux, dataInicio, dataFim, cliente);
			} else if (aux ==3) {
				System.out.print("Digite o nome do cliente que deseja filtrar os relatórios existentes: ");
				sc.nextLine();
				cliente = sc.nextLine();
				Exibir.imprimeAnuncio(anuncios, aux, dataInicio, dataFim, cliente);
			} else { 
				MenuCadastro.menuCadastro(anuncios, sc);
			}
			
			System.out.println("Deseja consultar mais algum relatório? Sim, digite 1. Não, digite 0");
			aux2 = sc.nextInt(); 
		}

	}
}
