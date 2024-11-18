package Ejercicio2x01;

import java.util.Scanner;
import entrada.Teclado;

public class Actividad2x01 {
	/*crear funcion para el menu
	public static int escribirMenu() {
		
	}*/
	
	public static void main (String[] args) {
		Scanner teclado = new Scanner(System.in);
		int opcion;
		double importe;
		Cuenta cuentaBancaria1 = new Cuenta(1, "Francisco Gomez");
		System.out.println("Se ha creado la cuenta bancaria 1");
		
		Cuenta cuentaBancaria2 = new Cuenta(2, "Victoria");
		do {
			System.out.println("Opcion 0: Salir del programa");
			System.out.println("Opcion 1: Visualizar en consola las dos cuentas");
			System.out.println("Opcion 2: Visualizar en consola las dos cuentas");
			System.out.println("Opcion 3: Retirar un importe de la cuenta 1.");
			System.out.println("Opcion 4: Ingresar un importe en la cuenta 2");
			System.out.println("Opcion 5: Retirar un importe de la cuenta 2.");
			System.out.println("Opcion 6: Transferir un importe de la cuenta 1 a la cuenta 2");
			System.out.println("Opcion 7: Transferir un importe de la cuenta 2 a la cuenta 1");
			opcion = teclado.nextInt();
			switch(opcion) {
				case 0:
					break;
					
				case 1:
					System.out.println(cuentaBancaria1);
					System.out.println(cuentaBancaria2);
					break;
				case 2:
					importe = Teclado.leerReal("Cantidad a ingresar?");
					if (cuentaBancaria1.ingresar(importe)) {
						System.out.println("Se ha ingresado un importe en la cuenta bancaria");
					}
			}
			
		}while (opcion != 7); 
	}
}
