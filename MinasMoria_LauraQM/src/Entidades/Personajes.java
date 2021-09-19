package Entidades;

import Caracteristicas.Estado;
import Caracteristicas.Raza;

public abstract class  Personajes {


	private String nombre;
	private Estado estado;
	private Raza raza;

	public Personajes(String nombre, Raza raza) {

		this.nombre = nombre;
		this.estado = Estado.VIVO;
		this.raza = raza;
		
	}

	public Raza getRaza() {
		return raza;
	}

	public void setRaza(Raza raza) {
		this.raza = raza;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Estado getEstado() {
		return estado;
	}

	public void setEstado(Estado estado) {
		this.estado = estado;
	}


	public abstract void recargarVara(int energia) ;
	public abstract int energiaVara() ;
	public abstract void lanzarFlecha() ;
	public abstract void recargarCarcaj(int flechas);
	public abstract void ponerseAnillo();
	public abstract void quiarseAnillo();
}
