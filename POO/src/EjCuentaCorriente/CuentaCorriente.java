package CuentaCorriente;

import java.util.Scanner;

public class CuentaCorriente {

	private String numCuenta;
	private double saldo;
	
	public CuentaCorriente (String numCuenta) {
		this.numCuenta = numCuenta;
	}
	
	public void ingresaEfectivo (double cantidad) {
		if (cantidad > 0) {
			saldo += cantidad;
			System.out.println("Se han ingresado " + cantidad + " €, saldo total: " + saldo); 
		} else {
			System.out.println("No se puede ingresar una cantidad negativa");
		}
	}
	
	public boolean retiraEfectivo (double cantidad) {
		if (cantidad < saldo) {
			saldo -= cantidad;
			System.out.println("Se retiraron " + cantidad + " €, saldo restante: " + saldo);
			return true;
		} else {
			System.out.println("No se puede retirar mas cantidad que saldo haya en la cuenta");
			return false;
		}
	}
	
	public String Visualiza () {
		return "numero de cuenta " + numCuenta + " y saldo actual "
				+ saldo;
	}
	
}
