package org.iesalandalus.programacion.reinaajedrez.modelo;

public class Reina {

	// Declaro atributos

	private Color color;
	private Posicion posicion;
	
	//Constructor por defecto
	
	public Reina() {
		color = Color.BLANCO;
		posicion = new Posicion(1, 'd');
	}

	// Creo metodos Getters y Setters

	private void setPosicion(Posicion posicion) {

		this.posicion = posicion;

	}
	
	//Constructor que acepta parametros color

		public Reina(Color color) {

			if (color == Color.BLANCO) {
				posicion = new Posicion(1, 'd');
			} else if (color == Color.NEGRO) {
				posicion = new Posicion(8, 'b');
			}

			if (color == null) {
				throw new NullPointerException("ERROR: No se puede asignar un color nulo.");
			}
		}

	public Posicion getPosicion() {

		return this.posicion;
	}

	private void setColor(Color color) {

		if (color == null) {
			throw new IllegalArgumentException("ERROR: No se puede asignar un color nulo.");
		}
		this.color = color;
	}

	public Color getColor() {
		return this.color;
	}
	
	
		
}
