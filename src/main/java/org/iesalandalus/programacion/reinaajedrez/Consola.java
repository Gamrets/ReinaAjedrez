package org.iesalandalus.programacion.reinaajedrez;

import org.iesalandalus.programacion.utilidades.Entrada;

public class Consola {
	
	private Consola() {

	}

	public void mostrarMenu() {

		System.out.println("0. Crear reina por defecto.");
		System.out.println("1. Crear reina eligiendo el color.");
		System.out.println("2. Mover.");
		System.out.println("3. Salir.");
	}
	
	public int elegirOpcionMenu() {

		int opcion = 0;
		do {
			System.out.print("Elegir opción: ");
			opcion = Entrada.entero();
		} while (opcion < 0 || opcion > 3);

		return opcion;

	}
	
	
}
