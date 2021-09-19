package Entidades;

import Caracteristicas.Raza;

public class Frodo extends Personajes {

	private boolean anillo;

	public Frodo(String nombre) {
		super(nombre, Raza.HOBBIT);
		this.anillo = false;
	}

	public boolean isAnillo() {
		return anillo;
	}

	public void setAnillo(boolean anillo) {
		this.anillo = anillo;
	}

	public void ponerseAnillo() {

		int porcentaje = (int) (Math.random() * 2) + 1;
		if (porcentaje == 2) {
			anillo = true;

		}
	}

	public void quiarseAnillo() {

		anillo = false;

	}

	public void recargarVara(int energia) {

	}

	public int energiaVara() {

		return 0;
	}

	public void lanzarFlecha() {

	}

	public void recargarCarcaj(int flechas) {

	}

}
