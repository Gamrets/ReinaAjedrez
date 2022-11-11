package org.iesalandalus.programacion.reinaajedrez.modelo;

import javax.naming.OperationNotSupportedException;

public class Reina {

	// Declaro atributos

	private Color color;
	private Posicion posicion;

	// Constructor por defecto

	public Reina() {

		color = Color.BLANCO;
		posicion = new Posicion(1, 'd');
	}

	// Creo metodos Getters y Setters

	private void setPosicion(Posicion posicion) {

		this.posicion = posicion;

	}

	// Constructor que acepta parametros color

	public Reina(Color color) {

		if (color == null) {
			throw new NullPointerException("ERROR: El color no puede ser nulo.");
		}

		setColor(color);

		if (color == color.BLANCO) {
			posicion = new Posicion(1, 'd');
		} else if (color == Color.NEGRO) {
			posicion = new Posicion(8, 'd');
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

	public void mover(Direccion direccion, int pasos) throws OperationNotSupportedException {

		if (direccion == null) {

			throw new NullPointerException("ERROR: La dirección no puede ser nula.");
		}

		if (pasos < 1 || pasos > 7) {

			throw new IllegalArgumentException("ERROR: El número de pasos debe estar comprendido entre 1 y 7.");

		}

		int fila = 0;
		char columna;

		try {

			switch (direccion) {

			// Arriba
			case NORTE: {

				setPosicion(new Posicion(posicion.getFila() + pasos, posicion.getColumna()));

				break;
			}
			// Abajo
			case SUR: {

				setPosicion(new Posicion(posicion.getFila() - pasos, posicion.getColumna()));

				break;
			}
			// Izquierda
			case OESTE: {

				setPosicion(new Posicion(posicion.getFila(), (char) (posicion.getColumna() - pasos)));

				break;
			}
			// Derecha
			case ESTE: {

				setPosicion(new Posicion(posicion.getFila(), (char) (posicion.getColumna() + pasos)));

				break;
			}

			// Arriba-Derecha
			case NORESTE: {

				fila = posicion.getFila() + pasos;
				columna = (char) ((int) posicion.getColumna() + pasos);
				setPosicion(new Posicion(fila, columna));

				break;
			}
			// Arriba-Izquierda
			case NOROESTE: {

				fila = posicion.getFila() + pasos;

				columna = (char) ((int) posicion.getColumna() - pasos);
				setPosicion(new Posicion(fila, columna));

				break;
			}

			// Abajo-Derecha
			case SURESTE: {

				fila = posicion.getFila() - pasos;

				columna = (char) ((int) posicion.getColumna() + pasos);
				setPosicion(new Posicion(fila, columna));

				break;
			}
			// Abajo-Izquierda
			case SUROESTE: {

				fila = posicion.getFila() - pasos;

				columna = (char) ((int) posicion.getColumna() - pasos);
				setPosicion(new Posicion(fila, columna));

				break;
			}
			default:
			}
		} catch (IllegalArgumentException e) {
			throw new OperationNotSupportedException("ERROR: Movimiento no válido (se sale del tablero).");
		}
	
	}

	@Override
	public String toString() {
		return "color=" + color + ", posicion=("+ posicion +")";
	}
	
	
		
}
