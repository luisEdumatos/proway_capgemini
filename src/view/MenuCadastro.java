package view;

import java.text.ParseException;
import java.util.List;
import java.util.Scanner;

import controller.Cadastro;
import entities.Anuncio;

public class MenuCadastro {

	public static void menuCadastro(List<Anuncio> anuncios, Scanner sc) throws ParseException { 
		int num_anuncios;
		int aux = 1;

		/*************************CADASTRO DE ANUNCIOS*********************************************/
		System.out.println();
		System.out.println("----------------SISTEMA DE CADASTRO DE ANUNCIOS---------------------");
		System.out.print("Digite a quantidade de anuncios que deseja cadastrar neste momento: ");
		num_anuncios = sc.nextInt();
		if (num_anuncios <=0) {
			aux = 0; 
			System.out.println();
			System.out.println("Obrigado por utilizar nosso sistema, volte sempre!");
		}
		while (aux == 1) {
			Cadastro.cadastraAnuncio(anuncios, num_anuncios, sc);
			System.out.println("Deseja cadastrar novos anuncios? Sim, digite 1. Não, digite 0");
			aux = sc.nextInt();
			if (aux == 1) {
				System.out.print("Digite a quantidade de anuncios que deseja cadastrar neste momento: ");
				num_anuncios = sc.nextInt();
			}
		}
	}
}
