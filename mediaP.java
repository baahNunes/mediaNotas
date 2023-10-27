import java.util.Scanner;

public class mediaP {
	/**
	 * @param args
	 */
	public static void main(String[] args) {

		int indice, cont, limite, c = 1;
		float num, soma, media;

		float[] notas = new float[5];

		indice = 0;
		cont = 0;
		soma = 0;
		while (indice < 5) {

			System.out.println("Informe nota " + (indice + 1));
			try (Scanner sc = new Scanner(System.in)) {
				notas[indice] = sc.nextFloat();
			}
			if (notas[indice] > 0) {

				cont = cont + 1;
				soma = soma + notas[indice];
			}
			indice = indice + 1;
		}
		if (soma == 0) {
			System.out.println("Não há valores para calculo");
			return;
		}

		media = soma / cont;
		System.out.println("\nMedia: " + media);
		indice = 0;
		while (indice < 5) {

			System.out.println("\nNota " + (indice + 1 + " ") + notas[indice]);
			indice++;

		}

	}
}