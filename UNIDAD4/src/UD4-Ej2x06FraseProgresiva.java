package Ej2x06;

import entrada.Teclado;

public class Ej2x06 {

	
	
	public static String leerFrase() {
		final int LONGITUD_MAX = 40;
		int longitud_min = 5;
		String frase;
		int longitud;
		
		do {
			frase = Teclado.leerCadena("¿Frase?");
			longitud = frase.length();
				if (frase.length() < 5 && frase.length() > 40) {
					
				} else {
					System.out.println("La frase debe de tener 5 caracteres como minimo");
					System.out.println("La frase debe de tener 40 caracteres como maximo");
				}
		}while (longitud < longitud_min || longitud > LONGITUD_MAX);
		
		return frase;
	}
	
	public static void main (String[] args) {
		//System.out.println(leerFrase());
		String frase;
		
		
		
	}
	
}
