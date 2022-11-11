package org.iesalandalus.programacion.reinaajedrez;

import org.iesalandalus.programacion.reinaajedrez.modelo.Color;
import org.iesalandalus.programacion.reinaajedrez.modelo.Direccion;
import org.iesalandalus.programacion.utilidades.Entrada;

public class Consola {

	private Consola() {

	}

	public static void mostrarMenu() {

		System.out.println("1. Crear reina por defecto.");
		System.out.println("2. Crear reina eligiendo el color.");
		System.out.println("3. Mover.");
		System.out.println("4. Salir.");
	}

	public static int elegirOpcionMenu() {

		int opcion = 0;
		do {
			System.out.print("Elegir opción: ");
			opcion = Entrada.entero();
		} while (opcion < 1 || opcion > 4);

		return opcion;

	}

	public static Color elegirColor() {

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

	public static void mostrarMenuDirecciones() {

		System.out.println("1. Norte");
		System.out.println("2. Sur");
		System.out.println("3. Este");
		System.out.println("4. Oeste");
		System.out.println("5. Noreste");
		System.out.println("6. Sureste");
		System.out.println("7. Noroeste");
		System.out.println("8. Suroeste");

	}

	public static Direccion elegirDireccion() {

		int opcionDireccion;
		do {
			System.out.print("Introduce una opción: ");
			opcionDireccion = Entrada.entero();

		} while (opcionDireccion < 1 || opcionDireccion > 8);

		Direccion direccion = null;
		switch (opcionDireccion) {
		case 1:
			direccion = Direccion.NORTE;
			break;
		case 2:
			direccion = Direccion.SUR;
			break;
		case 3:
			direccion = Direccion.ESTE;
			break;
		case 4:
			direccion = Direccion.OESTE;
			break;
		case 5:
			direccion = Direccion.NORESTE;
			break;
		case 6:
			direccion = Direccion.SURESTE;
			break;
		case 7:
			direccion = Direccion.NOROESTE;
		case 8:

			direccion = Direccion.SUROESTE;
		default:

		}
		return direccion;
	}

	public static int elegirPasos() {

		int pasos;
		do {
			System.out.print("Introduce los pasos a realizar: ");
			pasos = Entrada.entero();

		} while (pasos < 1 || pasos > 7);

		return pasos;

	}

	public static void despedirse() {

		System.out.println("Hasta luego!");

	}

}
