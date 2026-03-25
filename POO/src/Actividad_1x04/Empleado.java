public class Empleado {

	private static String SEPARADOR = ";";
	private int codigo;
	private String nombre;
	private String fechaNac;
	private String departamento;
	private double salario;

	public Empleado(int codigo, String nombre, String fechaNac, String departamento, double salario) {
		this.codigo = codigo;
		this.nombre = nombre;
		this.fechaNac = fechaNac;
		this.departamento = departamento;
		this.salario = salario;
	}

	public Empleado(String linea) {
		String[] parte = linea.split(";");
		this.codigo = Integer.parseInt(parte[0]);
		this.nombre = parte[1];
		this.fechaNac = parte[2];
		this.departamento = (parte[3]);
		this.salario = Double.parseDouble(parte[4]);

		if(parte.length < 4 || parte.length > 4){

		}
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

	public String getN_departamento() {
		return departamento;
	}

	public void setN_departamento(int n_departamento) {
		this.departamento = departamento;
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
				+ departamento + ", salario=" + String.format("%.2f", salario) + "]";
	}

	public String toStringWithSeparators() {
		return codigo + ";" + nombre + ";" + fechaNac + ";" + departamento + ";" + String.format("$.2f", salario);
	}

}
