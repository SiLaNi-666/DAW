package Actividad2x01;

import java.util.GregorianCalendar;

public class Conductor extends Empleado{
	
	private static int numeroMaxCarnets = 15;
	protected int cantCarnets;
	protected int anoCAP;
	
	/**
	 * 
	 * @param nif
	 * @param nombre
	 * @param fecha_nac
	 * @param direccion
	 * @param telefono
	 * @param email
	 * @param cantCarnets
	 * @param anoCAP
	 */
	public Conductor(String nif, String nombre, GregorianCalendar fecha_nac, String direccion, int telefono, String email,
			int cantCarnets, int anoCAP) {
		super(nif, nombre, fecha_nac, direccion, telefono, email);
		this.cantCarnets = cantCarnets;
		this.anoCAP = anoCAP;
		
		if(cantCarnets >= 0 && cantCarnets<= numeroMaxCarnets) {
			this.cantCarnets = cantCarnets;
		}else {
			this.cantCarnets = numeroMaxCarnets;
		}
	}
	
	
	
	
}
