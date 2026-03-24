package Actividad_1x04;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
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
			FileWriter fw = new FileWriter(archivo, true);
			bw = new BufferedWriter(fw);
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
		BufferedWriter bw = null;
		File archivo = new File(path);
		File archivo2 = new File(path+".tmp");

		try {
			br = new BufferedReader(new FileReader(archivo));
			bw = new BufferedWriter(new FileWriter(archivo2));

			String linea = br.readLine();

			while (linea != null) {
				Empleado e = new Empleado(linea);
				//Si el codigo del empleado no coincide con el codigo, se escribe esa linea en
				//el fichero temporal
				if (e.getCodigo() != codigo) {
					bw.write(linea);
					bw.newLine();
					return true;
				}

			}

		} finally {
			// Cierra el fichero
			if (br != null) {
				br.close();
			}
		}

		//Borra el archivo original con el codigo que coincide.
		//Y renombra el archivo temporal que contiene los codigos que no se queiren borrar.
		archivo.delete();
		archivo2.renameTo(archivo);
		return false;
	}

	public boolean modificar(Empleado e) {
		return true;
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

	public List<Empleado> listar() throws  IOException{
		List<Empleado> listaEmpleados = new ArrayList<>();

		BufferedReader br = null;

		try{
			File archivo = new File(path);
			br = new BufferedReader(new FileReader(archivo));

			String linea = br.readLine();
			while(linea != null){
				//Si la linea del fichero no es nula, se añade al fichero (.add).
				Empleado e = new Empleado(linea);
				listaEmpleados.add(e);
				linea = br.readLine();
			}

		}finally {
			// Cierra el fichero
			if (br != null) {
				br.close();
			}
		}

		return listaEmpleados;
	}

}
