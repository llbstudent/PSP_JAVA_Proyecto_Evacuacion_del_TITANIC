package pojo;

import java.util.Date;

import Enum.Pais;
import Enum.ZonaBarco;

public class Pasajero extends Persona{
	private Integer numHabitacion;
	
	//Constructores
	public Pasajero() {
		super();
	}
	
	public Pasajero(String dni, String nombre, Boolean minusvalia, Date fechaNacimiento, Pais pais, ZonaBarco zona, Integer numHabitacion) {
		super(dni, nombre, minusvalia, fechaNacimiento, pais, zona);
		this.numHabitacion = numHabitacion;
	}
	
	// Modificadores de Acceso
	public Integer getNumHabitacion() {
		return numHabitacion;
	}
	
	public void setNumHabitacion(Integer numHabitacion) {
		this.numHabitacion = numHabitacion;
	}

	
	//toString
	@Override
	public String toString() {
		return "Pasajero [numHabitacion=" + numHabitacion + ", getNumHabitacion()=" + getNumHabitacion() + ", getDNI()="
				+ getDNI() + ", getNombre()=" + getNombre() + ", getMinusvalia()=" + getMinusvalia()
				+ ", getFechaNacimiento()=" + getFechaNacimiento() + ", getPais()=" + getPais() + ", getZona()="
				+ getZona() + ", toString()=" + super.toString() + ", getClass()=" + getClass() + ", hashCode()="
				+ hashCode() + "]";
	}

}
