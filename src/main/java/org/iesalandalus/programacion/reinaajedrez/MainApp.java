package org.iesalandalus.programacion.reinaajedrez;

import org.iesalandalus.programacion.reinaajedrez.modelo.Reina;

public class MainApp {
	
	private static Reina reina;
	private static Consola consola;
	private static boolean salir = false;
	
	public static void main(String[] args) {
		
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
}
