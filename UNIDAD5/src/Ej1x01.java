package VectoresUd5;

import entrada.Teclado;

public class Ej1x01 {

	/*
	 * Lee por teclado un vector de numeros enteros
	 */
	public static void leerVector(int[]v) {
		for (int i = 0; i < v.length; i++) {
			v[i] = Teclado.leerEntero("Numero Enrero " + i + "?");
		}
	}
	
	public static void escribirVector(int[]vector) {
		System.out.print("[");
		for (int i = 0; i < vector.length; i++) {
			System.out.print(vector[i]);
			if(i != vector.length - 1) {
				System.out.print(", ");
			}
		}
		System.out.print("]");
	}
	
	public static void main (String[]args) {
		final int LONGITUD = 10;
		int [] vector = new int[LONGITUD];
		//Rellena el vector con LONGITUD numeros
		leerVector(vector);
		//Saca por pantalla el vector
		System.out.print("Vector:");
		escribirVector(vector);
	}
}
