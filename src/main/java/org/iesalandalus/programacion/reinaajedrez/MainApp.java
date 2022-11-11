package org.iesalandalus.programacion.reinaajedrez;

import javax.naming.OperationNotSupportedException;

import org.iesalandalus.programacion.reinaajedrez.modelo.Reina;

public class MainApp {

	private static Reina reina;

	private static boolean salir = false;

	public static void main(String[] args) throws OperationNotSupportedException {

		do {
			Consola.mostrarMenu();
			ejecutarOpcion(Consola.elegirOpcionMenu());
			
		} while (salir == false);
	}

	private static void ejecutarOpcion(int opcion) throws OperationNotSupportedException {

		switch (opcion) {
		case 1:

			crearReinaDefecto();

			break;
		case 2:
			crearReinaColor();

			break;
		case 3:
			
			mover();

			break;
		case 4:

			salir = true;

			break;
		default:
		}

	}

	private static void crearReinaDefecto() {

		reina = new Reina();
		mostrarReina();
	}

	private static void crearReinaColor() {

		reina = new Reina(Consola.elegirColor());
		mostrarReina();
	}

	private static void mover() throws OperationNotSupportedException {
		
		Consola.mostrarMenuDirecciones();

		reina.mover(Consola.elegirDireccion(), Consola.elegirPasos());
		mostrarReina();
	}

	private static void mostrarReina() {

		System.out.println(reina.toString());
	}
}
