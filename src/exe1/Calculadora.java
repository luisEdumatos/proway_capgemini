package exe1;

import java.util.Scanner;

public class Calculadora {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		double investimento;
		double num_view = 0.0;
		double num_clicks = 0.0;
		double num_sharing = 0.0;
		double aux_view;

		System.out.println("Digite o valor investimento: ");
		investimento = sc.nextDouble();
		num_view += 30 * investimento;
		aux_view = num_view;

		// Regra para o numero maximo de compartilhamentos (4)
		for (int i = 0; i < 4; i++) {
			num_clicks = (aux_view / 100) * 12;
			num_sharing = (num_clicks / 20) * 3;
			num_view += num_sharing * 40;
			aux_view = num_sharing * 40;
		}

		System.out.println("Numero de visualizacoes total: " + Math.round(num_view));

		sc.close();

	}

}
