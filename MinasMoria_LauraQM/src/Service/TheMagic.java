package Service;

import java.util.ArrayList;
import java.util.LinkedList;

import Caracteristicas.Peligro;
import Configuracion.Configuracion;
import Entidades.Frodo;
import Entidades.Gandalf;
import Entidades.Legolas;
import Entidades.Sala;

public class TheMagic {

	private Gandalf gandalf;
	private Legolas legolas;
	private Frodo frodo;

	private LinkedList<Sala> misSalas = new LinkedList<Sala>();

	public LinkedList<Sala> getMisSalas() {
		return misSalas;
	}

	public void setMisSalas(LinkedList<Sala> misSalas) {
		this.misSalas = misSalas;
	}

	public void iniciarPersonajes() {

		this.gandalf = new Gandalf("gandalf");

		this.legolas = new Legolas("legolas");

		this.frodo = new Frodo("frodo");
	}

	public void iniciarSalas() {

		for (int i = 0; i < Configuracion.NUM_SALAS; i++) {

			int numeroPeligro = (int) (Math.random() * 3) + 1;

			Peligro peligro = Peligro.ACCION;

			switch (numeroPeligro) {
			case 1: {

				peligro = Peligro.ACCION;
				break;
			}
			case 2: {
				peligro = Peligro.HABILIDAD;
				break;
			}
			case 3: {
				peligro = Peligro.MAGICO;
				break;
			}
			default:
				peligro = Peligro.ACCION;
			}

			Sala sala = new Sala(i + 1, peligro);
			misSalas.add(sala);
		}

	}

	public boolean turno() {
		boolean victoria = false;
		boolean huida = false;
		Sala sala = misSalas.getFirst();
		gandalf.recargarVara((int) (Math.random() * 10) + 1);

		if (gandalf.getVara() > sala.getPoderMaligno()) {

			gandalf.setVara(gandalf.getVara()-sala.getPoderMaligno());
			
			victoria = true;

		} else if (gandalf.getVara() == sala.getPoderMaligno()) {

			int porcentaje = (int) (Math.random() * 10) + 1;

			if (porcentaje <= 6) {

				gandalf.setVara(gandalf.getVara()-sala.getPoderMaligno());
				victoria = true;

			}
		} else if (gandalf.getVara() < sala.getPoderMaligno()) {

			int porcentaje = (int) (Math.random() * 10) + 1;
			if (porcentaje <= 3) {

				victoria = true;
			}

		} else {

			while (legolas.getCarcaj() > 0 && sala.getEnemigos() > 0) {

				legolas.lanzarFlecha();
				sala.setEnemigos(sala.getEnemigos() - 1);
				sala.setFlechasDesperdigadas(sala.getFlechasDesperdigadas() + 1);

			}

			if (sala.getEnemigos() == 0) {

				victoria = true;
			}
			if (!victoria) {
				frodo.ponerseAnillo();
				if (frodo.isAnillo()) {
					int porcentaje = (int) (Math.random() * 10) + 1;
					if (porcentaje <= 9) {

						victoria = true;

					}
				} else if (!frodo.isAnillo()) {
					int porcentaje = (int) (Math.random() * 10) + 1;
					if (porcentaje <= 2) {

						victoria = true;

					}

				}
				if (!victoria) {
					int porcentaje = (int) (Math.random() * 10) + 1;
					if (porcentaje <= 8) {

						huida = true;
					}

				}
			}

		}

		if (victoria) {
			legolas.setCarcaj(legolas.getCarcaj() + sala.getFlechasDesperdigadas());
		}

		if (victoria || huida) {

			misSalas.removeFirst();
			return true;

		} else {
			return false;
		}
	}
}