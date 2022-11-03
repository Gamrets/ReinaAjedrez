package org.iesalandalus.programacion.reinaajedrez.modelo;

public class Posicion {

	// Declaro los atributos
	
	private int fila;
	private char columna;
	
	//Creo metodos setter y getter

		private void setFila(int fila) {

			if (fila < 1 || fila > 8) {
				throw new IllegalArgumentException("ERROR: Fila no válida.");

			} else {
				this.fila = fila;
			}
		}

		public int getFila() {
			return this.fila;
		}

		private void setColumna(char columna) {

			if (columna < 'a' || columna > 'h') {
				throw new IllegalArgumentException("ERROR: Columna no válida.");

			} else {
				this.columna = columna;

			}
		}

		public int getColumna() {
			return this.columna;
		}
	
}
