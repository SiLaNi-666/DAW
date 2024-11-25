package T4P1Asociacion1;

public class Coche {

	// Propiedades independientes del estado
	private String matricula; 
	private double maxLitrosDeposito; 
	private double maxLitrosReserva; 
	private double velocidadMaxima; 
	private double consumoMedio100km; 
	// Propiedades que definen el estado del coche
	private boolean motorArrancado; 
	private boolean estaEnReserva; 
	private double numLitrosActual; 
	private double velocidadActual; 
	private double kilometraje;
	private Persona propietario;
	
	public Coche (String matricula_, double maxLitrosDeposito_, double consumoMedio100km_, double velocidadMaxima_){
		matricula = matricula_;
		if (maxLitrosDeposito > 0) {
			maxLitrosDeposito = maxLitrosDeposito_;
		} else {
			maxLitrosDeposito = 50;
		}
		
		if (consumoMedio100km > 0) {
			consumoMedio100km = consumoMedio100km_;
		} else {
			consumoMedio100km = 7.5;
		}
		
		if (velocidadMaxima > 0) {
			velocidadMaxima = velocidadMaxima_;
		} else {
			velocidadMaxima = 180;
		}

	}
	
	
	
	
	
	public String getMatricula() {
		return matricula;
	}

	public double getMaxLitrosDeposito() {
		return maxLitrosDeposito;
	}

	public double getMaxLitrosReserva() {
		return maxLitrosReserva;
	}

	public double getVelocidadMaxima() {
		return velocidadMaxima;
	}

	public double getConsumoMedio100km() {
		return consumoMedio100km;
	}

	public boolean getMotorArrancado() {
		return motorArrancado;
	}

	public boolean getEstaEnReserva() {
		return estaEnReserva;
	}

	public double getNumLitrosActual() {
		return numLitrosActual;
	}

	public double getVelocidadActual() {
		return velocidadActual;
	}

	public double getKilometraje() {
		return kilometraje;
	}

	
	
	public boolean poseePropietario () {
		if(propietario == null) {
			return false;
		}else {
		return true;
		}	
}
	
	public Persona getPropietario () {
		
	}
	
	public void setPropietario (Persona p) {
		
	}
	
	
}
