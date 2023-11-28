package ud2ED;

import java.util.Scanner;

public class Ej3Examen {
	static Scanner entrada = new Scanner(System.in);

	public static void main(String[] args) {

		int[] edades = new int[10];

		pedirEdades(edades);

		double media = calcularEdadMedia(edades);

		int jubilados = PersonasenEdaddeJubulación(edades);

		int trabajadores = 10 - jubilados;

		System.out.println("La media de edad es de: " + media);

		System.out.println("El total de jubilados son: " + jubilados);

		System.out.println("El total de trabajadores son: " + trabajadores);

	}

	public static void pedirEdades(int[] edades) {

		for (int i = 0; i < edades.length; i++) {
			System.out.println("Introduce las edades");
			edades[i] = entrada.nextInt();
			while (edades[i] < 18 || edades[i] > 99) {
				System.out.println("Error, edad no valida introduzcala de nuevo");
				edades[i] = entrada.nextInt();
			}
		}
	}

	public static double calcularEdadMedia(int[] edades) {
		double suma = 0;
		for (int i = 0; i < edades.length; i++) {

			suma = suma + edades[i];
		}
		return suma / edades.length;
	}

	public static int PersonasenEdaddeJubulación(int[] edades) {
		int cont = 0;
		for (int i = 0; i < edades.length; i++) {
			if (edades[i] >= 65)
				cont++;
		}
		return cont;
	}

}
