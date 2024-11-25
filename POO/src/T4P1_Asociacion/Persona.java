package T4P1Asociacion1;

public class Persona {
	
	private String nombre;
	private String apellidos;
	private String dni;
	private Coche cochePropio ;
	
	public Persona (String nombre_, String apellidos_, String dni_) {
		nombre = nombre_;
		apellidos = apellidos_;
		dni = dni_;
	}
	
	public void compraCoche (Coche c) {
		cochePropio = c;
		c.setPropietario(this);
	}
	
	public void usaCoche(double distancia, double velocidad) {
		if (cochePropio != null) {
			System.out.println("Posee coche");
			cochePropio.motorArrancado();
			cochePropio.velocidadActual(velocidad);
			cochePropio.kilometraje(distancia);
		} else {
			System.out.println(nombre + "" + apellidos + "no tiene coche propio");
		}
	}
	
	public Coche getCocheEnPropiedad() {
		return cochePropio;
	}
	
	public boolean poseeCoche() {
		
		if (cochePropio != null) {
			System.out.println("La persona tiene coche");
		}
		return true;
	}
	
	public void imprimirDatosPersonales() {
		
	}
	
}
