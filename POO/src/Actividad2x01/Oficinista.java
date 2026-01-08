package Actividad2x01;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class Oficinista extends Empleado {
	
	protected String titulacion;
	protected String turno;
	
	/**
	 * 
	 * @param nif
	 * @param nombre
	 * @param fecha_nac
	 * @param direccion
	 * @param telefono
	 * @param email
	 * @param titulacion
	 * @param turno
	 */
	public Oficinista(String nif, String nombre, GregorianCalendar fecha_nac, String direccion, int telefono, String email,
			String titulacion, String turno) {
		super(nif, nombre, fecha_nac, direccion, telefono, email);
		this.titulacion = titulacion;
		this.turno = turno;
		
		if(turno.equals("diurno") || turno.equals("vespertino") || turno.equals("nocturno")) {
			this.turno = turno;
		}else {
			this.turno = "diurno";
		}
	}

	public String getTitulacion() {
		return titulacion;
	}

	public void setTitulacion(String titulacion) {
		this.titulacion = titulacion;
	}

	public String getTurno() {
		return turno;
	}

	public void setTurno(String turno) {
		this.turno = turno;
	}

	@Override
	public String toString() {
		return "Oficinista [" + super.toString() + "\n" +
			"Titulacion = " + titulacion +
			"Turno = " + turno;
	}
	
	public static void main(String[] args) {
		GregorianCalendar fecha_nac1 = new GregorianCalendar(6, Calendar.JUNE, 6);
		Oficinista emp1 = new Oficinista("1234567A", "Daniel", fecha_nac1, "Avd. mi guebo", 657289103, "daniel@payico.com", "Desarrollador", "Vespertino");
		
		System.out.println(emp1);
	}
	
	
	
	
	
}
