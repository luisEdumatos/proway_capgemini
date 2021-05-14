package services;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.List;

import entities.Anuncio;

public class Salva {
	
	public static void salvaAnuncios(List<Anuncio> anuncios) {
		
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		
		String path = "bd.txt";
		String nome; 
		String cliente; 
		String dataInicio; 
		String dataFim; 
		String investimento; 
		
		try (BufferedWriter bw = new BufferedWriter(new FileWriter(path))) { 
			for (Anuncio anuncio : anuncios) {
				nome = anuncio.getNome(); 
				cliente = anuncio.getCliente(); 
				dataInicio = sdf.format(anuncio.getDataInicio()); 
				dataFim = sdf.format(anuncio.getDataFim()); 
				investimento = String.valueOf(anuncio.getInvestimento()); 
				bw.write(nome); 
				bw.newLine();
				bw.write(cliente); 
				bw.newLine();
				bw.write(dataInicio); 
				bw.newLine();
				bw.write(dataFim); 
				bw.newLine();
				bw.write(investimento); 
				bw.newLine();
			}
		}
		catch (IOException e){ 
			e.printStackTrace();
		}
	}
}
