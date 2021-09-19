package Principal;

import java.util.Date;

import Caracteristicas.Peligro;
import Configuracion.Configuracion;
import Entidades.Frodo;
import Entidades.Gandalf;
import Entidades.Legolas;
import Entidades.Sala;
import Service.TheMagic;

public class Principal {

	public static void main(String[] args) {
		System.out.println("Bienvenidos a las Minas de Moria");

		TheMagic theMagic = new TheMagic();

		Date fechaInicio= new Date();
		boolean victory = true;
		theMagic.iniciarSalas();
		theMagic.iniciarPersonajes();

		while (theMagic.getMisSalas().size() >= 1 && victory) {

			victory = theMagic.turno();

		}
		Date fechaFinal= new Date();

		if (victory) {
			System.out.println("Los personajes han ganado");

		} else {
			System.out.println("Los personajes no han superado Moria,han perdido , el numero de salas superadas es : " + (Configuracion.NUM_SALAS - theMagic.getMisSalas().size()));

		}

	}
}