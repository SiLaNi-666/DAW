package Actividad2x01;

import java.util.GregorianCalendar;

public class Limpiador extends Empleado{
	
	protected boolean limpiaOficina;
	protected boolean limpiaAutobus;
	protected boolean limpiaGarajes;
	
	/**
	 * 
	 * @param nif
	 * @param nombre
	 * @param fecha_nac
	 * @param direccion
	 * @param telefono
	 * @param email
	 * @param limpiaOficina
	 * @param limpiaAutobus
	 * @param limpiaGarajes
	 */
	public Limpiador(String nif, String nombre, GregorianCalendar fecha_nac, String direccion, int telefono, String email,
			boolean limpiaOficina, boolean limpiaAutobus, boolean limpiaGarajes) {
		super(nif, nombre, fecha_nac, direccion, telefono, email);
		this.limpiaOficina = limpiaOficina;
		this.limpiaAutobus = limpiaAutobus;
		this.limpiaGarajes = limpiaGarajes;
	}

	public boolean isLimpiaOficina() {
		return limpiaOficina;
	}

	public void setLimpiaOficina(boolean limpiaOficina) {
		this.limpiaOficina = limpiaOficina;
	}

	public boolean isLimpiaAutobus() {
		return limpiaAutobus;
	}

	public void setLimpiaAutobus(boolean limpiaAutobus) {
		this.limpiaAutobus = limpiaAutobus;
	}

	public boolean isLimpiaGarajes() {
		return limpiaGarajes;
	}

	public void setLimpiaGarajes(boolean limpiaGarajes) {
		this.limpiaGarajes = limpiaGarajes;
	}
	
	

}
