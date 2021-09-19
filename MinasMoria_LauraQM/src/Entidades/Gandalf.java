package Entidades;

import Caracteristicas.Estado;
import Caracteristicas.Raza;
import Configuracion.Configuracion;

public class Gandalf extends Personajes {

	private int vara;

	public Gandalf(String nombre) {
		super(nombre, Raza.MAGO);
		this.vara = Configuracion.VARA_PODER_GANDALF ;
		

	}

	public int getVara() {
		return vara;
	}

	public void setVara(int vara) {
		this.vara = vara;
	}

	public void recargarVara(int energia) {

		this.vara = this.vara + energia;

	}

	public int energiaVara() {

		return vara;
	}

	public void ponerseAnillo() {

	}

	public void quiarseAnillo() {

	}

	public void lanzarFlecha() {

	}

	public void recargarCarcaj(int flechas) {

	}
}
