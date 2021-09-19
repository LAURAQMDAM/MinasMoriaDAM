package Entidades;

import Caracteristicas.Raza;
import Configuracion.Configuracion;

public class Legolas extends Personajes {

	private int carcaj;

	public Legolas(String nombre) {
		super(nombre, Raza.ELFO);
		this.carcaj = Configuracion.FLECHAS_LEGOLAS;

	}

	public int getCarcaj() {
		return carcaj;
	}

	public void setCarcaj(int carcaj) {
		this.carcaj = carcaj;
	}

	public void recargarVara(int energia) {

	}

	public int energiaVara() {

		return 0;
	}

	public void ponerseAnillo() {

	}

	public void quiarseAnillo() {

	}

	public void lanzarFlecha() {

		this.carcaj=this.carcaj-1;
	}

	public void recargarCarcaj(int flechas) {
		
		this.carcaj=this.carcaj+flechas;

	}

}
