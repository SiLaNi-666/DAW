package Actividad_1x04;

public class Empleado {

	private int codigo;
	private String nombre;
	private String fechaNac;
	private int n_departamento;
	private double salario;

	public Empleado(int codigo, String nombre, String fechaNac, int n_departamento, double salario) {
		this.codigo = codigo;
		this.nombre = nombre;
		this.fechaNac = fechaNac;
		this.n_departamento = n_departamento;
		this.salario = salario;
	}

	public Empleado(String linea) {
		String[] parte = linea.split(";");
		this.codigo = Integer.parseInt(parte[0]);
		this.nombre = parte[1];
		this.fechaNac = parte[2];
		this.n_departamento = Integer.parseInt(parte[3]);
		this.salario = Double.parseDouble(parte[4]);
	}

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getFechaNac() {
		return fechaNac;
	}

	public void setFechaNac(String fechaNac) {
		this.fechaNac = fechaNac;
	}

	public int getN_departamento() {
		return n_departamento;
	}

	public void setN_departamento(int n_departamento) {
		this.n_departamento = n_departamento;
	}

	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}

	@Override
	public String toString() {
		return "Empleado [codigo=" + codigo + ", nombre=" + nombre + ", fechaNac=" + fechaNac + ", n_departamento="
				+ n_departamento + ", salario=" + String.format("%.2f", salario) + "]";
	}

	public String toStringWithSeparators() {
		return codigo + ";" + nombre + ";" + fechaNac + ";" + n_departamento + ";" + String.format("$.2f", salario);
	}

}
