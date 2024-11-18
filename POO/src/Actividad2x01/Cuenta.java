package Ejercicio2x01;

public class Cuenta {
	//Atributos de la cuenta
	private int numero;
	private String cliente;
	private double saldo; //en euros
	
	//Crear una cuenta a partir de 2 parametros 
	public Cuenta (int numero_, String cliente_) {
		numero = numero_;
		cliente = cliente_;
		saldo = 0; 
	}
	
	
	@Override
	//ObtenerEstado - Devuelve una cadena de caracteres con el estado de la cuenta bancaria
	public String toString() {
		return "Cuenta [numero=" + numero + ", cliente=" + cliente + ", saldo=" + String.format("%.2f", saldo) + "]";
	}
	
	//Ingresa un importe en la cuenta bancaria
	//Devuelve true si el ingreso se ha realizado correctamente
	//Devuelve false en caso contrario
	public boolean ingresar (double importe) {
		boolean ingreso = false;
		if (importe > 0) {
			saldo = saldo + importe;
			ingreso = true;
		}
		return ingreso;
	}
	
	//Hacer un retiro de la cuenta bancaria
	//Devuelve true si el retiro se ha realizado correctamente
	//Devuelve false en caso contrario
	public boolean retirar (double importe) {
		boolean retiro = false;
		if (importe > 0 && importe <= saldo) {
			saldo = saldo - importe;
			retiro = true;
		}
		return retiro;
	}
	
	public boolean transferir (double importe, Cuenta destino) {
		 boolean transferido = false;
		if (importe > 0 && importe <= saldo) {
			saldo = saldo - importe;
			destino.saldo = destino.saldo + importe;
			transferido = true;
		}
		return transferido;
	}
	
	public static void main (String[] args) {
		Cuenta cuenta1 = new Cuenta (1,"Francisco");
		cuenta1.ingresar(78);
		cuenta1.retirar(50);

		System.out.println(cuenta1);
		
		Cuenta cuenta2 = new Cuenta (2,"Victoria");
		cuenta1.transferir(10, cuenta2);
		System.out.println(cuenta1);
		System.out.println(cuenta2);
	}

}

