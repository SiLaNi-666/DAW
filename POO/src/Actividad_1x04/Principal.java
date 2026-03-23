package Actividad_1x04;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import entrada.Teclado;

public class Principal {

	public static int escribirMenuOpciones() {
		int opcion;

		System.out.println("0) Salir del programa");
		System.out.println("1) Creacion del hormiguero");
		System.out.println("2) Añadir una hormiga");
		System.out.println("3) Sacar hormigas a por comida");
		opcion = Teclado.leerEntero("Elige una opcion:");
		System.out.println();

		return opcion;
	}

	public static void main(String[] args) {

		int opcion;

		do {

			opcion = escribirMenuOpciones();
			try {
				switch (opcion) {
				case 0:
					System.out.println("Saliendo del programa...");

				case 1:

				}
				
			} catch (IOException ioe) {
				System.out.println( ioe.getMessage());
				ioe.printStackTrace();
			}
		} while (opcion != 0);

	}

}
