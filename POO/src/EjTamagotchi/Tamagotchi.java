package Tamagotchi;

public class Tamagotchi {

	private String nombre;
	private int cantidadVida;
	private int maxVida;
	
	
	public Tamagotchi (String nombre, int maxVida) {
		this.nombre = nombre;
		this.maxVida = maxVida;
	}
	
	public String toString () {
		return "nombre " + nombre + " , Cantidad de vida " 
		        + cantidadVida + " , vida maxima " + maxVida;
	}
	
	public void come () {
		if (cantidadVida < maxVida) {
			cantidadVida++;
		}
		for (int i = 0; i < 5; i++) {
			System.out.println("Estoy comiendo");
		}
	}
	public void juega () {
		if (cantidadVida >= 1) {
			cantidadVida--;
		} else {
			System.out.println("No tengo suficientes vidas para jugar");
		}
		for (int i = 0; i < 5; i++) {
			System.out.println("Estoy jugando");
		}
	}
}
