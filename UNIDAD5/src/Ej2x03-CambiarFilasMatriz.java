package VectoresUd5;

import java.util.Arrays;
import java.util.Random;

import entrada.Teclado;

public class Ej2x03 {

	public static int [][] rellenar (int filas, int columnas, int limiteInf, int limiteSup){
	    int [][] m = new int[filas][columnas];
	    Random random = new Random();
	    for (int i = 0; i < filas; i++) {
	        for (int j = 0; j < columnas; j++) {
	            m[i][j] = random.nextInt(limiteSup - limiteInf + 1) + limiteInf;
	        }
	    }
	    return m;
	}
	
	public static void escribirMatriz(int [][]m){
		for (int i = 0; i < m.length; i++) {
			System.out.println(Arrays.toString(m[i]));
		}
	}
	
	
	public static void main(String[]args){
	    int filas = 8;
	    int columnas = 8;
	    int limiteInf = 1;
	    int limiteSup = 100;
	    int [][] m = rellenar (filas, columnas, limiteInf, limiteSup);
	    System.out.println("Matriz:");
		
		
		int fila = Teclado.leerEntero("¿Fila1?");
		if (fila < 0 || fila > 7) {
			System.out.println("La fila debe estar comprendida entre 0 y 7");
		}
	}
}
