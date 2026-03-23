package Actividad_1x04;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;
import java.util.List;

public class GestorFicheroEmpleados {

	private String path;

	public GestorFicheroEmpleados(String path) {
		this.path = path;
	}

	/**
	 * Inserta un empleado precodicion: el empleado no existe en el fichero
	 * 
	 * @param empleado
	 * @return
	 * @throws IOException
	 */

	public boolean insertar(Empleado empleado) throws IOException {

		BufferedWriter bw = null;

		try {
			File archivo = new File(path);
			FileWriter fr = new FileWriter(archivo, true);
			bw = new BufferedWriter(fr);
			bw.write(empleado.toStringWithSeparators());
			bw.newLine();

			BufferedReader br = new BufferedReader(new FileReader(archivo));

			String linea = br.readLine();

			while (linea != null) {
				String[] datoEmpleado = linea.split(";");

				if (datoEmpleado[0].equals(empleado.getCodigo())) {
					return false;
				}
			}

		} finally {
			// Cierra el fichero
			if (bw != null) {
				bw.close();
			}
		}
		return true;
	}

	public boolean borrar(int codigo) throws IOException {

		BufferedReader br = null;

		try {

			File archivo = new File(path);
			br = new BufferedReader(new FileReader(archivo));

			String linea = br.readLine();

			while (linea != null) {
				Empleado e = new Empleado(linea);
				if (e.getCodigo() == codigo) {

				}

			}

		} finally {
			// Cierra el fichero
			if (br != null) {
				br.close();
			}
		}

	}

	public boolean modificar(Empleado e) {

	}

	public Empleado buscar(int codigo) throws IOException {

		BufferedReader br = null;

		try {
			File archivo = new File(path);
			br = new BufferedReader(new FileReader(archivo));

			String linea = br.readLine();

			while (linea != null) {
				Empleado e = new Empleado(linea);

				if (e.getCodigo() == codigo) {
					return e;
				}
				linea = br.readLine();
			}

		} finally {
			// Cierra el fichero
			if (br != null) {
				br.close();
			}
		}

		return null;

	}

	public List<Empleado> listar() {

	}

}
