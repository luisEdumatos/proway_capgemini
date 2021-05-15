package view;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

import entities.Anuncio;
import services.Calculadora;
import services.Exibir;

public class MenuRelatorios {

	private static SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
	private static Date dataInicio = new Date();
	private static Date dataFim = new Date();
	private static String cliente = "Cliente";
	
	public static void menuRelatorios(List<Anuncio> anuncios, Scanner sc) throws ParseException { 
		
		int aux = 0;
		int aux2 = 1;

		while (aux2 == 1) {
			System.out.println();
			System.out.println("*************MENU SISTEMA DE ANUNCIOS****************");
			System.out.println("Digite a opção que deseja obter: ");
			System.out.println("(1) - Exibir todos anuncios");
			System.out.println("(2) - Filtrar anuncios por intervalo de tempo");
			System.out.println("(3) - Filtrar anuncios por nome do cliente");
			System.out.println("(4) - Cadastro de anuncios");
			aux = sc.nextInt();
			while (aux > 4 || aux < 1) { 
				System.out.println();
				System.out.println("**Atenção**: Você digitou uma opção inválida");
				System.out.println("Por gentileza, digite uma das opções existentes no menu de relatórios. ");
				aux = sc.nextInt();
			}
			
			if (aux == 1) {
				Exibir.imprimeAnuncio(anuncios, aux, dataInicio, dataFim, cliente); 
			} else if (aux == 2) {
				System.out.println("Digite o intervalo de tempo que deseja filtrar os relatórios existentes");
				System.out.print("Relatórios que iniciam a partir de: (dd/MM/yyyy) -> ");
				dataInicio = sdf.parse(sc.next());
				System.out.print("E que iniciam antes de: (dd/MM/yyyy) ->");
				dataFim = sdf.parse(sc.next());
				while (Calculadora.validaData(dataInicio, dataFim)) {
					System.out.println();
					System.out.println("Atenção: Você digitou uma data final anterior a data inicial.");
					System.out.println("Por gentileza, digite as datas corretas: ");
					System.out.print("Relatórios que iniciam a partir de: (dd/MM/yyyy) -> ");
					dataInicio = sdf.parse(sc.next());
					System.out.print("E que iniciam antes de: (dd/MM/yyyy) ->");
					dataFim = sdf.parse(sc.next());
				}
				Exibir.imprimeAnuncio(anuncios, aux, dataInicio, dataFim, cliente);
			} else if (aux == 3) {
				System.out.print("Digite o nome do cliente que deseja filtrar os relatórios existentes: ");
				sc.nextLine();
				cliente = sc.nextLine();
				Exibir.imprimeAnuncio(anuncios, aux, dataInicio, dataFim, cliente);
			} else { 
				MenuCadastro.menuCadastro(anuncios, sc);
			} 
			
			System.out.println("Deseja voltar ao menu de opções do sistema? Sim, digite 1. Não, digite 0");
			aux2 = sc.nextInt(); 
			while (aux2 != 1 && aux2 != 0) { 
				System.out.println();
				System.out.println("**Atenção**: Você digitou uma opção inválida");
				System.out.println("Por gentileza, digite uma das opções existentes. ");
				System.out.println();
				System.out.println("Deseja voltar ao menu de opções do sistema? Sim, digite 1. Não, digite 0");
				aux2 = sc.nextInt();
			}
			if (aux2 == 0) { 
				System.out.println();
				System.out.println("Obrigado por utilizar nosso sistema de anuncios, volte sempre! ");
				System.out.println();
			}
		}

	}
}
