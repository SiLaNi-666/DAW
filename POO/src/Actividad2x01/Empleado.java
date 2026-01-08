package Actividad2x01;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class Empleado {

	protected String nif;
	protected String nombre;
	protected GregorianCalendar fecha_nac;
	protected String direccion;
	protected int telefono;
	protected String email;

	/**
	 * 
	 * @param nif
	 * @param nombre
	 * @param fecha_nac
	 * @param direccion
	 * @param telefono
	 * @param email
	 */
	public Empleado(String nif, String nombre, GregorianCalendar fecha_nac, String direccion, int telefono, String email) {
		super();
		this.nif = nif;
		this.nombre = nombre;
		this.fecha_nac = fecha_nac;
		this.direccion = direccion;
		this.telefono = telefono;
		this.email = email;
	}

	public String getNif() {
		return nif;
	}

	public void setNif(String nif) {
		this.nif = nif;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public GregorianCalendar getFecha_nac() {
		return fecha_nac;
	}

	public void setFecha_nac(GregorianCalendar fecha_nac) {
		this.fecha_nac = fecha_nac;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public int getTelefono() {
		return telefono;
	}

	public void setTelefono(int telefono) {
		this.telefono = telefono;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	@Override
	public String toString() {
		return "Empleado NIF = " + nif + ", NOMBRE = " + nombre + 
					", FECHA NACIMIENTO = " + fecha_nac.get(Calendar.DAY_OF_MONTH) + 
					"/" + (fecha_nac.get(Calendar.MONTH)+1) +
					"/" + fecha_nac.get(Calendar.YEAR) +
				", DIRECCION = " + direccion
				+ ", TLF = " + telefono + ", EMAIL = " + email;
	}
	
	public static void main(String[] args) {
		
		GregorianCalendar fecha_nac1 = new GregorianCalendar(6, Calendar.JUNE, 6);
		Empleado emp1 = new Empleado("1234567A", "Daniel", fecha_nac1, "Avd. mi guebo", 657289103, "daniel@payico.com");
		
		System.out.println(emp1);
		
	}
	
	
	

}
