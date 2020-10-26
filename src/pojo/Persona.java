package pojo;

import java.util.Date;
import Enum.Pais;
import Enum.ZonaBarco;

public abstract class Persona {
	//Atributos
	private String dni;
	private String nombre;
	private Boolean minusvalia;
	private Date fechaNacimiento;
	private Pais pais;
	private ZonaBarco zona;
	
	//Constructores
	public Persona() {}
	
	public Persona(String dni, String nombre, Boolean minusvalia, Date fechaNacimiento, Pais pais, ZonaBarco zona) {
		this.dni = dni;
		this.nombre = nombre;
		this.minusvalia = minusvalia;
		this.fechaNacimiento = fechaNacimiento;
		this.pais = pais;
		this.zona = zona;
	}

	//Modificadores de Acceso
	public String getDNI() {
		return dni;
	}
	
	public void setDNI(String dNI) {
		dni = dNI;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public Boolean getMinusvalia() {
		return minusvalia;
	}
	public void setMinusvalia(Boolean minusvalia) {
		this.minusvalia = minusvalia;
	}
	public Date getFechaNacimiento() {
		return fechaNacimiento;
	}
	public void setFechaNacimiento(Date fechaNacimiento) {
		this.fechaNacimiento = fechaNacimiento;
	}
	public Pais getPais() {
		return pais;
	}
	public void setPais(Pais pais) {
		this.pais = pais;
	}
	public ZonaBarco getZona() {
		return zona;
	}
	public void setZona(ZonaBarco zona) {
		this.zona = zona;
	}

	//ToString
	@Override
	public String toString() {
		return "Persona [dni=" + dni + ", nombre=" + nombre + ", minusvalia=" + minusvalia + ", fechaNacimiento="
				+ fechaNacimiento + ", pais=" + pais + ", zona=" + zona + "]";
	}	
}
