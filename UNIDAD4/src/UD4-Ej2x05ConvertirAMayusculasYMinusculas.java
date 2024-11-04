package Ej2x05;

import java.util.Scanner;

public class Ej2x05 {
	
	public static String leerFrase() {
		final int LONGITUD_MAX = 60;
		String frase;
		Scanner teclado = new Scanner(System.in);
		int longitud;
		
		do {
			System.out.print("Escriba una frase de longitud maxima " + LONGITUD_MAX);
			frase = teclado.nextLine();
			longitud = frase.length();
				if (longitud > LONGITUD_MAX) {
					System.out.println("La frase debe tener longitud maxima: " + LONGITUD_MAX);
					System.out.println();
				}
		}while (longitud > LONGITUD_MAX);
		
		return frase;
	}
	
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		String frase;
		int opcion;
		
		do {
			opcion = menu(teclado);
			
			switch (opcion) {
				case 1:
					frase = leerFrase();
					String mayusculas = frase.toUpperCase();
					System.out.println("Frase en mayusculas " + mayusculas);
					break;
				
				case 2:
					frase = leerFrase();
					String minusculas = frase.toLowerCase();
					System.out.println("Frase en minusculas: " + minusculas);
					break;	
			}
			
		}while (opcion != 0);
	}

	private static int menu(Scanner teclado) {
		int opcion;
		System.out.println("Opcion 0: Salir del programa");
		System.out.println("Opcion 1: Mayusculas");
		System.out.println("Opcion 2: Minusculas");
		opcion = teclado.nextInt();
		return opcion;
	}
}
