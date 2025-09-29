package Actividades_3;

import java.util.Scanner;

public class Actividad_3x07 {

	public static void main(String[] args) {
		Scanner Teclado = new Scanner (System.in);
		
		double nota;
		
		System.out.println("¿Nota?");
		nota = Teclado.nextDouble();
		
		if(nota < 0 && nota > 10) {
			System.out.println("La nota debe estar comprendida entre 0 y 10");
		}
		
		if(nota ==0 && nota <1.5){
			System.out.println("Muy deficiente");
		}else if(nota >= 1.5 && nota < 3.5) {
			System.out.println("Deficiente");
		}else if(nota >= 3.5 && nota < 5) {
			System.out.println("Insuficiente");
		}else if(nota >= 5 && nota < 5.5) {
			System.out.println("Suficiente");
		}else if(nota >= 5.5 && nota < 6.5) {
			System.out.println("Bien");
		}else if(nota >= 6.5 && nota < 8.5) {
			System.out.println("Notable");
		}else if(nota >= 8.5 && nota < 10) {
			System.out.println("Sobresaliente");
		}else if (nota == 10) {
			System.out.println("Matricula de honor");
		}
		
		
	}

}
