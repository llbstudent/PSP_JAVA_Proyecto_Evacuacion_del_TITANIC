package DAO_DataModel;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

import Enum.NivelResponsabilidad;
import Enum.Pais;
import Enum.ZonaBarco;
import pojo.Pasajero;
import pojo.Persona;
import pojo.Tripulante;

public class DAO_Persona extends ArrayList<Persona>{
	private static DAO_Persona daoSingleton;
	
	public static DAO_Persona getInstance() {
		if(daoSingleton == null) {
			daoSingleton = new DAO_Persona();
		}
		
		return daoSingleton;
	}
	
	private DAO_Persona() {
		//super();
		try {
			//Pasajeros
			this.add(new Pasajero("11224455R", "Alfred Gutenach", false, new SimpleDateFormat("dd/MM/yyyy").parse("22/02/2010"), Pais.Italia, ZonaBarco.Babor, 22));
			this.add(new Pasajero("11224455E", "Maria Gutenach", false, new SimpleDateFormat("dd/MM/yyyy").parse("13/03/1995"), Pais.Italia, ZonaBarco.Babor, 22));
			this.add(new Pasajero("11224455A", "Gustav Gutenach", false, new SimpleDateFormat("dd/MM/yyyy").parse("31/01/1998"), Pais.Italia, ZonaBarco.Babor, 22));
			this.add(new Pasajero("11224455R", "Valentino Pellegrinno", false, new SimpleDateFormat("dd/MM/yyyy").parse("31/01/1995"), Pais.Italia, ZonaBarco.Babor, 23));
			this.add(new Pasajero("22445335R", "Antonio Banderas", false, new SimpleDateFormat("dd/MM/yyyy").parse("14/04/1957"), Pais.España, ZonaBarco.Babor, 25));
			this.add(new Pasajero("11224455R", "Penelope Cruz", false, new SimpleDateFormat("dd/MM/yyyy").parse("16/09/1977"), Pais.España, ZonaBarco.Babor, 24));
			this.add(new Pasajero("32597466O", "Javier Bardem", false, new SimpleDateFormat("dd/MM/yyyy").parse("02/02/1972"), Pais.España, ZonaBarco.Babor, 24));
			this.add(new Pasajero("31226984W", "Miguel Bosé", false, new SimpleDateFormat("dd/MM/yyyy").parse("30/06/1965"), Pais.Italia, ZonaBarco.Babor, 26));
			this.add(new Pasajero("11224455R", "Hugo Bosé", false, new SimpleDateFormat("dd/MM/yyyy").parse("11/05/2017"), Pais.Italia, ZonaBarco.Babor, 26));
			this.add(new Pasajero("58774169T", "Pierre LePardiez", false, new SimpleDateFormat("dd/MM/yyyy").parse("22/08/1988"), Pais.Francia, ZonaBarco.Babor, 27));
			this.add(new Pasajero("145569874L", "Manuel Leroy", false, new SimpleDateFormat("dd/MM/yyyy").parse("14/05/1994"), Pais.Francia, ZonaBarco.Babor, 27));
			this.add(new Pasajero("36541123T", "Enrick LePasteur", false, new SimpleDateFormat("dd/MM/yyyy").parse("17/09/1964"), Pais.Francia, ZonaBarco.Babor, 28));
			this.add(new Pasajero("41547798O", "Aracellie Madariegueur", false, new SimpleDateFormat("dd/MM/yyyy").parse("31/01/1995"), Pais.Francia, ZonaBarco.Babor, 28));
			this.add(new Pasajero("25447152Z", "Francesc LePasteur", false, new SimpleDateFormat("dd/MM/yyyy").parse("12/02/1999"), Pais.Francia, ZonaBarco.Babor, 28));
			this.add(new Pasajero("32224569W", "Moreau LePasteur", false, new SimpleDateFormat("dd/MM/yyyy").parse("30/01/1935"), Pais.Francia, ZonaBarco.Babor, 28));
			this.add(new Pasajero("11458796L", "Anthony Recio", false, new SimpleDateFormat("dd/MM/yyyy").parse("17/09/1966"), Pais.ReinoUnido, ZonaBarco.Babor, 29));
			this.add(new Pasajero("31569987H", "Berta Smith", false, new SimpleDateFormat("dd/MM/yyyy").parse("17/07/1969"), Pais.ReinoUnido, ZonaBarco.Babor, 29));
			this.add(new Pasajero("36784927T", "Violet Recio", true, new SimpleDateFormat("dd/MM/yyyy").parse("04/01/1967"), Pais.ReinoUnido, ZonaBarco.Babor, 29));
			this.add(new Pasajero("22459864E", "Albert Recio", false, new SimpleDateFormat("dd/MM/yyyy").parse("19/07/1997"), Pais.ReinoUnido, ZonaBarco.Babor, 29));
			this.add(new Pasajero("36951975Y", "Leo Singleton", false, new SimpleDateFormat("dd/MM/yyyy").parse("01/01/1987"), Pais.Alemania, ZonaBarco.Babor, 21));
			this.add(new Pasajero("37459267U", "Eva Hoffman", false, new SimpleDateFormat("dd/MM/yyyy").parse("14/04/1990"), Pais.Alemania, ZonaBarco.Babor, 21));
			this.add(new Pasajero("31584637N", "Alexander Bauer", false, new SimpleDateFormat("dd/MM/yyyy").parse("10/11/1987"), Pais.Alemania, ZonaBarco.Babor, 21));
			this.add(new Pasajero("33365423B", "Melanie Bauer", false, new SimpleDateFormat("dd/MM/yyyy").parse("02/02/2011"), Pais.Alemania, ZonaBarco.Babor, 21));
			this.add(new Pasajero("37953698X", "Richard Bauer", false, new SimpleDateFormat("dd/MM/yyyy").parse("11/04/2009"), Pais.Alemania, ZonaBarco.Babor, 21));
			this.add(new Pasajero("34985621F", "Rodrigo Pellegrinno", false, new SimpleDateFormat("dd/MM/yyyy").parse("21/02/1962"), Pais.Italia, ZonaBarco.Babor, 23));
			this.add(new Pasajero("31259746X", "Marina Valentinna", false, new SimpleDateFormat("dd/MM/yyyy").parse("29/03/1999"), Pais.Italia, ZonaBarco.Babor, 23));
			this.add(new Pasajero("39856321J", "Dakota Banderas", false, new SimpleDateFormat("dd/MM/yyyy").parse("22/04/2000"), Pais.España, ZonaBarco.Babor, 25));
			this.add(new Pasajero("32365485C", "Melanie Griffith", false, new SimpleDateFormat("dd/MM/yyyy").parse("02/02/1970"), Pais.ReinoUnido, ZonaBarco.Babor, 25));
			this.add(new Pasajero("25633287A", "Summers Smith", false, new SimpleDateFormat("dd/MM/yyyy").parse("08/01/2015"), Pais.ReinoUnido, ZonaBarco.Babor, 20));
			this.add(new Pasajero("65322398G", "Gerard Smith", false, new SimpleDateFormat("dd/MM/yyyy").parse("30/04/1980"), Pais.ReinoUnido, ZonaBarco.Babor, 20));
			this.add(new Pasajero("75984126P", "Beth Sanchez", false, new SimpleDateFormat("dd/MM/yyyy").parse("25/03/1984"), Pais.ReinoUnido, ZonaBarco.Babor, 20));
			this.add(new Pasajero("76985236S", "Rick Sanchez", false, new SimpleDateFormat("dd/MM/yyyy").parse("14/05/1961"), Pais.ReinoUnido, ZonaBarco.Babor, 20));
			
			this.add(new Pasajero("11224455R", "Marie Guttenberg", false, new SimpleDateFormat("dd/MM/yyyy").parse("31/01/1995"), Pais.Italia, ZonaBarco.Estribor, 10));
			this.add(new Pasajero("11224455R", "Marie Guttenberg", false, new SimpleDateFormat("dd/MM/yyyy").parse("31/01/1995"), Pais.Italia, ZonaBarco.Estribor, 10));
			this.add(new Pasajero("11224455R", "Marie Guttenberg", false, new SimpleDateFormat("dd/MM/yyyy").parse("31/01/1995"), Pais.Italia, ZonaBarco.Estribor, 10));
			this.add(new Pasajero("11224455R", "Marie Guttenberg", false, new SimpleDateFormat("dd/MM/yyyy").parse("31/01/1995"), Pais.Alemania, ZonaBarco.Estribor, 11));
			this.add(new Pasajero("11224455R", "Marie Guttenberg", false, new SimpleDateFormat("dd/MM/yyyy").parse("31/01/1995"), Pais.Alemania, ZonaBarco.Estribor, 11));
			this.add(new Pasajero("11224455R", "Marie Guttenberg", false, new SimpleDateFormat("dd/MM/yyyy").parse("31/01/1995"), Pais.Francia, ZonaBarco.Estribor, 12));
			this.add(new Pasajero("11224455R", "Marie Guttenberg", false, new SimpleDateFormat("dd/MM/yyyy").parse("31/01/1995"), Pais.Francia, ZonaBarco.Estribor, 12));
			this.add(new Pasajero("11224455R", "Marie Guttenberg", false, new SimpleDateFormat("dd/MM/yyyy").parse("31/01/1995"), Pais.Francia, ZonaBarco.Estribor, 12));
			this.add(new Pasajero("11224455R", "Marie Guttenberg", false, new SimpleDateFormat("dd/MM/yyyy").parse("31/01/1995"), Pais.España, ZonaBarco.Estribor, 13));
			this.add(new Pasajero("11224455R", "Marie Guttenberg", false, new SimpleDateFormat("dd/MM/yyyy").parse("31/01/1995"), Pais.España, ZonaBarco.Estribor, 13));
			this.add(new Pasajero("11224455R", "Marie Guttenberg", false, new SimpleDateFormat("dd/MM/yyyy").parse("31/01/1995"), Pais.ReinoUnido, ZonaBarco.Estribor, 14));
			this.add(new Pasajero("11224455R", "Marie Guttenberg", false, new SimpleDateFormat("dd/MM/yyyy").parse("31/01/1995"), Pais.ReinoUnido, ZonaBarco.Estribor, 14));
			this.add(new Pasajero("11224455R", "Marie Guttenberg", false, new SimpleDateFormat("dd/MM/yyyy").parse("31/01/1995"), Pais.ReinoUnido, ZonaBarco.Estribor, 14));
			this.add(new Pasajero("11224455R", "Marie Guttenberg", false, new SimpleDateFormat("dd/MM/yyyy").parse("31/01/1995"), Pais.ReinoUnido, ZonaBarco.Estribor, 14));
			this.add(new Pasajero("11224455R", "Marie Guttenberg", false, new SimpleDateFormat("dd/MM/yyyy").parse("31/01/1995"), Pais.ReinoUnido, ZonaBarco.Estribor, 14));
			this.add(new Pasajero("11224455R", "Marie Guttenberg", false, new SimpleDateFormat("dd/MM/yyyy").parse("31/01/1995"), Pais.Alemania, ZonaBarco.Estribor, 15));
			this.add(new Pasajero("11224455R", "Marie Guttenberg", false, new SimpleDateFormat("dd/MM/yyyy").parse("31/01/1995"), Pais.Alemania, ZonaBarco.Estribor, 15));
			this.add(new Pasajero("11224455R", "Marie Guttenberg", false, new SimpleDateFormat("dd/MM/yyyy").parse("31/01/1995"), Pais.Alemania, ZonaBarco.Estribor, 15));
			this.add(new Pasajero("11224455R", "Marie Guttenberg", false, new SimpleDateFormat("dd/MM/yyyy").parse("31/01/1995"), Pais.Italia, ZonaBarco.Estribor, 16));
			this.add(new Pasajero("11224455R", "Marie Guttenberg", false, new SimpleDateFormat("dd/MM/yyyy").parse("31/01/1995"), Pais.Italia, ZonaBarco.Estribor, 16));
			this.add(new Pasajero("11224455R", "Marie Guttenberg", false, new SimpleDateFormat("dd/MM/yyyy").parse("31/01/1995"), Pais.Francia, ZonaBarco.Estribor, 17));
			this.add(new Pasajero("11224455R", "Marie Guttenberg", false, new SimpleDateFormat("dd/MM/yyyy").parse("31/01/1995"), Pais.Francia, ZonaBarco.Estribor, 17));
			this.add(new Pasajero("11224455R", "Marie Guttenberg", false, new SimpleDateFormat("dd/MM/yyyy").parse("31/01/1995"), Pais.Francia, ZonaBarco.Estribor, 17));
			this.add(new Pasajero("11224455R", "Marie Guttenberg", false, new SimpleDateFormat("dd/MM/yyyy").parse("31/01/1995"), Pais.Francia, ZonaBarco.Estribor, 17));
			this.add(new Pasajero("11224455R", "Marie Guttenberg", false, new SimpleDateFormat("dd/MM/yyyy").parse("31/01/1995"), Pais.España, ZonaBarco.Estribor, 18));
			this.add(new Pasajero("11224455R", "Marie Guttenberg", false, new SimpleDateFormat("dd/MM/yyyy").parse("31/01/1995"), Pais.España, ZonaBarco.Estribor, 18));
			this.add(new Pasajero("11224455R", "Marie Guttenberg", false, new SimpleDateFormat("dd/MM/yyyy").parse("31/01/1995"), Pais.España, ZonaBarco.Estribor, 18));
			this.add(new Pasajero("11224455R", "Marie Guttenberg", false, new SimpleDateFormat("dd/MM/yyyy").parse("31/01/1995"), Pais.España, ZonaBarco.Estribor, 18));
			this.add(new Pasajero("11224455R", "Marie Guttenberg", false, new SimpleDateFormat("dd/MM/yyyy").parse("31/01/1995"), Pais.Italia, ZonaBarco.Estribor, 19));
			this.add(new Pasajero("11224455R", "Marie Guttenberg", false, new SimpleDateFormat("dd/MM/yyyy").parse("31/01/1995"), Pais.Italia, ZonaBarco.Estribor, 19));
			this.add(new Pasajero("11224455R", "Marie Guttenberg", false, new SimpleDateFormat("dd/MM/yyyy").parse("31/01/1995"), Pais.Italia, ZonaBarco.Estribor, 19));
			this.add(new Pasajero("11224455R", "Marie Guttenberg", false, new SimpleDateFormat("dd/MM/yyyy").parse("31/01/1995"), Pais.Italia, ZonaBarco.Estribor, 19));
			this.add(new Pasajero("11224455R", "Marie Guttenberg", false, new SimpleDateFormat("dd/MM/yyyy").parse("31/01/1995"), Pais.Italia, ZonaBarco.Estribor, 19));
			this.add(new Pasajero("11224455R", "Marie Guttenberg", false, new SimpleDateFormat("dd/MM/yyyy").parse("31/01/1995"), Pais.Alemania, ZonaBarco.Estribor, 11));
			this.add(new Pasajero("11224455R", "Marie Guttenberg", false, new SimpleDateFormat("dd/MM/yyyy").parse("31/01/1995"), Pais.Alemania, ZonaBarco.Estribor, 11));
			
			this.add(new Pasajero("32556932L", "Alexander Hamilton", false, new SimpleDateFormat("dd/MM/yyyy").parse("01/01/1995"), Pais.Alemania, ZonaBarco.Proa, 30));
			this.add(new Pasajero("31112563J", "Alexander Hamilton", false, new SimpleDateFormat("dd/MM/yyyy").parse("31/01/1995"), Pais.Alemania, ZonaBarco.Proa, 30));
			this.add(new Pasajero("32336598Y", "Alexander Hamilton", false, new SimpleDateFormat("dd/MM/yyyy").parse("31/01/1995"), Pais.Alemania, ZonaBarco.Proa, 30));
			this.add(new Pasajero("37853146W", "Alexander Hamilton", false, new SimpleDateFormat("dd/MM/yyyy").parse("31/01/1995"), Pais.Alemania, ZonaBarco.Proa, 30));
			this.add(new Pasajero("33652339H", "Alexander Hamilton", false, new SimpleDateFormat("dd/MM/yyyy").parse("31/01/1995"), Pais.Alemania, ZonaBarco.Proa, 30));
			this.add(new Pasajero("31298643K", "Alexander Hamilton", false, new SimpleDateFormat("dd/MM/yyyy").parse("31/01/1995"), Pais.España, ZonaBarco.Proa, 31));
			this.add(new Pasajero("33365988Q", "Alexander Hamilton", false, new SimpleDateFormat("dd/MM/yyyy").parse("31/01/1995"), Pais.España, ZonaBarco.Proa, 31));
			this.add(new Pasajero("32369855G", "Alexander Hamilton", false, new SimpleDateFormat("dd/MM/yyyy").parse("31/01/1995"), Pais.España, ZonaBarco.Proa, 31));
			this.add(new Pasajero("31236975G", "Alexander Hamilton", false, new SimpleDateFormat("dd/MM/yyyy").parse("31/01/1995"), Pais.España, ZonaBarco.Proa, 31));
			this.add(new Pasajero("31250036V", "Alexander Hamilton", false, new SimpleDateFormat("dd/MM/yyyy").parse("31/01/1995"), Pais.Francia, ZonaBarco.Proa, 32));
			this.add(new Pasajero("45896123N", "Alexander Hamilton", false, new SimpleDateFormat("dd/MM/yyyy").parse("31/01/1995"), Pais.Francia, ZonaBarco.Proa, 32));
			this.add(new Pasajero("41216785C", "Alexander Hamilton", false, new SimpleDateFormat("dd/MM/yyyy").parse("31/01/1995"), Pais.Francia, ZonaBarco.Proa, 32));
			this.add(new Pasajero("75841269X", "Alexander Hamilton", false, new SimpleDateFormat("dd/MM/yyyy").parse("31/01/1995"), Pais.ReinoUnido, ZonaBarco.Proa, 33));
			this.add(new Pasajero("35986417Z", "Alexander Hamilton", false, new SimpleDateFormat("dd/MM/yyyy").parse("31/01/1995"), Pais.ReinoUnido, ZonaBarco.Proa, 33));
			this.add(new Pasajero("31238462A", "Alexander Hamilton", false, new SimpleDateFormat("dd/MM/yyyy").parse("31/01/1995"), Pais.ReinoUnido, ZonaBarco.Proa, 33));
			this.add(new Pasajero("38956632Q", "Alexander Hamilton", false, new SimpleDateFormat("dd/MM/yyyy").parse("31/01/1995"), Pais.España, ZonaBarco.Proa, 34));
			this.add(new Pasajero("31256974W", "Alexander Hamilton", false, new SimpleDateFormat("dd/MM/yyyy").parse("31/01/1995"), Pais.España, ZonaBarco.Proa, 34));
			this.add(new Pasajero("33256974E", "Alexander Hamilton", false, new SimpleDateFormat("dd/MM/yyyy").parse("31/01/1995"), Pais.Alemania, ZonaBarco.Proa, 35));
			this.add(new Pasajero("32146975R", "Alexander Hamilton", false, new SimpleDateFormat("dd/MM/yyyy").parse("31/01/1995"), Pais.Alemania, ZonaBarco.Proa, 35));
			this.add(new Pasajero("31236794T", "Alexander Hamilton", false, new SimpleDateFormat("dd/MM/yyyy").parse("31/01/1995"), Pais.Alemania, ZonaBarco.Proa, 35));
			this.add(new Pasajero("32456971F", "Alexander Hamilton", false, new SimpleDateFormat("dd/MM/yyyy").parse("31/01/1995"), Pais.Italia, ZonaBarco.Proa, 36));
			this.add(new Pasajero("31256903O", "Alexander Hamilton", false, new SimpleDateFormat("dd/MM/yyyy").parse("31/01/1995"), Pais.Italia, ZonaBarco.Proa, 36));
			this.add(new Pasajero("32450155K", "Alexander Hamilton", false, new SimpleDateFormat("dd/MM/yyyy").parse("31/01/1995"), Pais.Alemania, ZonaBarco.Proa, 37));
			this.add(new Pasajero("21365047J", "Alexander Hamilton", false, new SimpleDateFormat("dd/MM/yyyy").parse("31/01/1995"), Pais.Alemania, ZonaBarco.Proa, 37));
			this.add(new Pasajero("31259745H", "Alexander Hamilton", false, new SimpleDateFormat("dd/MM/yyyy").parse("31/01/1995"), Pais.Alemania, ZonaBarco.Proa, 37));
			this.add(new Pasajero("32145698G", "Alexander Hamilton", false, new SimpleDateFormat("dd/MM/yyyy").parse("31/01/1995"), Pais.Alemania, ZonaBarco.Proa, 37));
			this.add(new Pasajero("32563014F", "Alexander Hamilton", false, new SimpleDateFormat("dd/MM/yyyy").parse("31/01/1995"), Pais.Alemania, ZonaBarco.Proa, 37));
			this.add(new Pasajero("31256987D", "Alexander Hamilton", false, new SimpleDateFormat("dd/MM/yyyy").parse("31/01/1995"), Pais.ReinoUnido, ZonaBarco.Proa, 38));
			this.add(new Pasajero("34456200S", "Alexander Hamilton", false, new SimpleDateFormat("dd/MM/yyyy").parse("31/01/1995"), Pais.ReinoUnido, ZonaBarco.Proa, 38));
			this.add(new Pasajero("32015603A", "Alexander Hamilton", false, new SimpleDateFormat("dd/MM/yyyy").parse("31/01/1995"), Pais.ReinoUnido, ZonaBarco.Proa, 38));
			this.add(new Pasajero("15648823D", "Alexander Hamilton", false, new SimpleDateFormat("dd/MM/yyyy").parse("31/01/1995"), Pais.Italia, ZonaBarco.Proa, 39));
			this.add(new Pasajero("79896541D", "Alexander Hamilton", false, new SimpleDateFormat("dd/MM/yyyy").parse("31/01/1995"), Pais.Italia, ZonaBarco.Proa, 39));
			this.add(new Pasajero("65897120V", "Alexander Hamilton", false, new SimpleDateFormat("dd/MM/yyyy").parse("31/01/1995"), Pais.Italia, ZonaBarco.Proa, 39));
			this.add(new Pasajero("71256483F", "Alexander Hamilton", false, new SimpleDateFormat("dd/MM/yyyy").parse("31/01/1995"), Pais.Italia, ZonaBarco.Proa, 39));
			
			this.add(new Pasajero("11224455R", "Abraham Lincoln", false, new SimpleDateFormat("dd/MM/yyyy").parse("31/01/1995"), Pais.Alemania, ZonaBarco.Popa, 40));
			this.add(new Pasajero("11224455R", "Abraham Lincoln", false, new SimpleDateFormat("dd/MM/yyyy").parse("31/01/1995"), Pais.Alemania, ZonaBarco.Popa, 40));
			this.add(new Pasajero("11224455R", "Abraham Lincoln", false, new SimpleDateFormat("dd/MM/yyyy").parse("31/01/1995"), Pais.Alemania, ZonaBarco.Popa, 40));
			this.add(new Pasajero("11224455R", "Abraham Lincoln", false, new SimpleDateFormat("dd/MM/yyyy").parse("31/01/1995"), Pais.Alemania, ZonaBarco.Popa, 40));
			this.add(new Pasajero("11224455R", "Abraham Lincoln", false, new SimpleDateFormat("dd/MM/yyyy").parse("31/01/1995"), Pais.Alemania, ZonaBarco.Popa, 40));
			this.add(new Pasajero("11224455R", "Abraham Lincoln", false, new SimpleDateFormat("dd/MM/yyyy").parse("31/01/1995"), Pais.Alemania, ZonaBarco.Popa, 40));
			this.add(new Pasajero("11224455R", "Abraham Lincoln", false, new SimpleDateFormat("dd/MM/yyyy").parse("31/01/1995"), Pais.Alemania, ZonaBarco.Popa, 40));
			this.add(new Pasajero("11224455R", "Abraham Lincoln", false, new SimpleDateFormat("dd/MM/yyyy").parse("31/01/1995"), Pais.Alemania, ZonaBarco.Popa, 40));
			this.add(new Pasajero("11224455R", "Abraham Lincoln", false, new SimpleDateFormat("dd/MM/yyyy").parse("31/01/1995"), Pais.Alemania, ZonaBarco.Popa, 40));
			this.add(new Pasajero("11224455R", "Abraham Lincoln", false, new SimpleDateFormat("dd/MM/yyyy").parse("31/01/1995"), Pais.Alemania, ZonaBarco.Popa, 40));
			this.add(new Pasajero("11224455R", "Abraham Lincoln", false, new SimpleDateFormat("dd/MM/yyyy").parse("31/01/1995"), Pais.Alemania, ZonaBarco.Popa, 40));
			this.add(new Pasajero("11224455R", "Abraham Lincoln", false, new SimpleDateFormat("dd/MM/yyyy").parse("31/01/1995"), Pais.Alemania, ZonaBarco.Popa, 40));
			this.add(new Pasajero("11224455R", "Abraham Lincoln", false, new SimpleDateFormat("dd/MM/yyyy").parse("31/01/1995"), Pais.Alemania, ZonaBarco.Popa, 40));
			this.add(new Pasajero("11224455R", "Abraham Lincoln", false, new SimpleDateFormat("dd/MM/yyyy").parse("31/01/1995"), Pais.Alemania, ZonaBarco.Popa, 40));
			this.add(new Pasajero("11224455R", "Abraham Lincoln", false, new SimpleDateFormat("dd/MM/yyyy").parse("31/01/1995"), Pais.Alemania, ZonaBarco.Popa, 40));
			this.add(new Pasajero("11224455R", "Abraham Lincoln", false, new SimpleDateFormat("dd/MM/yyyy").parse("31/01/1995"), Pais.Alemania, ZonaBarco.Popa, 40));
			this.add(new Pasajero("11224455R", "Abraham Lincoln", false, new SimpleDateFormat("dd/MM/yyyy").parse("31/01/1995"), Pais.Alemania, ZonaBarco.Popa, 40));
			this.add(new Pasajero("11224455R", "Abraham Lincoln", false, new SimpleDateFormat("dd/MM/yyyy").parse("31/01/1995"), Pais.Alemania, ZonaBarco.Popa, 40));
			this.add(new Pasajero("11224455R", "Abraham Lincoln", false, new SimpleDateFormat("dd/MM/yyyy").parse("31/01/1995"), Pais.Alemania, ZonaBarco.Popa, 40));
			this.add(new Pasajero("11224455R", "Abraham Lincoln", false, new SimpleDateFormat("dd/MM/yyyy").parse("31/01/1995"), Pais.Alemania, ZonaBarco.Popa, 40));
			this.add(new Pasajero("11224455R", "Abraham Lincoln", false, new SimpleDateFormat("dd/MM/yyyy").parse("31/01/1995"), Pais.Alemania, ZonaBarco.Popa, 40));
			this.add(new Pasajero("11224455R", "Abraham Lincoln", false, new SimpleDateFormat("dd/MM/yyyy").parse("31/01/1995"), Pais.Alemania, ZonaBarco.Popa, 40));
			this.add(new Pasajero("11224455R", "Abraham Lincoln", false, new SimpleDateFormat("dd/MM/yyyy").parse("31/01/1995"), Pais.Alemania, ZonaBarco.Popa, 40));
			this.add(new Pasajero("11224455R", "Abraham Lincoln", false, new SimpleDateFormat("dd/MM/yyyy").parse("31/01/1995"), Pais.Alemania, ZonaBarco.Popa, 40));
			this.add(new Pasajero("11224455R", "Abraham Lincoln", false, new SimpleDateFormat("dd/MM/yyyy").parse("31/01/1995"), Pais.Alemania, ZonaBarco.Popa, 40));
			this.add(new Pasajero("11224455R", "Abraham Lincoln", false, new SimpleDateFormat("dd/MM/yyyy").parse("31/01/1995"), Pais.Alemania, ZonaBarco.Popa, 40));
			this.add(new Pasajero("11224455R", "Abraham Lincoln", false, new SimpleDateFormat("dd/MM/yyyy").parse("31/01/1995"), Pais.Alemania, ZonaBarco.Popa, 40));
			
			//Tripulacion
			this.add(new Tripulante("11111111A", "Angela Merkel", false, new SimpleDateFormat("dd/MM/yyyy").parse("31/01/1995"), Pais.Alemania, ZonaBarco.Popa,  NivelResponsabilidad.media));
			this.add(new Tripulante("11111111A", "Vladimir Putin", false, new SimpleDateFormat("dd/MM/yyyy").parse("31/01/1995"), Pais.Alemania, ZonaBarco.Popa,  NivelResponsabilidad.media));
			this.add(new Tripulante("11111111A", "Barack Obama", false, new SimpleDateFormat("dd/MM/yyyy").parse("31/01/1995"), Pais.Alemania, ZonaBarco.Popa,  NivelResponsabilidad.media));
			this.add(new Tripulante("11111111A", "Aung San Suu Kyi", false, new SimpleDateFormat("dd/MM/yyyy").parse("31/01/1995"), Pais.Alemania, ZonaBarco.Popa,  NivelResponsabilidad.media));
			this.add(new Tripulante("11111111A", "Donald Trump", true, new SimpleDateFormat("dd/MM/yyyy").parse("31/01/1995"), Pais.Alemania, ZonaBarco.Popa,  NivelResponsabilidad.media));
			this.add(new Tripulante("11111111A", "Emmanuel Macron", false, new SimpleDateFormat("dd/MM/yyyy").parse("31/01/1995"), Pais.Alemania, ZonaBarco.Popa,  NivelResponsabilidad.media));
			this.add(new Tripulante("11111111A", "Xi Jinping", false, new SimpleDateFormat("dd/MM/yyyy").parse("31/01/1995"), Pais.Alemania, ZonaBarco.Popa,  NivelResponsabilidad.media));
			this.add(new Tripulante("11111111A", "Justin Trudeau", false, new SimpleDateFormat("dd/MM/yyyy").parse("31/01/1995"), Pais.Alemania, ZonaBarco.Popa,  NivelResponsabilidad.media));
			this.add(new Tripulante("11111111A", "Kim Jong Un", false, new SimpleDateFormat("dd/MM/yyyy").parse("31/01/1995"), Pais.Alemania, ZonaBarco.Popa,  NivelResponsabilidad.media));
			this.add(new Tripulante("11111111A", "Christine Lagarde", false, new SimpleDateFormat("dd/MM/yyyy").parse("31/01/1995"), Pais.Alemania, ZonaBarco.Popa,  NivelResponsabilidad.media));
			this.add(new Tripulante("11111111A", "JuanMa Moreno", false, new SimpleDateFormat("dd/MM/yyyy").parse("31/01/1995"), Pais.Alemania, ZonaBarco.Popa,  NivelResponsabilidad.media));
			this.add(new Tripulante("11111111A", "Angela Merkel", false, new SimpleDateFormat("dd/MM/yyyy").parse("31/01/1995"), Pais.Alemania, ZonaBarco.Popa,  NivelResponsabilidad.media));
			this.add(new Tripulante("11111111A", "Angela Merkel", false, new SimpleDateFormat("dd/MM/yyyy").parse("31/01/1995"), Pais.Alemania, ZonaBarco.Popa,  NivelResponsabilidad.media));
			this.add(new Tripulante("11111111A", "Angela Merkel", false, new SimpleDateFormat("dd/MM/yyyy").parse("31/01/1995"), Pais.Alemania, ZonaBarco.Popa,  NivelResponsabilidad.media));
			this.add(new Tripulante("11111111A", "Angela Merkel", false, new SimpleDateFormat("dd/MM/yyyy").parse("31/01/1995"), Pais.Alemania, ZonaBarco.Popa,  NivelResponsabilidad.media));
			this.add(new Tripulante("11111111A", "Angela Merkel", false, new SimpleDateFormat("dd/MM/yyyy").parse("31/01/1995"), Pais.Alemania, ZonaBarco.Popa,  NivelResponsabilidad.media));
			this.add(new Tripulante("11111111A", "Angela Merkel", false, new SimpleDateFormat("dd/MM/yyyy").parse("31/01/1995"), Pais.Alemania, ZonaBarco.Popa,  NivelResponsabilidad.media));
			this.add(new Tripulante("11111111A", "Angela Merkel", false, new SimpleDateFormat("dd/MM/yyyy").parse("31/01/1995"), Pais.Alemania, ZonaBarco.Popa,  NivelResponsabilidad.media));
			this.add(new Tripulante("11111111A", "Angela Merkel", false, new SimpleDateFormat("dd/MM/yyyy").parse("31/01/1995"), Pais.Alemania, ZonaBarco.Popa,  NivelResponsabilidad.media));
			this.add(new Tripulante("11111111A", "Angela Merkel", false, new SimpleDateFormat("dd/MM/yyyy").parse("31/01/1995"), Pais.Alemania, ZonaBarco.Popa,  NivelResponsabilidad.media));
			this.add(new Tripulante("11111111A", "Angela Merkel", false, new SimpleDateFormat("dd/MM/yyyy").parse("31/01/1995"), Pais.Alemania, ZonaBarco.Popa,  NivelResponsabilidad.media));
			this.add(new Tripulante("11111111A", "Angela Merkel", false, new SimpleDateFormat("dd/MM/yyyy").parse("31/01/1995"), Pais.Alemania, ZonaBarco.Popa,  NivelResponsabilidad.media));
			this.add(new Tripulante("11111111A", "Angela Merkel", false, new SimpleDateFormat("dd/MM/yyyy").parse("31/01/1995"), Pais.Alemania, ZonaBarco.Popa,  NivelResponsabilidad.media));
			this.add(new Tripulante("11111111A", "Angela Merkel", false, new SimpleDateFormat("dd/MM/yyyy").parse("31/01/1995"), Pais.Alemania, ZonaBarco.Popa,  NivelResponsabilidad.media));
			this.add(new Tripulante("11111111A", "Angela Merkel", false, new SimpleDateFormat("dd/MM/yyyy").parse("31/01/1995"), Pais.Alemania, ZonaBarco.Popa,  NivelResponsabilidad.media));
			this.add(new Tripulante("11111111A", "Angela Merkel", false, new SimpleDateFormat("dd/MM/yyyy").parse("31/01/1995"), Pais.Alemania, ZonaBarco.Popa,  NivelResponsabilidad.media));
			this.add(new Tripulante("11111111A", "Angela Merkel", false, new SimpleDateFormat("dd/MM/yyyy").parse("31/01/1995"), Pais.Alemania, ZonaBarco.Popa,  NivelResponsabilidad.muy_alta));
			
		} catch (ParseException e) {
			System.out.println("ERROR EN LOS DATOS\ne");
		}
	}
}
