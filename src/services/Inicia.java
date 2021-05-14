package services;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import entities.Anuncio;

public class Inicia {

	public static void iniciaAnuncios(List<Anuncio> anuncios) throws ParseException {
		// TODO Auto-generated method stub

		String path = "bd.txt";
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		String line = "Inicio";
		String nome;
		String cliente;
		Date dataInicio;
		Date dataFim;
		double investimento;

		try (BufferedReader br = new BufferedReader(new FileReader(path))) {
			while (line != null) {
				line = br.readLine();
				if (line != null) {
					nome = line;
					line = br.readLine();
					cliente = line;
					line = br.readLine();
					dataInicio = sdf.parse(line);
					line = br.readLine();
					dataFim = sdf.parse(line);
					line = br.readLine();
					investimento = Double.parseDouble(line);
					anuncios.add(new Anuncio(nome, cliente, dataInicio, dataFim, investimento, Calculadora.valorTotal(investimento, dataFim, dataInicio), Calculadora.maxViews(investimento), Calculadora.maxClicks(investimento), Calculadora.maxSharing(investimento)));
				}
			}
		} catch (IOException e) {
			System.out.println("Error: " + e.getMessage());
		}

	}
}
