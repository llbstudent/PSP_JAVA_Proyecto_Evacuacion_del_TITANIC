package controllers;

import java.util.Map;
import DAO_DataModel.DAO_Persona;
import pojo.Persona;

public class ControladorPrincipal {

	public static Map<String, Persona> getListadoPersonas_aBordo() {
		return DAO_Persona.getInstance();
	}

}
