package view;

import java.text.ParseException;
import java.util.List;
import java.util.Scanner;

import controller.Cadastro;
import entities.Anuncio;

public class MenuCadastro {

	public static void menuCadastro(List<Anuncio> anuncios, Scanner sc) throws ParseException { 
		int numAnuncios;
		int aux = 1;

		System.out.println();
		System.out.println("----------------SISTEMA DE CADASTRO DE ANUNCIOS---------------------");
		System.out.print("Digite a quantidade de anuncios que deseja cadastrar neste momento: ");
		numAnuncios = sc.nextInt();
		if (numAnuncios <=0) {
			aux = 0; 
			System.out.println();
			System.out.println("Você optou por não cadastrar um novo anuncio");
			System.out.println();
		}
		while (aux == 1) {
			Cadastro.cadastraAnuncio(anuncios, numAnuncios, sc);
			System.out.println("Deseja cadastrar novos anuncios? Sim, digite 1. Não, digite 0");
			aux = sc.nextInt();
			while (aux != 1 && aux != 0) { 
				System.out.println();
				System.out.println("**Atenção**: Você digitou uma opção inválida");
				System.out.println("Por gentileza, digite uma das opções existentes. ");
				System.out.println();
				System.out.println("Deseja cadastrar novos anuncios? Sim, digite 1. Não, digite 0");
				aux = sc.nextInt();
			}
			if (aux == 1) {
				System.out.print("Digite a quantidade de anuncios que deseja cadastrar neste momento: ");
				numAnuncios = sc.nextInt();
			}
		}
	}
}
