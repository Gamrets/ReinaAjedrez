package org.iesalandalus.programacion.reinaajedrez;

import javax.naming.OperationNotSupportedException;

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
	 
	 
	 private static void crearReinaDefecto() {
			
			reina = new Reina();
		}
		
		private static void crearReinaColor() {
		
			reina = new Reina(consola.elegirColor());
		}
		
		private static void mover() throws OperationNotSupportedException{
		
			reina.mover(consola.elegirDireccion(),consola.elegirPasos());
		}
		
		private static void mostrarReina() {
			
			reina.toString();
		}
}
