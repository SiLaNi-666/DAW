import java.io.IOException;
import java.util.List;

import entrada.Teclado;

public class Principal {

	public static int escribirMenuOpciones() {
		int opcion;

		System.out.println("0) Salir del programa");
		System.out.println("1) Insertar un empleado en el fichero de texto");
		System.out.println("2) Consultar todos los empleados del fichero de texto");
		System.out.println("3) Consultar un empleado, por codigo, del fichero de texto");
		System.out.println("4) Actualizar un empleado, por codigo, del fichero de texto");
		System.out.println("5) Elimiar un empleado, por codigo, del fichero de texto");
		opcion = Teclado.leerEntero("Elige una opcion:");
		System.out.println();

		return opcion;
	}

	public static void main(String[] args) {

		int opcion;
		GestorFicheroEmpleados gfe = new GestorFicheroEmpleados("prueba/empleados.csv");
		int codigo;
		String nombre;
		String fecha;
		String departamento;
		double salario;


		do {

			opcion = escribirMenuOpciones();
			try {
				switch (opcion) {
					case 0:
						System.out.println("Saliendo del programa...");
					case 1:
						codigo = Teclado.leerEntero("Codigo de empleado: ");

						Empleado e1 = gfe.buscar(codigo);
						if(e1 != null){
							System.out.println("Ya existe otro empleado con ese codigo en el fichero de texto");
						}

						nombre = Teclado.leerCadena("Nombre del empleado:");
						fecha = Teclado.leerCadena("Fecha de nacimiento: ");
						departamento = Teclado.leerCadena("Numero de departamento: ");
						salario = Teclado.leerReal("Salario del empleado");

						e1 = new Empleado(codigo, nombre, fecha, departamento, salario);
						gfe.insertar(e1);

						System.out.println("Se ha insertado en el fichero de texto a un nuevo empleado con codigo: " + codigo);

					case 2:
						List<Empleado> listaEmpleados = gfe.listar();

						if(listaEmpleados.isEmpty()){
							System.out.println("El fichero de texto está vacío");
						}else{
 							for(Empleado e : listaEmpleados){
								System.out.println(e);
							}
						}

					case 3:

						codigo= Teclado.leerEntero("¿Codigo de empelado?");

						Empleado e3 = gfe.buscar(codigo);

						if(e3 == null){
							System.out.println("No existe ningún empleado con ese código en el fichero de texto. ");
						} else{
							System.out.println(e3);
						}

					case 4:

						codigo = Teclado.leerEntero("¿Codigo de empleado?");
						Empleado e4 = gfe.buscar(codigo);

						if(e4 == null){
							System.out.println("No existe ningún empleado con ese código en el fichero de texto. ");
						}else{
							int n_dep4 = Teclado.leerEntero("¿Nuevo numero de departemento?");
							double salario4 = Teclado.leerReal("¿Nuevo salario?");
							e4.setN_departamento(n_dep4);
							e4.setSalario(salario4);

							System.out.println("Se ha actualizado un empleado del fichero de texto.");
						}

					case 5:


						codigo = Teclado.leerEntero("Codigo de empleado:");
						Empleado e5 = gfe.buscar(codigo);

						if(e5 != null){
							//Si no es nulo, es porque ese codigo existe, hay un empleado con ese codigo
							//Lo borramos.
							gfe.borrar(codigo);
							System.out.println("Se ha borrado al empleado con codigo: " + codigo);
						}else{
							System.out.println("No existe ningun empleado con ese codigo en el fichero de texto");
						}

						//Hacer una unica pasada al fichero, no 2.
						


					default:

				}

				} catch (IOException ioe) {
					System.out.println( ioe.getMessage());
					ioe.printStackTrace();
			}
		} while (opcion != 0);
		if(opcion < 0 || opcion > 5){
			System.out.println("La opción de menú debe estar comprendida entre 0 y 5");
		}

	}

}
