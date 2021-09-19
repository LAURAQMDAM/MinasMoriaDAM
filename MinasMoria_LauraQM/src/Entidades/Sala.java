package Entidades;

import java.util.ArrayList;

import Caracteristicas.Peligro;
import Configuracion.Configuracion;

public class Sala {

	private int enemigos;

	private int numSala;

	private Peligro peligro; // magico, accion, habilidad

	private int poderMaligno;

	private int flechasDesperdigadas;

	public Sala(int enemigos, int numSala, Peligro peligro, int poderMaligno, int flechasDerperdigadas) {
		this.enemigos = enemigos;
		this.numSala = numSala;
		this.peligro = peligro;
		this.poderMaligno = poderMaligno;
		this.flechasDesperdigadas = flechasDerperdigadas;

	}

	public Sala(int numSala, Peligro peligro) {

		this.numSala = numSala;
		this.peligro = peligro;

		if (this.peligro == Peligro.MAGICO) {

			this.poderMaligno = Configuracion.PODER_MALIGNO_MAGICO;
			this.enemigos = Configuracion.NUM_ENEMIGOS_MAGICO;
			this.flechasDesperdigadas = Configuracion.FLECHAS_DESPERDIGADAS_MAGICO;

		} else if (this.peligro == Peligro.ACCION) {

			this.poderMaligno = Configuracion.PODER_MALIGNO_ACCION;
			this.enemigos = Configuracion.NUM_ENEMIGOS_ACCION;
			this.flechasDesperdigadas = Configuracion.FLECHAS_DESPERDIGADAS_ACCION;

		} else if (this.peligro == Peligro.HABILIDAD) {

			this.poderMaligno = Configuracion.PODER_MALIGNO_HABILIDAD;
			this.enemigos = Configuracion.NUM_ENEMIGO_HABILIDAD;
			this.flechasDesperdigadas = Configuracion.FLECHAS_DESPERDIGADAS_HABILIDAD;
		}

	}

	public int getEnemigos() {
		return enemigos;
	}

	public void setEnemigos(int enemigos) {
		this.enemigos = enemigos;
	}

	public int getFlechasDesperdigadas() {
		return flechasDesperdigadas;
	}

	public void setFlechasDesperdigadas(int flechasDesperdigadas) {
		this.flechasDesperdigadas = flechasDesperdigadas;
	}

	public int getNumSala() {
		return numSala;
	}

	public void setNumSala(int numSala) {
		this.numSala = numSala;
	}

	public Peligro getPeligro() {
		return peligro;
	}

	public void setPeligro(Peligro peligro) {
		this.peligro = peligro;
	}

	public int getPoderMaligno() {
		return poderMaligno;
	}

	public void setPoderMaligno(int poderMaligno) {
		this.poderMaligno = poderMaligno;
	}

}
