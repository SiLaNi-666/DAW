package Ejercicio2x03;

import java.util.Random;

public class Tiempo {

	private int horas;
	private int minutos;
	private int segundos;
	
	
	public Tiempo (int horas_, int minutos_, int segundos_) {
		horas = horas_;
		minutos = minutos_;
		segundos = segundos_;
	}
	
	//Genera las horas minutos y segundos de forma aleatoria 
	public Tiempo () {
		Random aleatorio = new Random();
		horas = aleatorio.nextInt(24);     //entre 0 y 23
		minutos = aleatorio.nextInt(60);   //entre 0 y 59
		segundos = aleatorio.nextInt(60); //entre 0 y 59
	}
	
	//Valida los datos de un tiempo segun las condiciones
	//- Las horas deben estar comprendidas entre 0 y 23.
	//- Los minutos deben estar comprendidos entre 0 y 59
	//- Los segundos deben estar comprendidos entre 0 y 59.
	//
	public static boolean validar (int hora, int minuto, int segundo) {
		if (hora >= 0 && hora < 24 && minuto >= 0 && minuto < 60 && segundo >= 0 && segundo < 60) {
			return true;
		}
		return false;
	}

	@Override
	public String toString() {
		return 
			String.format("%02d:%02d:%02d", 
						horas, minutos, segundos);
	}
	
	public boolean sumar (Tiempo t2) {
		boolean correcto = false;
		
		
		return correcto;
	}
	
	
	
}
