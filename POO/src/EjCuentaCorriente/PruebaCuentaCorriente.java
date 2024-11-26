package CuentaCorriente;

import java.util.Scanner;

public class PruebaCuentaCorriente {

	public static void main (String[] args) {
		Scanner teclado = new Scanner (System.in);
		int opcion;
		CuentaCorriente Cuenta1 = new CuentaCorriente ("001");
		CuentaCorriente Cuenta2 = new CuentaCorriente ("002");
		double ingresar;
		double retirar;
		
		do {
			System.out.println("Opcion 1: Ingresar en la cuenta 001");
			System.out.println("Opcion 2: Ingresar en la cuenta 002");
			System.out.println("Opcion 3: Retirar en la cuenta 001");
			System.out.println("Opcion 4: Retirar en la cuenta 002");
			System.out.println("Opcion 5: Visualizar ambas cuentas");
			System.out.println("Opcion 6: Fin");
			System.out.println("Elija una opcion:");
			opcion = teclado.nextInt();
			
			switch (opcion) {
			case 1:
				//Pedir por teclado la cantidad a ingresar
				System.out.println("Introduce la cantidad a ingresar:");
				ingresar = teclado.nextDouble();
				Cuenta1.ingresaEfectivo(ingresar);
				break;
			case 2:
				//Pedir por teclado la cantidad a ingresar
				System.out.println("Introduce la cantidad a ingresar:");
				ingresar = teclado.nextDouble();
				Cuenta2.ingresaEfectivo(ingresar);
				break;
			case 3:
				//Pedir por teclado la cantiad a retirar
				System.out.println("Introduce la cantidad a retirar:");
				retirar = teclado.nextDouble();
				Cuenta1.retiraEfectivo(retirar);
				break;
			case 4:
				//Pedir por teclado la cantiad a retirar
				System.out.println("Introduce la cantidad a retirar:");
				retirar = teclado.nextDouble();
				Cuenta2.retiraEfectivo(retirar);
				break;
			case 5:
				System.out.println("Visualizando ambas cuentas:");
				Cuenta1.Visualiza();
				Cuenta2.Visualiza();
				break;
			case 6:
				System.out.println("Saliendo...");
				break;
				default:
			}
			
		}while (opcion != 6);
		
			
		/*
		CuentaCorriente Cuenta = new CuentaCorriente("8735198274831634");
		
		//Pedir por teclado la cantidad a ingresar
		double ingresar;
		System.out.println("Introduce la cantidad a ingresar:");
		ingresar = teclado.nextDouble();
		Cuenta.ingresaEfectivo(ingresar);
		
		//Pedir por teclado la cantiad a retirar
		double retirar;
		System.out.println("Introduce la cantidad a retirar:");
		retirar = teclado.nextDouble();
		Cuenta.retiraEfectivo(retirar);
		
		Cuenta.Visualiza();*/
	}
}
