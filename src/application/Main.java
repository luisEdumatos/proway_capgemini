package application;

import java.text.ParseException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import entities.Anuncio;
import view.MenuCadastro;
import view.MenuRelatorios;

public class Main {

	static List<Anuncio> anuncios = new ArrayList<>();
	
	public static void main(String[] args) throws ParseException {
		Scanner sc = new Scanner(System.in);
		
		MenuCadastro.menuCadastro(anuncios, sc);
		MenuRelatorios.menuRelatorios(anuncios, sc);

		sc.close();
	}

}
