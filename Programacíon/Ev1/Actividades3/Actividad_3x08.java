package Actividades_3;

import java.util.Scanner;

public class Actividad_3x08 {

	public static void main(String[] args) {
		Scanner Teclado = new Scanner (System.in);
		
		double n1, n2, n3, suma;
		
		System.out.println("¿Longitud del lado A?");
		n1 = Teclado.nextDouble();
		System.out.println("¿Longitud del lado B?");
		n2 = Teclado.nextDouble();
		System.out.println("¿Longitud del lado C?");
		n3 = Teclado.nextDouble();
		
		suma = n1 + n2;
		
		if(suma < n3) {
			System.out.println("La suma de los dos lados debe ser mayor que el tercer lado");
		}
		
		if(n1 == n2 && n2 == n3) {
			System.out.println("Triangulo Equilatero");
		}else if(n1 == n2 || n2 == n3 || n1 == n3) {
			System.out.println("Triangulo Isosceles");
		}else {
			System.out.println("Triangulo Escaleno");
		}
	}
}
