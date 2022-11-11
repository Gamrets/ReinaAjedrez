package org.iesalandalus.programacion.reinaajedrez;

import org.iesalandalus.programacion.reinaajedrez.modelo.Color;
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
	
	public Color elegirColor() {

		int opcionColor;
		do {
			System.out.print("Introduce 1 si quieres color blanco o 2 si quieres color negro: ");
			opcionColor = Entrada.entero();
		} while (opcionColor < 1 && opcionColor > 2);

		if (opcionColor == 1) {
			return Color.BLANCO;
		} else {
			return Color.NEGRO;
		}
	}
	
public void mostrarMenuDirecciones() {
		
		System.out.println("1. Norte");
		System.out.println("2. Sur");
		System.out.println("3. Este");
		System.out.println("4. Oeste");
		System.out.println("5. Noreste");
		System.out.println("6. Sureste");
		System.out.println("7. Noroeste");
		System.out.println("8. Suroeste");
		
	}
	
	
}
