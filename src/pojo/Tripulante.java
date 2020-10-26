package pojo;

import java.util.Date;
import Enum.NivelResponsabilidad;
import Enum.Pais;
import Enum.ZonaBarco;

public class Tripulante extends Persona{
	private NivelResponsabilidad nResp;

	//Constructores
	public Tripulante() {
		super();
	}

	public Tripulante(String dni, String nombre, Boolean minusvalia, Date fechaNacimiento, Pais pais, ZonaBarco zona,  NivelResponsabilidad nResp) {
		super(dni, nombre, minusvalia, fechaNacimiento, pais, zona);
		this.nResp = nResp;
	}

	//Modificadores de acceso
	public NivelResponsabilidad getnResp() {
		return nResp;
	}

	public void setnResp(NivelResponsabilidad nResp) {
		this.nResp = nResp;
	}

	//toString
	@Override
	public String toString() {
		return "Tripulante [nResp=" + nResp + ", getnResp()=" + getnResp() + ", getDNI()=" + getDNI() + ", getNombre()="
				+ getNombre() + ", getMinusvalia()=" + getMinusvalia() + ", getFechaNacimiento()="
				+ getFechaNacimiento() + ", getPais()=" + getPais() + ", getZona()=" + getZona() + ", toString()="
				+ super.toString() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + "]";
	}
}
